class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int distance = 0;
        while(z > 0){
            distance = distance + (z & 1);
            z = z >> 1;
        }
        return distance;
    }
}