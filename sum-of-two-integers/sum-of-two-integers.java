class Solution {
    public int getSum(int a, int b) {
        int x;
        if(b < 0){
            x = b * -1;
            while(x-- > 0){
            a--;
            }
        }
        else{
            x = b;
            while(x-- > 0){
            a++;
            }
        }
        return a;
        
    }
}