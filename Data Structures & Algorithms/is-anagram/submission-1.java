class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        String[] splitString1 = s.split("");
        String[] splitString2 = t.split("");
        Arrays.sort(splitString1);
        Arrays.sort(splitString2);
        for (int i = 0; i < splitString1.length; i++) {
            if (!splitString1[i].equals(splitString2[i])) return false;
        }
        return true;
    }
}
