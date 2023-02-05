import java.util.Arrays;
class Solution4 {
    public int solution4(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            //System.out.println(A[i] + " - " + (i + A[0]));
            if(A[i] != i + A[0]){
                result = i + A[0];
                return result;
            }
        }
        return result; //Should never appear
    }
}