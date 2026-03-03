class Solution {
    public boolean isAnagram(String s, String t) {
        char[]arrs=s.toCharArray();
        char[]arrt=t.toCharArray();
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        return Arrays.equals(arrs,arrt);
    }
}