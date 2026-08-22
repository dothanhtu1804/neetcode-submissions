class Solution {
    public int scoreOfString(String s) {
        List<char[]> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char[] charGroup = new char[2];
            for (int j = i + 1; j < s.length(); j++) {
                charGroup[0] = s.charAt(i);
                charGroup[1] = s.charAt(j);
                list.add(charGroup);
                break;
            }
        }

        int result = 0;
        for (char[] item : list) {
            result += Math.abs(item[0] - item[1]);
        }
        return result;
    }
}