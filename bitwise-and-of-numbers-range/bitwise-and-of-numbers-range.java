class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int x = 1;
        while(left != right){
            left = left / 2;
            right = right / 2;
            x =  x * 2;
        }
        return left * x;      
        
    }
}