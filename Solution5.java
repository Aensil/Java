import java.util.Arrays;
class Solution5 {
    public int solution5(int[] A) {
        int result = 999999;
        int totalSum = 0;
        int upperLim = 0;
        int lowerLim;
        for(int i = 0; i < A.length; i++){
            totalSum += A[i];
        }
        lowerLim = totalSum;
        for(int j = 0; j < A.length - 1; j++){
            upperLim += A[j];
            lowerLim -= A[j];
            if(upperLim - lowerLim < result){
                //System.out.println(upperLim + " - " + lowerLim);
                result = Math.abs(upperLim - lowerLim);
            }
        }
        return result;
        
    }
}