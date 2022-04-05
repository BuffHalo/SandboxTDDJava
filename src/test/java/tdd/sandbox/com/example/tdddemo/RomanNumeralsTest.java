package tdd.sandbox.com.example.tdddemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest{
@Test
public void one(){
    Assert.assertEquals("1", "I", RomanNumerals.arabicToRoman(1));
    Assert.assertEquals("2", "II", RomanNumerals.arabicToRoman(2));
    Assert.assertEquals("3", "III", RomanNumerals.arabicToRoman(3));
    Assert.assertEquals("4", "IV", RomanNumerals.arabicToRoman(4));
    Assert.assertEquals("5", "V", RomanNumerals.arabicToRoman(5));
    Assert.assertEquals("6", "VI", RomanNumerals.arabicToRoman(6));
    Assert.assertEquals("7", "VII", RomanNumerals.arabicToRoman(7));
    Assert.assertEquals("8", "VIII", RomanNumerals.arabicToRoman(8));
    Assert.assertEquals("9", "IX", RomanNumerals.arabicToRoman(9));
    Assert.assertEquals("16", "XVI", RomanNumerals.arabicToRoman(16));
    Assert.assertEquals("126", "CXXVI", RomanNumerals.arabicToRoman(126));
}
}