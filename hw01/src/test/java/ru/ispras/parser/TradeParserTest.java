
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
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(172395.073138, result.getPrice());
    }
            

    @Test
    public void testGood001() throws Exception {
        String fileAsString = this.file2String("tests/good/001.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-1919, result.getPrice());
    }
            

    @Test
    public void testGood002() throws Exception {
        String fileAsString = this.file2String("tests/good/002.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-546, result.getPrice());
    }
            

    @Test
    public void testGood003() throws Exception {
        String fileAsString = this.file2String("tests/good/003.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-1230, result.getPrice());
    }
            

    @Test
    public void testGood004() throws Exception {
        String fileAsString = this.file2String("tests/good/004.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-352, result.getPrice());
    }
            

    @Test
    public void testGood005() throws Exception {
        String fileAsString = this.file2String("tests/good/005.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-626, result.getPrice());
    }
            

    @Test
    public void testGood006() throws Exception {
        String fileAsString = this.file2String("tests/good/006.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(468, result.getPrice());
    }
            

    @Test
    public void testGood007() throws Exception {
        String fileAsString = this.file2String("tests/good/007.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(840, result.getPrice());
    }
            

    @Test
    public void testGood008() throws Exception {
        String fileAsString = this.file2String("tests/good/008.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(199117.019754, result.getPrice());
    }
            

    @Test
    public void testGood009() throws Exception {
        String fileAsString = this.file2String("tests/good/009.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1275, result.getPrice());
    }
            

    @Test
    public void testGood010() throws Exception {
        String fileAsString = this.file2String("tests/good/010.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-435, result.getPrice());
    }
            

    @Test
    public void testGood011() throws Exception {
        String fileAsString = this.file2String("tests/good/011.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1722, result.getPrice());
    }
            

    @Test
    public void testGood012() throws Exception {
        String fileAsString = this.file2String("tests/good/012.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(320481.566261, result.getPrice());
    }
            

    @Test
    public void testGood013() throws Exception {
        String fileAsString = this.file2String("tests/good/013.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(239522.695811, result.getPrice());
    }
            

    @Test
    public void testGood014() throws Exception {
        String fileAsString = this.file2String("tests/good/014.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1456, result.getPrice());
    }
            

    @Test
    public void testGood015() throws Exception {
        String fileAsString = this.file2String("tests/good/015.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(330732.853852, result.getPrice());
    }
            

    @Test
    public void testGood016() throws Exception {
        String fileAsString = this.file2String("tests/good/016.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-608, result.getPrice());
    }
            

    @Test
    public void testGood017() throws Exception {
        String fileAsString = this.file2String("tests/good/017.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(137173.522319, result.getPrice());
    }
            

    @Test
    public void testGood018() throws Exception {
        String fileAsString = this.file2String("tests/good/018.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(426256.001124, result.getPrice());
    }
            

    @Test
    public void testGood019() throws Exception {
        String fileAsString = this.file2String("tests/good/019.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(180686.41541, result.getPrice());
    }
            

    @Test
    public void testGood020() throws Exception {
        String fileAsString = this.file2String("tests/good/020.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(1510, result.getPrice());
    }
            

    @Test
    public void testGood021() throws Exception {
        String fileAsString = this.file2String("tests/good/021.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(444116.906425, result.getPrice());
    }
            

    @Test
    public void testGood022() throws Exception {
        String fileAsString = this.file2String("tests/good/022.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(299098.716457, result.getPrice());
    }
            

    @Test
    public void testGood023() throws Exception {
        String fileAsString = this.file2String("tests/good/023.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(213457.302216, result.getPrice());
    }
            

    @Test
    public void testGood024() throws Exception {
        String fileAsString = this.file2String("tests/good/024.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(263335.960492, result.getPrice());
    }
            

    @Test
    public void testGood025() throws Exception {
        String fileAsString = this.file2String("tests/good/025.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(105881.71906, result.getPrice());
    }
            

    @Test
    public void testGood026() throws Exception {
        String fileAsString = this.file2String("tests/good/026.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(27091.9322068, result.getPrice());
    }
            

    @Test
    public void testGood027() throws Exception {
        String fileAsString = this.file2String("tests/good/027.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-1048, result.getPrice());
    }
            

    @Test
    public void testGood028() throws Exception {
        String fileAsString = this.file2String("tests/good/028.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(92, result.getPrice());
    }
            

    @Test
    public void testGood029() throws Exception {
        String fileAsString = this.file2String("tests/good/029.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-1441, result.getPrice());
    }
            

    @Test
    public void testGood030() throws Exception {
        String fileAsString = this.file2String("tests/good/030.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(732, result.getPrice());
    }
            

    @Test
    public void testGood031() throws Exception {
        String fileAsString = this.file2String("tests/good/031.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1022, result.getPrice());
    }
            

    @Test
    public void testGood032() throws Exception {
        String fileAsString = this.file2String("tests/good/032.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(1943, result.getPrice());
    }
            

    @Test
    public void testGood033() throws Exception {
        String fileAsString = this.file2String("tests/good/033.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(297888.723551, result.getPrice());
    }
            

    @Test
    public void testGood034() throws Exception {
        String fileAsString = this.file2String("tests/good/034.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(441, result.getPrice());
    }
            

    @Test
    public void testGood035() throws Exception {
        String fileAsString = this.file2String("tests/good/035.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-1797, result.getPrice());
    }
            

    @Test
    public void testGood036() throws Exception {
        String fileAsString = this.file2String("tests/good/036.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(-180, result.getPrice());
    }
            

    @Test
    public void testGood037() throws Exception {
        String fileAsString = this.file2String("tests/good/037.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-18936.2994075, result.getPrice());
    }
            

    @Test
    public void testGood038() throws Exception {
        String fileAsString = this.file2String("tests/good/038.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-74, result.getPrice());
    }
            

    @Test
    public void testGood039() throws Exception {
        String fileAsString = this.file2String("tests/good/039.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(428299.021088, result.getPrice());
    }
            

    @Test
    public void testGood040() throws Exception {
        String fileAsString = this.file2String("tests/good/040.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(1920, result.getPrice());
    }
            

    @Test
    public void testGood041() throws Exception {
        String fileAsString = this.file2String("tests/good/041.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(350754.667069, result.getPrice());
    }
            

    @Test
    public void testGood042() throws Exception {
        String fileAsString = this.file2String("tests/good/042.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(241461.038858, result.getPrice());
    }
            

    @Test
    public void testGood043() throws Exception {
        String fileAsString = this.file2String("tests/good/043.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(65207.5349511, result.getPrice());
    }
            

    @Test
    public void testGood044() throws Exception {
        String fileAsString = this.file2String("tests/good/044.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-799, result.getPrice());
    }
            

    @Test
    public void testGood045() throws Exception {
        String fileAsString = this.file2String("tests/good/045.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(351312.821361, result.getPrice());
    }
            

    @Test
    public void testGood046() throws Exception {
        String fileAsString = this.file2String("tests/good/046.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(240330.829387, result.getPrice());
    }
            

    @Test
    public void testGood047() throws Exception {
        String fileAsString = this.file2String("tests/good/047.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(144296.430515, result.getPrice());
    }
            

    @Test
    public void testGood048() throws Exception {
        String fileAsString = this.file2String("tests/good/048.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(437598.654339, result.getPrice());
    }
            

    @Test
    public void testGood049() throws Exception {
        String fileAsString = this.file2String("tests/good/049.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(386583.530579, result.getPrice());
    }
            

    @Test
    public void testGood050() throws Exception {
        String fileAsString = this.file2String("tests/good/050.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(540, result.getPrice());
    }
            

    @Test
    public void testGood051() throws Exception {
        String fileAsString = this.file2String("tests/good/051.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(296, result.getPrice());
    }
            

    @Test
    public void testGood052() throws Exception {
        String fileAsString = this.file2String("tests/good/052.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(136481.987266, result.getPrice());
    }
            

    @Test
    public void testGood053() throws Exception {
        String fileAsString = this.file2String("tests/good/053.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(315104.368332, result.getPrice());
    }
            

    @Test
    public void testGood054() throws Exception {
        String fileAsString = this.file2String("tests/good/054.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(1734, result.getPrice());
    }
            

    @Test
    public void testGood055() throws Exception {
        String fileAsString = this.file2String("tests/good/055.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(193047.011683, result.getPrice());
    }
            

    @Test
    public void testGood056() throws Exception {
        String fileAsString = this.file2String("tests/good/056.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1553, result.getPrice());
    }
            

    @Test
    public void testGood057() throws Exception {
        String fileAsString = this.file2String("tests/good/057.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(654, result.getPrice());
    }
            

    @Test
    public void testGood058() throws Exception {
        String fileAsString = this.file2String("tests/good/058.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(286885.895, result.getPrice());
    }
            

    @Test
    public void testGood059() throws Exception {
        String fileAsString = this.file2String("tests/good/059.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(1601, result.getPrice());
    }
            

    @Test
    public void testGood060() throws Exception {
        String fileAsString = this.file2String("tests/good/060.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-1893, result.getPrice());
    }
            

    @Test
    public void testGood061() throws Exception {
        String fileAsString = this.file2String("tests/good/061.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(202135.601928, result.getPrice());
    }
            

    @Test
    public void testGood062() throws Exception {
        String fileAsString = this.file2String("tests/good/062.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(125375.414247, result.getPrice());
    }
            

    @Test
    public void testGood063() throws Exception {
        String fileAsString = this.file2String("tests/good/063.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(1, result.getPrice());
    }
            

    @Test
    public void testGood064() throws Exception {
        String fileAsString = this.file2String("tests/good/064.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(1341, result.getPrice());
    }
            

    @Test
    public void testGood065() throws Exception {
        String fileAsString = this.file2String("tests/good/065.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-1499, result.getPrice());
    }
            

    @Test
    public void testGood066() throws Exception {
        String fileAsString = this.file2String("tests/good/066.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(-21017.8049013, result.getPrice());
    }
            

    @Test
    public void testGood067() throws Exception {
        String fileAsString = this.file2String("tests/good/067.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(426154.557475, result.getPrice());
    }
            

    @Test
    public void testGood068() throws Exception {
        String fileAsString = this.file2String("tests/good/068.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(64889.6076134, result.getPrice());
    }
            

    @Test
    public void testGood069() throws Exception {
        String fileAsString = this.file2String("tests/good/069.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(208786.823004, result.getPrice());
    }
            

    @Test
    public void testGood070() throws Exception {
        String fileAsString = this.file2String("tests/good/070.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(94491.2745468, result.getPrice());
    }
            

    @Test
    public void testGood071() throws Exception {
        String fileAsString = this.file2String("tests/good/071.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(84507.6735452, result.getPrice());
    }
            

    @Test
    public void testGood072() throws Exception {
        String fileAsString = this.file2String("tests/good/072.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(243, result.getPrice());
    }
            

    @Test
    public void testGood073() throws Exception {
        String fileAsString = this.file2String("tests/good/073.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(344554.253808, result.getPrice());
    }
            

    @Test
    public void testGood074() throws Exception {
        String fileAsString = this.file2String("tests/good/074.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(50984.6563503, result.getPrice());
    }
            

    @Test
    public void testGood075() throws Exception {
        String fileAsString = this.file2String("tests/good/075.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(272292.942182, result.getPrice());
    }
            

    @Test
    public void testGood076() throws Exception {
        String fileAsString = this.file2String("tests/good/076.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(2381.07148045, result.getPrice());
    }
            

    @Test
    public void testGood077() throws Exception {
        String fileAsString = this.file2String("tests/good/077.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(547, result.getPrice());
    }
            

    @Test
    public void testGood078() throws Exception {
        String fileAsString = this.file2String("tests/good/078.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1994, result.getPrice());
    }
            

    @Test
    public void testGood079() throws Exception {
        String fileAsString = this.file2String("tests/good/079.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(434252.040231, result.getPrice());
    }
            

    @Test
    public void testGood080() throws Exception {
        String fileAsString = this.file2String("tests/good/080.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1482, result.getPrice());
    }
            

    @Test
    public void testGood081() throws Exception {
        String fileAsString = this.file2String("tests/good/081.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(1248, result.getPrice());
    }
            

    @Test
    public void testGood082() throws Exception {
        String fileAsString = this.file2String("tests/good/082.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-1163, result.getPrice());
    }
            

    @Test
    public void testGood083() throws Exception {
        String fileAsString = this.file2String("tests/good/083.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-1628, result.getPrice());
    }
            

    @Test
    public void testGood084() throws Exception {
        String fileAsString = this.file2String("tests/good/084.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof CommoditySpot);
        assertEquals(88431.7232449, result.getPrice());
    }
            

    @Test
    public void testGood085() throws Exception {
        String fileAsString = this.file2String("tests/good/085.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(147134.779783, result.getPrice());
    }
            

    @Test
    public void testGood086() throws Exception {
        String fileAsString = this.file2String("tests/good/086.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(385575.638252, result.getPrice());
    }
            

    @Test
    public void testGood087() throws Exception {
        String fileAsString = this.file2String("tests/good/087.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(154724.256553, result.getPrice());
    }
            

    @Test
    public void testGood088() throws Exception {
        String fileAsString = this.file2String("tests/good/088.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(36843.2198989, result.getPrice());
    }
            

    @Test
    public void testGood089() throws Exception {
        String fileAsString = this.file2String("tests/good/089.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(351, result.getPrice());
    }
            

    @Test
    public void testGood090() throws Exception {
        String fileAsString = this.file2String("tests/good/090.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(300, result.getPrice());
    }
            

    @Test
    public void testGood091() throws Exception {
        String fileAsString = this.file2String("tests/good/091.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(446412.228137, result.getPrice());
    }
            

    @Test
    public void testGood092() throws Exception {
        String fileAsString = this.file2String("tests/good/092.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(353673.37099, result.getPrice());
    }
            

    @Test
    public void testGood093() throws Exception {
        String fileAsString = this.file2String("tests/good/093.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(441822.928235, result.getPrice());
    }
            

    @Test
    public void testGood094() throws Exception {
        String fileAsString = this.file2String("tests/good/094.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(158004.103383, result.getPrice());
    }
            

    @Test
    public void testGood095() throws Exception {
        String fileAsString = this.file2String("tests/good/095.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(-9699.58956917, result.getPrice());
    }
            

    @Test
    public void testGood096() throws Exception {
        String fileAsString = this.file2String("tests/good/096.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof IrSwap);
        assertEquals(1273, result.getPrice());
    }
            

    @Test
    public void testGood097() throws Exception {
        String fileAsString = this.file2String("tests/good/097.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof Bond);
        assertEquals(366620.739983, result.getPrice());
    }
            

    @Test
    public void testGood098() throws Exception {
        String fileAsString = this.file2String("tests/good/098.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(321953.690313, result.getPrice());
    }
            

    @Test
    public void testGood099() throws Exception {
        String fileAsString = this.file2String("tests/good/099.txt");
        TradeParser parser = new TradeParser(fileAsString);
        Trade result = parser.parse();
        assertTrue("Type OK", result instanceof FxSpot);
        assertEquals(-1890, result.getPrice());
    }
            

        }
    