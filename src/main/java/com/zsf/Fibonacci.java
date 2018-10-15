package com.zsf;

public class Fibonacci {
    /**
     * 有10层台阶，小明每次可以爬一台阶或者两台阶，请问，爬到10层台阶，小明一共有（）种爬法
     * 斐波那契数列
     */
    //递推方式
    public static void testFibonacci1(int n) {
        int a = 1, b=1, c = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("第" + i + "等于" + a);
            }else if (i == 2) {
                System.out.println("第" + i + "等于" + b);
            }else {
                c = a+b;
                a = b;
                b = c;
                System.out.println("第" + i + "等于" + c);
            }
        }
    }
    //递推方式－数组方式
    public static void testFibonacci2(int n) {
        int[] arrayList = new int[n];
        arrayList[0] = arrayList[1] =1;
        for (int i = 0; i < arrayList.length; i++) {
            if (i == 0) {
                System.out.println("第" + (i+1) + "等于" + arrayList[0]);
            }else if (i == 1) {
                System.out.println("第" + (i+1) + "等于" + arrayList[1]);
            }else {
                arrayList[i] = arrayList[i-1] +arrayList[i-2];
                System.out.println("第" + (i+1) + "等于" + arrayList[i]);
            }
        }
    }
   // 递归方式
    public static int testFibonacci3(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return testFibonacci3(n-1) + testFibonacci3(n-2);
        }
    }
    //测试实现
    public static void main(String [] agrs){
        int i = testFibonacci3(4);
        System.out.println(i);
    }
}
