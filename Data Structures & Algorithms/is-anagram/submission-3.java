class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        String[] splitString1 = s.split("");
        String[] splitString2 = t.split("");
        Arrays.sort(splitString1);
        Arrays.sort(splitString2);
        return Arrays.equals(splitString1, splitString2) ? true :false;
    }
}
