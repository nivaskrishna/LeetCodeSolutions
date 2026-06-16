class Solution {
    public int reverse(int x) {
        int revn = 0;
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);  
        while(x>0){
            int ld = x%10;
            if (revn > (Integer.MAX_VALUE - ld)/10) {
                return 0;
            }
            revn = (revn * 10)+ld;
            x =x/10;
        }
        System.out.println(revn);
        return revn * sign;
    }
}