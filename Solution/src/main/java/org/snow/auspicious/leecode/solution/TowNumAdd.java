package org.snow.auspicious.leecode.solution;

/**
 * leccode 第一道题 两数之和
 * @author cxx
 */
public class TowNumAdd {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 3, 4}, 9);
        System.out.println(ints[0]+","+ints[1]);
    }

    /**
     * 方法一  进行两次循环 如果代码两次数相加等于 target
     * 那么将两个数据的数输出。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++){
            int a = nums[i];
            for(int j = i ; j < nums.length ;j ++){
                int b = nums[j];
                if(i==j){
                    continue;
                }
                if(a+b ==target){
                    return new int []{i,j};
                }
            }
        }
        return null;
    }
}
