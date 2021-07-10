class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row0 = new ArrayList<Integer>(Arrays.asList(1));
        res.add(row0);
        for (int row = 1; row < numRows; row++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            for (int col = 1; col < row; col++) {
                list.add(res.get(row - 1).get(col - 1) + res.get(row - 1).get(col));
            }
            list.add(1);
            res.add(list);
        }
        return res;
        
    }
}