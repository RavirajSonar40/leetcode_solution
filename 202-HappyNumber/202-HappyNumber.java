// Last updated: 27/04/2026, 04:06:08
class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
        }while(slow!=fast);

        if(slow==1){
            return true;
        }
        return false;

    }

    public static int findsquare(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    }
