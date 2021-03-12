package org.snow.auspicious.leecode.solution;

import java.util.TreeSet;

//题目描述
//给你一个数组 arr ，该数组表示一个从 1 到 n 的数字排列。有一个长度为 n 的二进制字符串，该字符串上的所有位最初都设置为 0 。
//在从 1 到 n 的每个步骤 i 中（假设二进制字符串和 arr 都是从 1 开始索引的情况下），二进制字符串上位于位置 arr[i] 的位将会设为 1 。
//给你一个整数 m ，请你找出二进制字符串上存在长度为 m 的一组 1 的最后步骤。一组 1 是一个连续的、由 1 组成的子串，且左右两边不再有可以延伸的 1 。
//返回存在长度 恰好 为 m 的 一组 1 的最后步骤。如果不存在这样的步骤，请返回 -1 。

/**
 * 方法采取逆序的思想，首先输入两个边界
 * 然后按照逆序的思想，利用treeset
 * 的lower 和 higher 就可以获取到
 * 这个set 里面 据当前 节点 最小的里面的最大的
 * 最大 的里面最小的
 */
public class FindMGroup {
    public static void main(String[] args) {

    }

    public int findLatestStep(int[] arr, int m) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(0);
        set.add(arr.length+1);
        if(arr.length == m){
            return arr.length;
        }
        int n = arr.length;
        for (int i =n-1 ;i>= 0;i--){
            int num = arr[i];
            int a = set.lower(num);
            int b = set.higher(num);
            if(num-a-1 ==m || b-num-1==m){
                return i;
            }
            set.add(num);
        }
        return -1;
    }
}
