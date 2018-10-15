package com.zsf;

public class TwoSum
{
    public static void main(String[] args)
    {
        int a=10;
        System.out.println(count(a));
    }

    static int count(int num)
    {
        int length=num/2+1;
        int max=0;
        for (int i = 1; i < length; i++)
        {
            if(IsPrime(i)&&IsPrime(num-i))
            {
                max++;
            }
        }
        return max;
    }
    static boolean IsPrime(int num)
    {
        boolean ret = true;
        int ubound =(int) (Math.sqrt(num)+1);
        for (int i = 2; i < ubound; i++)
        {
            if (num % i == 0)
            {
                ret = false;
                break;
            }
        }
        return ret;
    }

}
