public class StringMethods{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "hello, world!";
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };

        System.out.println("charAt(1): " + str.charAt(1));
        System.out.println("codePointAt(1): " + str.codePointAt(1));
        System.out.println("codePointBefore(1): " + str.codePointBefore(1));
        System.out.println("codePointCount(0, str.length()): " + str.codePointCount(0, str.length()));
        System.out.println("compareTo(str2): " + str.compareTo(str2));
        System.out.println("compareToIgnoreCase(str2): " + str.compareToIgnoreCase(str2));
        System.out.println("concat: " + str.concat(" Welcome!"));
        System.out.println("contains('World'): " + str.contains("World"));
        System.out.println("contentEquals('Hello, World!'): " + str.contentEquals("Hello, World!"));
        System.out.println("copyValueOf(charArray): " + String.copyValueOf(charArray));
        System.out.println("endsWith('!'): " + str.endsWith("!"));
        System.out.println("equals(str2): " + str.equals(str2));
        System.out.println("equalsIgnoreCase(str2): " + str.equalsIgnoreCase(str2));
        System.out.println("format: " + String.format("My name is %s and age is %d", "John", 25));

        byte[] bytes = str.getBytes();
        System.out.println("getBytes: " + new String(bytes));
        char[] chars = new char[5];
        str.getChars(0, 5, chars, 0);

        System.out.println("getChars: " + new String(chars));
        System.out.println("hashCode: " + str.hashCode());
        System.out.println("indexOf('o'): " + str.indexOf('o'));
        System.out.println("intern: " + str.intern());
        System.out.println("isEmpty: " + str.isEmpty());
        System.out.println("lastIndexOf('o'): " + str.lastIndexOf('o'));
        System.out.println("length: " + str.length());
        System.out.println("matches(\".*World.*\"): " + str.matches(".*World.*"));
        System.out.println("offsetByCodePoints(0, 4): " + str.offsetByCodePoints(0, 4));
        System.out.println("regionMatches: " + str.regionMatches(0, "Hello", 0, 5));
        System.out.println("replace('o', 'O'): " + str.replace('o', 'O'));
        System.out.println("replaceFirst(\"World\",\"Universe\"): "
                +str.replaceFirst("World","Universe"));
        System.out.println("replaceAll(\"o\", \"O\"): " + str.replaceAll("o", "O"));

        String[] splitArray = str.split(",");
        System.out.println("split: ");
        for (String s : splitArray) {
            System.out.println(s);
        }

        System.out.println("startsWith('H'): " + str.startsWith("H"));
        System.out.println("subSequence(0, 5): " + str.subSequence(0, 5));
        System.out.println("substring(0, 5): " + str.substring(0, 5));

        char[] charArrayFromStr = str.toCharArray();
        System.out.println("toCharArray: ");
        for (char c : charArrayFromStr) {
            System.out.print(c + " ");
        }

        System.out.println("\ntoLowerCase: " + str.toLowerCase());
        System.out.println("toString: " + str.toString());
        System.out.println("toUpperCase: " + str.toUpperCase());
        System.out.println("trim: " + "   Hello World   ".trim());
        System.out.println("valueOf(123): " + String.valueOf(123));
    }
}
