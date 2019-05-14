package executor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import stringExercises.StringReverse;
import testing.*;

public class TestRunner {
    public void longestPalindromeRun() {

        Result result = JUnitCore.runClasses(LongestPalindromeSubstringTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }

    public void properParenthesesRun() {

        Result result = JUnitCore.runClasses(ProperParenthesesTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }

    public void stringRemoverRun() {
        Result result = JUnitCore.runClasses(stringRemoverTest.class);

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

    }

    public void anagramRun () {
        Result result = JUnitCore.runClasses(AnagramTest.class);

        for ( Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

    public void stringReverseRun () {
        Result result = JUnitCore.runClasses(StringReverseTest.class);

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
