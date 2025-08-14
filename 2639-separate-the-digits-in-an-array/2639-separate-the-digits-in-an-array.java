class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            for (char c : String.valueOf(num).toCharArray()) {
                ans.add(c - '0');
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }
}
