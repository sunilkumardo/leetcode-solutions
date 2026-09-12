class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        int i = 0;

        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        
        boolean negative = false;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            i++;
        }

       
        int result = 0;
        int limit = negative ? Integer.MIN_VALUE : -Integer.MAX_VALUE;
        int limitBeforeLastDigit = limit / 10;

        while (i < n) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            
            if (result < limitBeforeLastDigit ||
                (result == limitBeforeLastDigit && digit > -(limit % 10))) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 - digit;
            i++;
        }

        return negative ? result : -result;
    }
}