class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        int reverse = 0;
        if (number < 0){
            return false;
        }
        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if(x == reverse) {
            return true;
        }
        return false;
        
    }
}