// Last updated: 27/04/2026, 04:05:00
class Solution
{
    public int scoreOfString(String s)
    {
        int sum=0;
        for(int i=1;i<s.length();i++)
        {
            sum=sum+Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return sum;
    }
}