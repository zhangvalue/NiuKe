package com.zsf;

public class Duplicate {
    /**zhangsf
     * 找到数组中一个重复的数字
     * 返回-1代表无重复数字或者输入无效
     */
    public int getDuplicate(int[] arr) {
        if (arr == null || arr.length <= 0) {
            System.out.println("数组输入无效！");
            return -1;
        }
        for (int a : arr) {
            if (a < 0 || a > arr.length - 1) {
                System.out.println("数字大小超出范围！");
                return -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int temp;
            while (arr[i] != i) {
                if (arr[arr[i]] == arr[i]){
                    return arr[i];}
                // 交换arr[arr[i]]和arr[i]
                temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            }
        }
        System.out.println("数组中无重复数字！");
        return -1;
    }
    // ==================================测试代码==================================
    /**
     *数组为null
     */
    public void test1() {
        System.out.print("test1：");
        int[] a = null;
        int dup = getDuplicate(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }

    /**
     *数组无重复数字
     */
    public void test2() {
        System.out.print("test2：");
        int[] a = { 0, 1, 2, 3 };
        int dup = getDuplicate(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }

    /**
     *数组数字越界
     */
    public void test3() {
        System.out.print("test3：");
        int[] a = { 1, 2, 3, 4 };
        int dup = getDuplicate(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }

    /**
     *数组带重复数字
     */
    public void test4() {
        System.out.print("test4：");
        int[] a = { 1, 2, 3, 2,3,1,4, 4 };
        int dup = getDuplicate(a);
        if (dup >= 0)
            System.out.println("重复数字为：" + dup);
    }
    public static  void main(String[] args){
        Duplicate f = new Duplicate();
//        f.test1();
//        f.test2();
//        f.test3();
        f.test4();
    }
}
