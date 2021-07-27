class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int x = 0;
        while(x <= strs[0].length()){
            for(int i = 0; i < strs.length; i++){
                if(!(x < strs[i].length()) || strs[0].charAt(x) != strs[i].charAt(x)){
                   return result; 
                }     
            }
            result += strs[0].charAt(x++);
        }
        return result;
    }
}