import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;
public class ConverterTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void ifIntHigherThan3999ThrowException() {
        Exception exception= Assertions.assertThrows(Exception.class, () -> {
            Converter.intToRoman(4000);
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Argument should be between 0 and 3999", exception.getMessage());
    }

    @Test
    public void ifIntLowerThan0ThrowException() {
        Exception exception= Assertions.assertThrows(Exception.class, () -> {
            Converter.intToRoman(-1);
        });
        Assertions.assertSame(IllegalArgumentException.class, exception.getClass());
        Assertions.assertEquals("Argument should be between 0 and 3999", exception.getMessage());
    }

    @Test
    public void ifIntEquals3999ReturnMMMCMXCIX() {
        String str= Converter.intToRoman(3999);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("MMMCMXCIX", str);
    }

    @Test
    public void ifIntEquals1ReturnI() {
        String str= Converter.intToRoman(1);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("I", str);
    }

    @Test
    public void ifIntEquals2ReturnII() {
        String str= Converter.intToRoman(2);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("II", str);
    }

    @Test
    public void ifIntEquals3ReturnIII() {
        String str= Converter.intToRoman(3);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("III", str);
    }

    @Test
    public void ifIntEquals4ReturnIV() {
        String str= Converter.intToRoman(4);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("IV", str);
    }

    @Test
    public void ifIntEquals5ReturnV() {
        String str= Converter.intToRoman(5);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("V", str);
    }

    @Test
    public void ifIntEquals6ReturnVI() {
        String str= Converter.intToRoman(6);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("VI", str);
    }

    @Test
    public void ifIntEquals7ReturnVII() {
        String str= Converter.intToRoman(7);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("VII", str);
    }

    @Test
    public void ifIntEquals8ReturnVIII() {
        String str= Converter.intToRoman(8);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("VIII", str);
    }

    @Test
    public void ifIntEquals9ReturnIX() {
        String str= Converter.intToRoman(9);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("IX", str);
    }

    @Test
    public void ifIntEquals10ReturnX() {
        String str= Converter.intToRoman(10);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("X", str);
    }

    @Test
    public void ifIntEquals20ReturnXX() {
        String str= Converter.intToRoman(20);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("XX", str);
    }

    @Test
    public void ifIntEquals30ReturnXXX() {
        String str= Converter.intToRoman(30);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("XXX", str);
    }

    @Test
    public void ifIntEquals40ReturnXL() {
        String str= Converter.intToRoman(40);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("XL", str);
    }

    @Test
    public void ifIntEquals50ReturnL() {
        String str= Converter.intToRoman(50);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("L", str);
    }

    @Test
    public void ifIntEquals60ReturnLX() {
        String str= Converter.intToRoman(60);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("LX", str);
    }

    @Test
    public void ifIntEquals70ReturnLXX() {
        String str= Converter.intToRoman(70);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("LXX", str);
    }

    @Test
    public void ifIntEquals80ReturnLXXX() {
        String str= Converter.intToRoman(80);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("LXXX", str);
    }

    @Test
    public void ifIntEquals90ReturnXC() {
        String str= Converter.intToRoman(90);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("XC", str);
    }

    @Test
    public void ifIntEquals100ReturnC() {
        String str= Converter.intToRoman(100);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("C", str);
    }

    @Test
    public void ifIntEquals200ReturnICC() {
        String str= Converter.intToRoman(200);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("CC", str);
    }

    @Test
    public void ifIntEquals300ReturnCCC() {
        String str= Converter.intToRoman(300);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("CCC", str);
    }

    @Test
    public void ifIntEquals400ReturnCD() {
        String str= Converter.intToRoman(400);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("CD", str);
    }

    @Test
    public void ifIntEquals500ReturnD() {
        String str= Converter.intToRoman(500);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("D", str);
    }

    @Test
    public void ifIntEquals600ReturnDC() {
        String str= Converter.intToRoman(600);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("DC", str);
    }

    @Test
    public void ifIntEquals700ReturnDCC() {
        String str= Converter.intToRoman(700);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("DCC", str);
    }

    @Test
    public void ifIntEquals800ReturnDCCC() {
        String str= Converter.intToRoman(800);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("DCCC", str);
    }

    @Test
    public void ifIntEquals900ReturnCM() {
        String str= Converter.intToRoman(900);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("CM", str);
    }

    @Test
    public void ifIntEquals1000ReturnM() {
        String str= Converter.intToRoman(1000);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("M", str);
    }

    @Test
    public void ifIntEquals2000ReturnMM() {
        String str= Converter.intToRoman(2000);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("MM", str);
    }

    @Test
    public void ifIntEquals3000ReturnMMM() {
        String str= Converter.intToRoman(3000);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("MMM", str);
    }

    @Test
    public void ifIntEquals3888ReturnMMMDCCCLXXXVIII() {
        String str= Converter.intToRoman(3888);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("MMMDCCCLXXXVIII", str);
    }

    @Test
    public void ifIntEquals1234ReturnMCCXXXIV() {
        String str= Converter.intToRoman(1234);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("MCCXXXIV", str);
    }

    @Test
    public void ifIntEquals657ReturnDCLVII() {
        String str= Converter.intToRoman(657);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("DCLVII", str);
    }

    @Test
    public void ifIntEquals3018ReturnMMMXVIII() {
        String str= Converter.intToRoman(3018);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("MMMXVIII", str);
    }

    @Test
    public void ifIntEquals888ReturnMMMDCCCLXXXVIII() {
        String str= Converter.intToRoman(888);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("DCCCLXXXVIII", str);
    }

    @Test
    public void ifIntEquals923ReturnCMXXIII() {
        String str= Converter.intToRoman(923);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("CMXXIII", str);
    }

    @Test
    public void ifIntEquals23ReturnXXIII() {
        String str= Converter.intToRoman(23);
        Assertions.assertSame(str.getClass(), String.class);
        Assertions.assertEquals("XXIII", str);
    }
}