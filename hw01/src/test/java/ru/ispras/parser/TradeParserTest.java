
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



    @Test
    public void testGood000() throws Exception {
        String fileAsString = this.file2String("tests/good/000.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-1861, result.getPrice());
    }
            

    @Test
    public void testGood001() throws Exception {
        String fileAsString = this.file2String("tests/good/001.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-960, result.getPrice());
    }
            

    @Test
    public void testGood002() throws Exception {
        String fileAsString = this.file2String("tests/good/002.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(39147.6426703, result.getPrice());
    }
            

    @Test
    public void testGood003() throws Exception {
        String fileAsString = this.file2String("tests/good/003.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(231405.166229, result.getPrice());
    }
            

    @Test
    public void testGood004() throws Exception {
        String fileAsString = this.file2String("tests/good/004.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(666, result.getPrice());
    }
            

    @Test
    public void testGood005() throws Exception {
        String fileAsString = this.file2String("tests/good/005.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(425884.770205, result.getPrice());
    }
            

    @Test
    public void testGood006() throws Exception {
        String fileAsString = this.file2String("tests/good/006.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(409852.736577, result.getPrice());
    }
            

    @Test
    public void testGood007() throws Exception {
        String fileAsString = this.file2String("tests/good/007.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(15091.1828157, result.getPrice());
    }
            

    @Test
    public void testGood008() throws Exception {
        String fileAsString = this.file2String("tests/good/008.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(199652.978636, result.getPrice());
    }
            

    @Test
    public void testGood009() throws Exception {
        String fileAsString = this.file2String("tests/good/009.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-30102.0725382, result.getPrice());
    }
            

    @Test
    public void testGood010() throws Exception {
        String fileAsString = this.file2String("tests/good/010.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-1139, result.getPrice());
    }
            

    @Test
    public void testGood011() throws Exception {
        String fileAsString = this.file2String("tests/good/011.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(111443.419768, result.getPrice());
    }
            

    @Test
    public void testGood012() throws Exception {
        String fileAsString = this.file2String("tests/good/012.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(66230.3751131, result.getPrice());
    }
            

    @Test
    public void testGood013() throws Exception {
        String fileAsString = this.file2String("tests/good/013.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(412393.680726, result.getPrice());
    }
            

    @Test
    public void testGood014() throws Exception {
        String fileAsString = this.file2String("tests/good/014.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(1981, result.getPrice());
    }
            

    @Test
    public void testGood015() throws Exception {
        String fileAsString = this.file2String("tests/good/015.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(213, result.getPrice());
    }
            

    @Test
    public void testGood016() throws Exception {
        String fileAsString = this.file2String("tests/good/016.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(647, result.getPrice());
    }
            

    @Test
    public void testGood017() throws Exception {
        String fileAsString = this.file2String("tests/good/017.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-529, result.getPrice());
    }
            

    @Test
    public void testGood018() throws Exception {
        String fileAsString = this.file2String("tests/good/018.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(159545.551945, result.getPrice());
    }
            

    @Test
    public void testGood019() throws Exception {
        String fileAsString = this.file2String("tests/good/019.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-31734.0107311, result.getPrice());
    }
            

    @Test
    public void testGood020() throws Exception {
        String fileAsString = this.file2String("tests/good/020.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-931, result.getPrice());
    }
            

    @Test
    public void testGood021() throws Exception {
        String fileAsString = this.file2String("tests/good/021.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(70934.4631343, result.getPrice());
    }
            

    @Test
    public void testGood022() throws Exception {
        String fileAsString = this.file2String("tests/good/022.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(168015.15329, result.getPrice());
    }
            

    @Test
    public void testGood023() throws Exception {
        String fileAsString = this.file2String("tests/good/023.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(40938.9186505, result.getPrice());
    }
            

    @Test
    public void testGood024() throws Exception {
        String fileAsString = this.file2String("tests/good/024.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1443, result.getPrice());
    }
            

    @Test
    public void testGood025() throws Exception {
        String fileAsString = this.file2String("tests/good/025.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-318, result.getPrice());
    }
            

    @Test
    public void testGood026() throws Exception {
        String fileAsString = this.file2String("tests/good/026.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(275113.195167, result.getPrice());
    }
            

    @Test
    public void testGood027() throws Exception {
        String fileAsString = this.file2String("tests/good/027.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(392044.201671, result.getPrice());
    }
            

    @Test
    public void testGood028() throws Exception {
        String fileAsString = this.file2String("tests/good/028.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1057, result.getPrice());
    }
            

    @Test
    public void testGood029() throws Exception {
        String fileAsString = this.file2String("tests/good/029.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(503, result.getPrice());
    }
            

    @Test
    public void testGood030() throws Exception {
        String fileAsString = this.file2String("tests/good/030.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(197931.955806, result.getPrice());
    }
            

    @Test
    public void testGood031() throws Exception {
        String fileAsString = this.file2String("tests/good/031.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(280147.173786, result.getPrice());
    }
            

    @Test
    public void testGood032() throws Exception {
        String fileAsString = this.file2String("tests/good/032.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-1428, result.getPrice());
    }
            

    @Test
    public void testGood033() throws Exception {
        String fileAsString = this.file2String("tests/good/033.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(247753.029778, result.getPrice());
    }
            

    @Test
    public void testGood034() throws Exception {
        String fileAsString = this.file2String("tests/good/034.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(201348.676797, result.getPrice());
    }
            

    @Test
    public void testGood035() throws Exception {
        String fileAsString = this.file2String("tests/good/035.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(366222.000226, result.getPrice());
    }
            

    @Test
    public void testGood036() throws Exception {
        String fileAsString = this.file2String("tests/good/036.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(695, result.getPrice());
    }
            

    @Test
    public void testGood037() throws Exception {
        String fileAsString = this.file2String("tests/good/037.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1341, result.getPrice());
    }
            

    @Test
    public void testGood038() throws Exception {
        String fileAsString = this.file2String("tests/good/038.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(326375.830886, result.getPrice());
    }
            

    @Test
    public void testGood039() throws Exception {
        String fileAsString = this.file2String("tests/good/039.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(350560.038309, result.getPrice());
    }
            

    @Test
    public void testGood040() throws Exception {
        String fileAsString = this.file2String("tests/good/040.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1224, result.getPrice());
    }
            

    @Test
    public void testGood041() throws Exception {
        String fileAsString = this.file2String("tests/good/041.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1765, result.getPrice());
    }
            

    @Test
    public void testGood042() throws Exception {
        String fileAsString = this.file2String("tests/good/042.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1329, result.getPrice());
    }
            

    @Test
    public void testGood043() throws Exception {
        String fileAsString = this.file2String("tests/good/043.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(73450.5436419, result.getPrice());
    }
            

    @Test
    public void testGood044() throws Exception {
        String fileAsString = this.file2String("tests/good/044.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(506, result.getPrice());
    }
            

    @Test
    public void testGood045() throws Exception {
        String fileAsString = this.file2String("tests/good/045.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1865, result.getPrice());
    }
            

    @Test
    public void testGood046() throws Exception {
        String fileAsString = this.file2String("tests/good/046.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(1829, result.getPrice());
    }
            

    @Test
    public void testGood047() throws Exception {
        String fileAsString = this.file2String("tests/good/047.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-1296, result.getPrice());
    }
            

    @Test
    public void testGood048() throws Exception {
        String fileAsString = this.file2String("tests/good/048.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(339911.293437, result.getPrice());
    }
            

    @Test
    public void testGood049() throws Exception {
        String fileAsString = this.file2String("tests/good/049.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(446048.845502, result.getPrice());
    }
            

    @Test
    public void testGood050() throws Exception {
        String fileAsString = this.file2String("tests/good/050.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(160896.239034, result.getPrice());
    }
            

    @Test
    public void testGood051() throws Exception {
        String fileAsString = this.file2String("tests/good/051.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(18503.9498436, result.getPrice());
    }
            

    @Test
    public void testGood052() throws Exception {
        String fileAsString = this.file2String("tests/good/052.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(336770.441322, result.getPrice());
    }
            

    @Test
    public void testGood053() throws Exception {
        String fileAsString = this.file2String("tests/good/053.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-898, result.getPrice());
    }
            

    @Test
    public void testGood054() throws Exception {
        String fileAsString = this.file2String("tests/good/054.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(736, result.getPrice());
    }
            

    @Test
    public void testGood055() throws Exception {
        String fileAsString = this.file2String("tests/good/055.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(179088.196565, result.getPrice());
    }
            

    @Test
    public void testGood056() throws Exception {
        String fileAsString = this.file2String("tests/good/056.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(405322.090225, result.getPrice());
    }
            

    @Test
    public void testGood057() throws Exception {
        String fileAsString = this.file2String("tests/good/057.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-911, result.getPrice());
    }
            

    @Test
    public void testGood058() throws Exception {
        String fileAsString = this.file2String("tests/good/058.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(1712, result.getPrice());
    }
            

    @Test
    public void testGood059() throws Exception {
        String fileAsString = this.file2String("tests/good/059.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(151578.366394, result.getPrice());
    }
            

    @Test
    public void testGood060() throws Exception {
        String fileAsString = this.file2String("tests/good/060.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(1187, result.getPrice());
    }
            

    @Test
    public void testGood061() throws Exception {
        String fileAsString = this.file2String("tests/good/061.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(499, result.getPrice());
    }
            

    @Test
    public void testGood062() throws Exception {
        String fileAsString = this.file2String("tests/good/062.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1909, result.getPrice());
    }
            

    @Test
    public void testGood063() throws Exception {
        String fileAsString = this.file2String("tests/good/063.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-214, result.getPrice());
    }
            

    @Test
    public void testGood064() throws Exception {
        String fileAsString = this.file2String("tests/good/064.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(47133.2389828, result.getPrice());
    }
            

    @Test
    public void testGood065() throws Exception {
        String fileAsString = this.file2String("tests/good/065.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(69646.0420041, result.getPrice());
    }
            

    @Test
    public void testGood066() throws Exception {
        String fileAsString = this.file2String("tests/good/066.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(302844.838312, result.getPrice());
    }
            

    @Test
    public void testGood067() throws Exception {
        String fileAsString = this.file2String("tests/good/067.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(431888.828646, result.getPrice());
    }
            

    @Test
    public void testGood068() throws Exception {
        String fileAsString = this.file2String("tests/good/068.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(410332.347597, result.getPrice());
    }
            

    @Test
    public void testGood069() throws Exception {
        String fileAsString = this.file2String("tests/good/069.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(372822.090012, result.getPrice());
    }
            

    @Test
    public void testGood070() throws Exception {
        String fileAsString = this.file2String("tests/good/070.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(194957.822636, result.getPrice());
    }
            

    @Test
    public void testGood071() throws Exception {
        String fileAsString = this.file2String("tests/good/071.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(351599.402974, result.getPrice());
    }
            

    @Test
    public void testGood072() throws Exception {
        String fileAsString = this.file2String("tests/good/072.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(392268.042154, result.getPrice());
    }
            

    @Test
    public void testGood073() throws Exception {
        String fileAsString = this.file2String("tests/good/073.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-318, result.getPrice());
    }
            

    @Test
    public void testGood074() throws Exception {
        String fileAsString = this.file2String("tests/good/074.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(220, result.getPrice());
    }
            

    @Test
    public void testGood075() throws Exception {
        String fileAsString = this.file2String("tests/good/075.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(182531.846367, result.getPrice());
    }
            

    @Test
    public void testGood076() throws Exception {
        String fileAsString = this.file2String("tests/good/076.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-2807.69812222, result.getPrice());
    }
            

    @Test
    public void testGood077() throws Exception {
        String fileAsString = this.file2String("tests/good/077.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(1362, result.getPrice());
    }
            

    @Test
    public void testGood078() throws Exception {
        String fileAsString = this.file2String("tests/good/078.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(1779, result.getPrice());
    }
            

    @Test
    public void testGood079() throws Exception {
        String fileAsString = this.file2String("tests/good/079.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1061, result.getPrice());
    }
            

    @Test
    public void testGood080() throws Exception {
        String fileAsString = this.file2String("tests/good/080.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(420036.442204, result.getPrice());
    }
            

    @Test
    public void testGood081() throws Exception {
        String fileAsString = this.file2String("tests/good/081.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(391629.631231, result.getPrice());
    }
            

    @Test
    public void testGood082() throws Exception {
        String fileAsString = this.file2String("tests/good/082.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(1918, result.getPrice());
    }
            

    @Test
    public void testGood083() throws Exception {
        String fileAsString = this.file2String("tests/good/083.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(309706.845909, result.getPrice());
    }
            

    @Test
    public void testGood084() throws Exception {
        String fileAsString = this.file2String("tests/good/084.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(983, result.getPrice());
    }
            

    @Test
    public void testGood085() throws Exception {
        String fileAsString = this.file2String("tests/good/085.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(482, result.getPrice());
    }
            

    @Test
    public void testGood086() throws Exception {
        String fileAsString = this.file2String("tests/good/086.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(323613.912634, result.getPrice());
    }
            

    @Test
    public void testGood087() throws Exception {
        String fileAsString = this.file2String("tests/good/087.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(236, result.getPrice());
    }
            

    @Test
    public void testGood088() throws Exception {
        String fileAsString = this.file2String("tests/good/088.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(58158.3568928, result.getPrice());
    }
            

    @Test
    public void testGood089() throws Exception {
        String fileAsString = this.file2String("tests/good/089.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(388, result.getPrice());
    }
            

    @Test
    public void testGood090() throws Exception {
        String fileAsString = this.file2String("tests/good/090.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1975, result.getPrice());
    }
            

    @Test
    public void testGood091() throws Exception {
        String fileAsString = this.file2String("tests/good/091.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(207139.824022, result.getPrice());
    }
            

    @Test
    public void testGood092() throws Exception {
        String fileAsString = this.file2String("tests/good/092.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1762, result.getPrice());
    }
            

    @Test
    public void testGood093() throws Exception {
        String fileAsString = this.file2String("tests/good/093.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(912, result.getPrice());
    }
            

    @Test
    public void testGood094() throws Exception {
        String fileAsString = this.file2String("tests/good/094.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(299321.548267, result.getPrice());
    }
            

    @Test
    public void testGood095() throws Exception {
        String fileAsString = this.file2String("tests/good/095.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1798, result.getPrice());
    }
            

    @Test
    public void testGood096() throws Exception {
        String fileAsString = this.file2String("tests/good/096.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(364163.610017, result.getPrice());
    }
            

    @Test
    public void testGood097() throws Exception {
        String fileAsString = this.file2String("tests/good/097.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(413, result.getPrice());
    }
            

    @Test
    public void testGood098() throws Exception {
        String fileAsString = this.file2String("tests/good/098.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1275, result.getPrice());
    }
            

    @Test
    public void testGood099() throws Exception {
        String fileAsString = this.file2String("tests/good/099.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-1837, result.getPrice());
    }
            

        }
    