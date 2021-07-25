class Solution {
    public String toHex(int num) {
        String hex = "";
        String hexvalue = "0123456789abcdef";
        if(num == 0)
            return "0";
        while(num != 0)  {   
             hex = hexvalue.charAt(num & 15) + hex;   
             num = num >>> 4;
        }
        return hex; 
        
    }
}