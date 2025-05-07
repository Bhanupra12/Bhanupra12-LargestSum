
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){if (nums == null || nums.size() < 2) {
        throw new IllegalArgumentException("List must contain at least two numbers.");
    }

    int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int max1Count = 0;

    for (int num : nums) {
        if (num > max1) {
            max2 = max1;
            max1 = num;
            max1Count = 1;
        } else if (num == max1) {
            max1Count++;
        } else if (num > max2) {
            max2 = num;
        }
    }

    // If the largest number occurs at least twice, we can use it twice.
    if (max1Count >= 2) {
        return max1 + max1;
    } else {
        return max1 + max2;
    }
    }
}