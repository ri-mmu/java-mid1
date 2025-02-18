package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "   Java Programming  ";

        System.out.println(strWithSpaces.toLowerCase());
        System.out.println(strWithSpaces.toUpperCase());

        System.out.println(strWithSpaces.trim() + "'");
        System.out.println(strWithSpaces.strip() + "'");
        System.out.println(strWithSpaces.stripLeading() + "'");
        System.out.println(strWithSpaces.stripTrailing() + "'");
    }
}
