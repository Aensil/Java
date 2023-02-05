import java.util.ArrayList;

class Solution1 {
    public int[] solution1(int[] A, int K) {
        int[] sol;
        if(K == 1){
            sol = vuelta(A);
        } else if(A.length == 0){
            sol = A;
        } else {
            sol = vuelta(A);
            for(int h = 0; h < K - 1; h++){
                sol = vuelta(sol);
            }
        }
        
        return sol;
    }
    public int[] vuelta(int[] J){
        ArrayList<Integer> giRo = new ArrayList<Integer>();
        giRo.add(J[J.length - 1]);
        for (int i = 0; i < J.length - 1; i++) {
            giRo.add(J[i]);
        }
        int[] arr = giRo.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}