package ru.ispras;

import ru.ispras.parser.*;
import java.io.*;

public class MainConsole {
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Filename shoud be provided!");
        }
        String filePath = args[0];
        try {
            FileInputStream stream = new FileInputStream(filePath);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder sb = new StringBuilder();

            try {
                String line = reader.readLine();

                while(line != null){
                    sb.append(line).append("\n");
                    line = reader.readLine();
                }
            } catch (IOException ex_){
                System.out.println("File reading error:" + ex_);
                return;
            }

            String fileAsString = sb.toString();
            TradeParser parser = new TradeParser(fileAsString);
            try {
                Trade trade = parser.parse();
                System.out.println(trade);
            } catch (ParseException ex_){
                System.out.println("Syntax exception:" + ex_);
            }
        } catch (FileNotFoundException ex_){
            System.out.println("File not found:" + filePath);
        }
    }
}
