public class ThreeWayPartition {
    static void sortColors(int[] nums) {
       int low = 0;            
       int mid = 0;           
       int high = nums.length - 1;   

       while (mid <= high) {
           if (nums[mid] == 0) {
   
               int temp = nums[mid];
               nums[mid] = nums[low];
               nums[low] = temp;
               low++;
               mid++;
           } else if (nums[mid] == 1) {
               mid++;
           } else { 
               int temp = nums[mid];
               nums[mid] = nums[high];
               nums[high] = temp;
               high--;
           }
       }
   }

   public static void main(String[] args) {
       int[] arr = {2,0,2,1,1,0};
       
       sortColors(arr);
       for (int num : arr) {
           System.out.print(num + " ");
       }
   }
}