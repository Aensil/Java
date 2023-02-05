import java.util.*;

class Solution2 {
  public int solution2(int[] A) {
      HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
      for(int i = 0; i < A.length; i++) {
          if(count.containsKey(A[i])){
              int l = count.get(A[i]);
              l++;
              count.put(A[i], l);
          } else {
              count.put(A[i], 1);
          }
      }
      //Set llaves = count.keySet();
      for(Integer currentKey : count.keySet()) {
          int l = count.get(currentKey);
          if(l % 2 != 0){
              return currentKey;
          }
      }
      return 0; // should never happen
    }
}