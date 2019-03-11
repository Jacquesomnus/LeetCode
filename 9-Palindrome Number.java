class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s1 = new StringBuffer(s).reverse().toString();
        return s.equals(s1);
    }
}