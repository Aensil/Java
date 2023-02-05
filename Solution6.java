
class Solution6 {
    public int solution6(int X, int[] A) {
        int index = 0;
        int result = -1;
        for(int i = X; i > 1; i--){
            index = findIndex(i, A);
            if(index > result){
                result = index;
            }
        }
        return result;
        // Implement your solution here
    }
    public int findIndex(int L, int[] list){
        for(int j = 0; j < list.length; j++){
            if(L == list[j]){
                return j;
            }
        }
        return -1;
    }
}