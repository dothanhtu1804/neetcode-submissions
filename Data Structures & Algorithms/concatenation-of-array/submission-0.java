class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ant = new int[2*nums.length];
        for (int i = 0; i < ant.length; i++) {
            if (i > nums.length - 1) {
                ant[i] = nums[i - nums.length];
            } else {
                ant[i] = nums[i];
            }
        }
        return ant;
    }
}