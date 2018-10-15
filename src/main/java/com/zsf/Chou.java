package com.zsf;

import java.util.Scanner;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Chou {
    public static int GetUglyNumber_Solution(int index) {
        if (index <= 0)
            return 0;
        int[] result = new int[index];
        result[0] = 1;
        int M2 = 0;// 数组最后一个2的倍数所在位置
        int M3 = 0;// 数组最后一个3的倍数所在位置
        int M5 = 0;// 数组最后一个5的倍数所在位置
        for (int i = 1; i < index; i++) {
            // 每一个丑数都是前面丑数乘以2，3或者5得到的
            int min = min(result[M2] * 2, result[M3] * 3, result[M5] * 5);
            result[i] = min;
            if (result[M2] * 2 <= min)
                M2++;
            if (result[M3] * 3 <= min)
                M3++;
            if (result[M5] * 5 <= min)
                M5++;

        }

        return result[index - 1];
    }

    public static int min(int a, int b, int c) {
        int min = (a < b) ? a : b;
        return (min < c) ? min : c;
    }

    public static void main(String[] args) {
        System.out.print("请输入一个待检测的正整数：");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(GetUglyNumber_Solution(N));
    }

}
