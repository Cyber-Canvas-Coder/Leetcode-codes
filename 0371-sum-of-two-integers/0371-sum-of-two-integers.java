class Solution {
    public int getSum(int a, int b) {
        int carry, sum;
        while (b != 0) {
            sum = a ^ b;         // Calculate the sum without considering the carry
            carry = (a & b) << 1; // Calculate the carry
            a = sum;             // Update 'a' to the calculated sum
            b = carry;           // Update 'b' to the calculated carry
        }
        return a;                // When carry becomes 0, 'a' contains the final sum
    }
}
