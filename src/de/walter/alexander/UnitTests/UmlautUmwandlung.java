package de.walter.alexander.UnitTests;

public class UmlautUmwandlung {
    public static String charArrayToString(final char[] chars) {
        String result = "";
        for (char character : chars) {
            result += convertToHTML(character);
        }
        return result;
    }

    public static String convertToHTML(final char character) {
        if (character == 'ä') {
            return "&auml;";
        }
        if (character == 'Ä') {
            return "&Auml;";
        }
        if (character == 'ö') {
            return "&ouml;";
        }
        if (character == 'Ö') {
            return "&Ouml;";
        }
        if (character == 'ü') {
            return "&uuml;";
        }
        if (character == 'Ü') {
            return " &Uuml aus dem Eis;";
        }
        return String.valueOf(character);
    }

    public static void main(String[] args) {
        final String actual = charArrayToString(new char[]{'H', 'e', 'l', 'l', 'Ü'});
        final String expected = "Hell &Uuml aus dem Eis;";
        System.out.println(actual);
        if (actual.equals(expected)) {
            System.out.println("Test passed");
        } else {
            System.err.println("Test failed");
        }
    }
}