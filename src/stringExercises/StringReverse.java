package stringExercises;

public class StringReverse {
    public String StringReverseExample (String string) {
        if (string == null)
            return null;

//        Reversed string using Stringbuffer
        String reverseString = new StringBuffer(string).reverse().toString();

//        Iterative method to reverse String in Java
        reverseString = StringReverseIteration(string);

//        Recursive method to reverse String in Java
        reverseString = StringReverseRecursion(string);

        return reverseString;
    }

    public String StringReverseIteration (String string){
        String reverseString = "";
        for (int i = 0; i<string.length(); i++){
            reverseString = string.charAt(i) + reverseString;
        }

        return reverseString;
    }
    public String StringReverseRecursion (String string){
        if (string.length() == 1 || string.isEmpty())
            return string;

        return  StringReverseRecursion(string.substring(1)) + string.charAt(0);
    }
}
