class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", n, n);
        return result;
    }
    public void backtrack(List<String> result, String temp, int open, int close) {
        if(open == 0 && close == 0){
            result.add(temp);
        } else {
            if(open > 0){
                backtrack(result, temp + "(", open-1, close);
            }
            if(close > open) {
                backtrack(result, temp + ")", open, close-1);
            }
        }
    }
    
}