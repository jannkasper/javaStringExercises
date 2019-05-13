package executor;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import stringExercises.LongestPalindromeSubstring;
import testing.LongestPalindromeSubstringTest;

public class TestRunner {
    public void longestPalindromeRun() {

        Result result = JUnitCore.runClasses(LongestPalindromeSubstringTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());

    }

}
