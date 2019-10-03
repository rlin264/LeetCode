package easy;

public class ReverseInteger {
    public static void main(String[] args)
    {
        System.out.println(reverse(321));
    }
    static int reverse(int x) {
        int ret = 0;
        int prev = 0;
        while(Math.abs(x) > 0)
        {
            ret = ret*10 + x%10;
            if((ret-x%10)/10 != prev)
            {
                return 0;
            }
            prev = ret;
            x = x/10;
        }
        return ret;
    }
}
