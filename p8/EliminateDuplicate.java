import java.util.*;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) nums[i] = input.nextInt();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) nums[j] = 0;
            }
        }

        Arrays.sort(nums);

        System.out.print("The distinct numbers are: ");
        for (int n : nums) {
            if (n != 0) System.out.print(n + " ");
        }
        System.out.println();
    }
}
