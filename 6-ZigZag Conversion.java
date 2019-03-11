class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int a = numRows * 2 - 2;
        List<StringBuilder> L = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            L.add(new StringBuilder());
        }
        for (int i = 0; i < s.length(); ++i) {
            L.get(Math.min(i % a, a - i % a)).append(s.charAt(i));
        }
        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : L) {
            ret.append(row);
        }
        return ret.toString();
    }
}