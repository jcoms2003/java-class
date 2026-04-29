public class RecursionTest {
    public static void main(String[] args) {
        RecursionHelper helper = new RecursionHelper();
        int testsPassed = 0;
        int totalTests = 0;

        System.out.println("===== Testing Recursion Methods =====\n");

        // Test reverseString
        System.out.println("--- Testing reverseString() ---");
        String[] stringTests = {"yield", "tacocat", "a", "", "hello"};
        String[] expectedReverse = {"dleiy", "tacocat", "a", "", "olleh"};
        
        for (int i = 0; i < stringTests.length; i++) {
            totalTests++;
            String result = helper.reverseString(stringTests[i]);
            boolean passed = result.equals(expectedReverse[i]);
            String status = passed ? "✓ PASS" : "✗ FAIL";
            System.out.println(status + ": reverseString(\"" + stringTests[i] + "\") = \"" + result + "\" (expected \"" + expectedReverse[i] + "\")");
            if (passed) testsPassed++;
        }

        System.out.println("\n--- Testing pow() ---");
        int[][] powTests = {{2, 3}, {5, 2}, {3, 0}, {10, 1}, {2, 5}};
        int[] expectedPow = {8, 25, 1, 10, 32};
        
        for (int i = 0; i < powTests.length; i++) {
            totalTests++;
            int x = powTests[i][0];
            int y = powTests[i][1];
            int result = helper.pow(x, y);
            boolean passed = result == expectedPow[i];
            String status = passed ? "✓ PASS" : "✗ FAIL";
            System.out.println(status + ": pow(" + x + ", " + y + ") = " + result + " (expected " + expectedPow[i] + ")");
            if (passed) testsPassed++;
        }

        System.out.println("\n--- Testing palindromeChecker() ---");
        String[] palindromeTests = {"tacocat", "racecar", "sponge", "a", "", "mom", "dad", "hello"};
        boolean[] expectedPalindrome = {true, true, false, true, true, true, true, false};
        
        for (int i = 0; i < palindromeTests.length; i++) {
            totalTests++;
            boolean result = helper.palindromeChecker(palindromeTests[i]);
            boolean passed = result == expectedPalindrome[i];
            String status = passed ? "✓ PASS" : "✗ FAIL";
            System.out.println(status + ": palindromeChecker(\"" + palindromeTests[i] + "\") = " + result + " (expected " + expectedPalindrome[i] + ")");
            if (passed) testsPassed++;
        }

        System.out.println("\n===== Test Results =====");
        System.out.println("Total Tests: " + totalTests);
        System.out.println("Passed: " + testsPassed);
        System.out.println("Failed: " + (totalTests - testsPassed));
        if (testsPassed == totalTests) {
            System.out.println("\n✓ All tests passed!");
        } else {
            System.out.println("\n✗ Some tests failed.");
        }
    }
}
