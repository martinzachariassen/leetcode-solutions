package easy

/**
 * ## Problem: Two Sum
 *
 * Given an array of integers `nums` and an integer `target`, return the indices of the two numbers
 * such that they add up to the `target`.
 *
 * ### Assumptions:
 * - Each input has exactly **one solution**.
 * - You **may not use the same element twice**.
 * - The solution can be returned in **any order**.
 *
 * ### Examples:
 *
 * #### Example 1:
 * ```
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * ```
 *
 * #### Example 2:
 * ```
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 * ```
 *
 * #### Example 3:
 * ```
 * Input: nums = [3, 3], target = 6
 * Output: [0, 1]
 * ```
 *
 * ### Constraints:
 * - `2 <= nums.length <= 10^4`
 * - `-10^9 <= nums[i] <= 10^9`
 * - `-10^9 <= target <= 10^9`
 * - Only **one valid answer exists**.
 *
 * ### Follow-Up:
 * Can you come up with an algorithm that is faster than **O(n^2)** time complexity?
 */
class TwoSum {
    fun twoSum(
        nums: IntArray,
        target: Int,
    ): IntArray {
        // Initialize a map to store numbers and their indices.
        // This helps in quick lookups to find complements.
        val map = mutableMapOf<Int, Int>()
        val n = nums.size

        for (i in 0 until n) {
            // Calculate the complement value (target - current number).
            val complement = target - nums[i]


            // Check if the complement already exists in the map.
            // If yes, return the indices of the current number and its complement.
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }

            // Add the current number and its index to the map.
            // This ensures it is available for future complement lookups.
            map[nums[i]] = i
        }

        // If no pair is found, return an empty array (no solution).
        return intArrayOf()
    }
}
