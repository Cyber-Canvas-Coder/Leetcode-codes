class Solution {
    public String toLowerCase(String s) {
        
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) { // Corrected the loop condition
            if (c[i] >= 65 && c[i] <= 90) {
                c[i] = (char) (c[i] + 32);
            }
        }
        return String.valueOf(c); // Corrected capitalization of 'valueOf'
    }
}
