package de.walter.alexander.UnitTests;

public class UnitTests {
    public static String charArrayToString(final char[] chars){
        String result = "";
        for (char character: chars) {
            result += character;
        }
        return result;
    }
    public static void main(String[] args) {
        final String actual = charArrayToString(new char[]{'H', 'e', 'l', 'l', 'o'});
        final String expected = "Hello";
        if(actual.equals(expected)){
            System.out.println("Test passed");
        } else {
            System.err.println("Test failed");
        }
    }
}
