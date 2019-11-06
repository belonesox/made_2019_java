#!/usr/bin/env python
# -*- coding: utf-8 -*-
# pylint: disable=W0107, C0330, C0301, W0621, E1101
'''
Генератор тестов. Проще написать на python
'''
from __future__ import print_function
from functools import update_wrapper
import sys
import subprocess
import random
import math
import errno
import os

CANONICAL_TEMPLATE = """
Trade: {{ 
    “type”: {typeValue},
    “price”: {priceValue}
}}
"""

PARSER_TEST_CLASS_LINES = [r"""
package ru.ispras.parser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.ispras.*;
import java.math.*;

public class TradeParserTest {
//    @Before
//    public void setUp() throws Exception {
//        // Ничего не делаем, каждый раз поднимаем парсер снова. Он не реюзабл.
//    }

    // Файл в строку
    private String file2String(String filePath) throws Exception {
        FileInputStream stream = new FileInputStream(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        StringBuilder sb = new StringBuilder();

        String line = reader.readLine();

        while(line != null){
            sb.append(line).append("\n");
            line = reader.readLine();
        }

        String fileAsString = sb.toString();
        return fileAsString;
    }

"""]


FOREX_TYPES = ["FX_SPOT", "BOND", "COMMODITY_SPOT", "IR_SWAP"]


def underscore_to_camelcase(value):
    def camelcase(): 
        # yield str.lower
        while True:
            yield str.capitalize

    c = camelcase()
    return "".join(c.next()(x) if x else '_' for x in value.split("_"))

def generate_tests():
    for i in range(100):
        typeValue = random.choice(FOREX_TYPES)
        expected_class = underscore_to_camelcase(typeValue)
        filename = "good/%03d.txt" % i
        priceValue = random.choice([    random.uniform(-34567.45, 454567.45), 
                                        random.randint(-2000, 2000)])
        text_ = CANONICAL_TEMPLATE.format(**vars())
        dir_ = os.path.split(filename)[0]
        if not os.path.exists(dir_):
            os.mkdir(dir_)
        with open(filename, 'w') as file_:
            file_.write(text_)
            priceValueS = str(priceValue)
            PARSER_TEST_CLASS_LINES.append(r"""
    @Test
    public void testGood%(i)03d() throws Exception {
        String fileAsString = this.file2String("tests/%(filename)s");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof %(expected_class)s);
        assertEquals(%(priceValueS)s, result.getPrice());
    }
            """ % vars())
    PARSER_TEST_CLASS_LINES.append("""
        }
    """)            
    with open("../src/test/java/ru/ispras/parser/TradeParserTest.java", 'w') as file_:
        file_.write("\n".join(PARSER_TEST_CLASS_LINES))

if __name__ == "__main__":
    generate_tests()
    pass
