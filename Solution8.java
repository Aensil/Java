import java.util.Arrays;

class Solution8 {
    public int[] solution8(int N, int[] A) {
        int result[] = new int[N];
        Arrays.fill(result, 0);
        int max = 0;
        for(int i = 0; i < A.length; i++){
            if((A[i] <= N) && (A[i] >= 1)){
                result[A[i] - 1] = result[A[i] - 1] + 1;
                if(result[A[i] - 1] + 1 > max){
                    max = result[A[i] - 1];
                }
            } else if(A[i] == N + 1){
                //Finds max of array
                //int max = Arrays.stream(result).max().getAsInt();
                Arrays.fill(result, max);
            }
        }
        return result;
    }
}