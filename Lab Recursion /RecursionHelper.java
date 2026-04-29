public class RecursionHelper {
    /** Self Explanation - Remember to detail your base and recursive cases.
     * 
     * 
     * 
     */
    public String reverseString(String str) {
        // Base case: if string is empty or has 1 character, return it
        if (str.length() <= 1) {
            return str;
        }
        // Recursive case: take last character + reverse of substring without last character
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }
    /** Self Explanation - Remember to detail your base and recursive cases. -- it may help to think of these as for/while loops first
     * 
     * 
     * 
     */
    public int pow(int x, int y) {
        // Base case: any number to the power of 0 is 1
        if (y == 0) {
            return 1;
        }
        // Recursive case: x^y = x * x^(y-1)
        return x * pow(x, y - 1);
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     * 
     * 
     * 
     */
    public boolean palindromeChecker(String str) {
        // Base case: string with 0 or 1 characters is always a palindrome
        if (str.length() <= 1) {
            return true;
        }
        // Recursive case: check if first and last characters match
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        // Recursively check the substring without first and last characters
        return palindromeChecker(str.substring(1, str.length() - 1));
    }
}
