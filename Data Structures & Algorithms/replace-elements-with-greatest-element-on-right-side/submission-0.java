class Solution {
    public int[] replaceElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) max = arr[j];
            }
            map.put(i, i == arr.length - 1 ? -1 : max);
        }

        int[] result = new int[map.size()];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[entry.getKey()] = entry.getValue();
        }
        return result;
    }
}