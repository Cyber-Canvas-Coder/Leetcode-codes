import java.util.ArrayList;

class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int element;
        ArrayList<Integer> binary = new ArrayList<>();

        while (n > 0) {
            element = n % 2; 
            binary.add(element);
            n = n/2;  
        }

        for (int i = 0; i < binary.size(); i++) {
            if (binary.get(i) == 1) {
                count++;
            }
        }

        return count;
    }
}
