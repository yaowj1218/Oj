import java.util.List;

public class recoverRotatedSortedArray {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    private void reverse(List<Integer> nums, int start, int end) {
        int i;
        int j;
        for (i = start, j = end; i < j; i++, j--) {
            int temp = nums.get(i);
            nums.set(i, nums.get(j));
            nums.set(j, temp);
        }
    }
    //最前面的和最后面的交换。
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        for (int index = 0; index < nums.size() - 1; index++) {
            if (nums.get(index) > nums.get(index + 1)) {
                reverse(nums, 0 , index);
                reverse(nums, index + 1, nums.size() - 1);
                reverse(nums, 0 , nums.size() - 1);
            }
        }
        return;

    }
}
//三次翻转  两次把两个小数组翻转，最后一次整个翻转。

