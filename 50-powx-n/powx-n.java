class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if(nn < 0) nn = -1 * nn;
        double ans = 1.0;
        while(nn != 0){
            if(nn % 2 == 0){
                nn /= 2;
                x = x * x;
            }
            else{
                ans *= x;
                nn -= 1;
            }
        }

        if(n < 0) ans = (double) (1 / ans);
        return ans;
    }
}