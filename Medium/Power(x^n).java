class Solution {
    public double myPow(double x, int n) {
        double a=1;
        long power=n;
        if (power<0) {
            x=1/x;
            power=-power;
        }
        while (power>0) {
            if (power%2==1) {
                a=a*x;
            }
            x*=x;
            power/=2;
        }
        return a;
    }
}