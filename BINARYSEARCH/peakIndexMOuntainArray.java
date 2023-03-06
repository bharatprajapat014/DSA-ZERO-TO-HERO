public class peakMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,4,3,2};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
