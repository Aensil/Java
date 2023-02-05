import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution7 {
    public int solution7(int[] A) {
        Arrays.sort(A);
        Set requiredPer = new HashSet();
        for(int i=1; i <= A[A.length - 1]; i++) {
            requiredPer.add(i);
        }

        Set currentNum = new HashSet();

        for(int p=0; p<A.length; p++) {
			currentNum.add(A[p]);
			
			if(currentNum.size() < A.length - 1) continue;
			
			if(currentNum.containsAll(requiredPer)) {
				return 1;
			}
        }

        return 0;
    }
}