package executor;

import stringExercises.LongestPalindromeSubstring;
import stringExercises.ProperParentheses;
import stringExercises.StringPermutation;
import stringExercises.StringRemover;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        runner.longestPalindromeRun();
        runner.properParenthesesRun();
        runner.stringRemoverRun();
        runner.anagramRun();
        runner.stringReverseRun();
        runner.stringPermutationRun();


    }
}
