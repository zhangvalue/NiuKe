package com.zsf;

/**
 * 给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。
 * 输入值小于1000. 如，输入为10，程序应该输出结果为2。
 * （共有两对质数的和为10，分别为（5,5）,（3,7））
 */
public class PrimeNumber {
    //判断是否是质数
    protected boolean isPrimeNumber(int num){
        if(num == 2) return true;//2特殊处理
        if(num < 2 || num % 2 == 0) return false;//识别小于2的数和偶数
        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num % i == 0){//识别被奇数整除
                return false;
            }
        }
        return true;
    }

    //获取质数和的个数
    public int getPNSum(int num) throws Exception{
        if(num < 1 || num >= 1000){
            throw new Exception("请输入正整数并小于1000");
        }
        int sum = 0;
        //单独考虑2
        if(isPrimeNumber(num - 2)){
            ++sum;
        }
        for(int i=3; i<=(num/2); i+=2){
            if(isPrimeNumber(i) && isPrimeNumber(num - i)){
                ++sum;
            }
        }
        return sum;
    }

    //测试代码
    public static void main(String[] args) {
        try {
            PrimeNumber pn = new PrimeNumber();
            int sum = pn.getPNSum(10);
            System.out.println("结果："+sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}