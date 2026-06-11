class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        int mid = 0;
        while(l <= r){
            mid = l + (r - l)/2;
            if((long)mid*mid > x){
                r = mid - 1;
            }
            else if((long)mid*mid < x){
                l = mid + 1;
            }
            else{
                return mid;
            }
        }
        return r;
    }
}