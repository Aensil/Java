import java.util.Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution9 {
    public int solution9(int[] A) {
        int result = 1;
        Arrays.sort(A);

        Set allNum = new HashSet();

        for(int i = 0; i < A.length; i++){
            allNum.add(A[i]);
        }
        for(int j = 1; j <= A.length; j++){
            if(allNum.contains(j) == false){
                return j;
            } else if(j == A.length){
                return j + 1;
            }
        }
        // Implement your solution here
        return result;
    }
}