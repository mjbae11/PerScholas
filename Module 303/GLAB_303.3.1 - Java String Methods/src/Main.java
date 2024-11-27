import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
//        lengthMethod();
//        isEmptyMethod();
//        trimMethod();
//        toLowerCaseMethod();
//        toUpperCaseMethod();
//        concatMethod();
//        splitMethod();
//        charAtMethod();
//        compareToMethod();
//        subStringMethod();
//        indexOfMethod();
//        containsMethod();
//        replaceMethod();
//        replaceAllMethod();
//        equalsMethod();
//        equalsReferenceMethod();
//        compareToStringsMethod();
    }

    private static void compareToStringsMethod()
    {
        // compareTo() compares lexographically, and returns a negative, positve, or 0.
        String s1 = "Perscholas";
        String s2 = "Perscho";
        System.out.println(s1.compareTo(s2)); // positive number because s1 has more characters, therefore greater
    }

    private static void equalsReferenceMethod()
    {
        // == compares for references are the same, not values
        String s1 = "Perscholas";
        String s2 = new String("Perscholas");
        System.out.println(s1 == s2); // false, because s2 is created in the non-pool
    }

    private static void equalsMethod()
    {
        // Checks if the values of the Strings are the same.
        String s1 = "PerScholas";
        String s2 = "PerScholas";
        System.out.println(s1.equals(s2)); // true
    }


    private static void replaceAllMethod()
    {
        // replaceAll() replaces each substring that matches the regEx
        // Syntax: replaceAll(regEx, String);
        String str1 = "Java123is456fun";

        // replace all numeric digits with space
        System.out.println("Replace numbers with space: " + str1.replaceAll("\\d+", " "));
        // deletes all the numbers and replaces them with spaces instead
    }


    private static void replaceMethod()
    {
        // replace a char or a set of characters
        // .replace(old , new)
        String str1 = "abc cba";

        // replace all occurences of 'a' with 'z'
        System.out.println("Replace 'a' with 'z': " + str1.replace('a','z'));

        // replace 'L' with 'J'
        System.out.println("Replace 'b' with 'Z': " + str1.replace('b', 'Z'));

        // character that is not in the string
        System.out.println("Replace '4' with 'J': " + "Hello".replace('4', 'J'));

        // all occurences of "C++" replaced with "Java"
        System.out.println("Replace all of \"C++\" with \"Java\": " + str1.replace("C++", "Java"));
        // no occurences, so doesn't do anything

        // if the substring to be replaced is not in the string, replace() returns the original string.
    }

    private static void containsMethod()
    {
        // contains method, checks if a sequence of characters are present in the string
        String str1 = "Learn Java";
        Boolean result;

        result = str1.contains("Java");
        System.out.println("Contains \"Java\": " + result);

        result = str1.contains("Python");
        System.out.println("Contains \"Python\": " + result);

        result = str1.contains("");
        System.out.println("Contains \"\": " + result);
    }

    private static void indexOfMethod()
    {
        // get index of a character.
        // case sensitive

        String str1 = "Java is fun";
        int result;

        // get index of character 's'
        result = str1.indexOf('s');
        System.out.println("Index of char 's': " + result);

        // get index of char j
        result = str1.lastIndexOf('a');
        System.out.println("Last index of 'a': " + result);

        // get index of substring ava
        // gives the first index of where it starts
        result = str1.indexOf("ava");
        System.out.println("Index of substring \"ava\": " + result);
    }

    private static void subStringMethod()
    {
        String str1 = "java is fun";
        // extract substring from index 0 to 3
        System.out.println(str1.substring(0,3));
        // only gets "jav" because the end index is index - 1.
    }

    private static void compareToMethod()
    {
        // compares strings, if its greater or lesser or equal lexographically, return positive, negative or equal accordingly
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "flag";
        System.out.println("hello to hello: " + s1.compareTo(s2));
        System.out.println("hello to hemlo: " + s2.compareTo(s3));
        System.out.println("hemlo to flag: " +s3.compareTo(s4));
    }

    private static void charAtMethod()
    {
        // gets the character of a specific index within the string
        String message = "Welcome to Java";
        System.out.println("the first character of the message is at Index: " + message.charAt(0));
    }

    private static void splitMethod()
    {
        // split() method uses regEx to figure out how to split the string into an array of substrings
        // in this example I split with `::` within the string, taking those out and placing the substrings in an array of Strings

        String vowels = "a::e::i::o::u::A::E::I::O::U::Something Random";
        System.out.println("Result: " + Arrays.toString(vowels.split("::")));
    }

    private static void concatMethod()
    {
        // Concat method
        // Same as `+` to concat strings
        // string class also provides a concat method
        String s1 = "Learn ";
        String s2 = "Java";
        System.out.println(s1.concat(s2));
        // or
        System.out.println(s1 + s2);
        // Same thing!
    }

    private static void toUpperCaseMethod()
    {
        // to upper case of all the string characters.
        String s1 = "hello how are YOU";
        System.out.println(s1.toUpperCase());
    }

    private static void toLowerCaseMethod()
    {
        // to lowercase changes the characters of the string ot lowercase
        String s1 = "HELLO HOW Are You?";
        System.out.println(s1.toLowerCase());
    }

    private static void trimMethod()
    {
        // `.trim()` method removes leading and trailing spaces
        // checks the unicode value of the space character, (`\u0020`) before and after the string
        String s1 = "   hello     ";
        System.out.println(s1 + "how are you"); // without trim
        System.out.println(s1.trim() + "how are you"); // with trim
    }

    private static void isEmptyMethod()
    {
        // Checks if two strings are empty, and returns true or false accordingly with the `isEmpty()` method.
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    private static void lengthMethod()
    {
        // length method returns the length of a string, or returns the count of total amount of characters.
        String str = "Java";
        String str2 = "";
        System.out.println("Length: " + str.length());
        System.out.println("Length: " + str2.length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());
    }
}