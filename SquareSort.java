import java.util.Arrays;

/**
 * SquareSort
 */
public class SquareSort {

    public static void main(String[] args) {
        int []  nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(Square(nums)));
    }
    public static int[] Square(int[] nums){
        int l=0, r= nums.length-1;
        int[] ans = new int[nums.length];
        int i = 0;
        while(l <= r){
            if(nums[l]*nums[l] > nums[r]*nums[r]){
                ans[i] = nums[l]*nums[l];
                l++;
            }
            else{
                ans[i] = nums[r]*nums[r];
                r--;
            }
        }
        return ans;
    }
    
}