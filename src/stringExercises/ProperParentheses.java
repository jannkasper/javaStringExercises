package stringExercises;

//        Given a string containing characters '(', ')', '{', '}', '[' and ']',
//        write a function in Java or C++ to check if the input string is valid.
//        The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not

public class ProperParentheses {
    public boolean checkParentheses (String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        text = text.replaceAll("[^()\\[\\]]", "");

        while(!text.equals(text.replaceFirst("\\(\\)|\\[\\]",""))){
            text = text.replaceFirst("\\(\\)|\\[\\]","");

        }
        if (text.isEmpty())
            return true;

        return false;
    }
}
