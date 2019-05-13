package executor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import testing.LongestPalindromeSubstringTest;
import testing.ProperParenthesesTest;
import testing.stringRemoverTest;

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

}
