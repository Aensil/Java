class Solution3 {
    public int solution3(int X, int Y, int D) {
        int h = (Y - X)/D ;
        if((h * D) + X < Y ){
            h++;
        }
        return h;
    }
}