package array;

public class assex2 {

    
    public int search(int[] nums, int target) {
    
        int min = minSearch(nums);
        
        
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return binarySearch(nums, min, nums.length - 1, target);
        } else {
            return binarySearch(nums, 0, min - 1, target);
        }
    }

  
    public int binarySearch(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1; 
    }

   
    public int minSearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; 
    }

    public static void main(String args[]) {
        assex2 obj = new assex2();
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 6; 

        int result = obj.search(nums, target);
        System.out.println("Target found at index: " + result);
    }
}
