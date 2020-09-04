package com.chutiyapa.utility;


import org.junit.Assert;
import org.junit.Test;

public class StringToInputTest {

    @Test
    public void itShouldTestGetInputPixelData(){

        String inputString = "* * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n" +
                "*       *   *                           *               *\n" +
                "* * *   *   *   *   * * * * * * * * *   *   * * *   *   *\n" +
                "*   *   *   *   *   *               *   *   *       *   *\n" +
                "*   *   *       *   *   * * * * *   *   *   * * *   *   *\n" +
                "*   *   *   *   *   *   *   *   *   *   *   *       *   *\n" +
                "*   *   * * * * *   *   *   *   *   *   *   * * *   *   *\n" +
                "*   *               *   *       *   *   *           *   *\n" +
                "*   * * * * * * * * *   *   * * *   *   * * * * *   *   *\n" +
                "*       *               *   *                   *   *   *\n" +
                "* * *   * * * * * * *   *   *   * * * * * * * * *   *   *\n" +
                "*   *   *               *   *                   *   *   *\n" +
                "*   *   *   *   * * *   *   * * * * * * * * *   *   *   *\n" +
                "*   *   *   *   *   *   *   *                   *   *   *\n" +
                "*   *   *   *   * * *   *   *   * * * * * * * * *   *   *\n" +
                "*   *   *   *               *   *               *   *   *\n" +
                "*   *   * * * * * * * * *   * * *   *   * * * * *   *   *\n" +
                "*   *                           *   *   *               *\n" +
                "*   *   * * * * * * * * * * * * *   *   *   * * * * * * *\n" +
                "*   *                           *   *   *   *           *\n" +
                "*   * * * * * * * * * * * * *   *   *   *   *   * * *   *\n" +
                "*                               *   *   *   *   *   *   *\n" +
                "* * *   *   *   * * * * * * * * *   *   *   *   *   *   *\n" +
                "*   *   *   *   *                   *   *           *   *\n" +
                "*   *   *   *   *   * * * * * * * * *   * * * * * * *   *\n" +
                "*   *   *                           *                   *\n" +
                "*   * * * * * * * * * * * * * * *   * * * * * * * * *   *\n" +
                "*                                                   *   *\n" +
                "* * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
        StringToInput input = new StringToInput( inputString);
        Assert.assertTrue(null == input.getInputPixelData());
    }
}
