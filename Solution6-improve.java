import java.util.HashSet;
import java.util.Set;

public class Solution6-improve {
  public int solution6-improve(int X, int[] A) {
    Set requiredLeavesSet = new HashSet();
    for(int i=1; i<=X; i++) {
      requiredLeavesSet.add(i);
    }
   
    Set currentLeavesSet = new HashSet();
   
    for(int p=0; p<A.length; p++) {
      currentLeavesSet.add(A[p]);
      
      if(currentLeavesSet.size() < X) continue; //keep adding to current leaves set until it's at least the same size as required leaves set
     
      if(currentLeavesSet.containsAll(requiredLeavesSet)) {//Only happends when both sets are the same size
        return p;
      }
    }
    return -1;//It wasn't possible for the frog to cross
  }
}