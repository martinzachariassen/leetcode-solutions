@file:Suppress("ktlint:standard:filename")

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
class Solution {
    fun twoSum(
        nums: IntArray,
        target: Int,
    ): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] + nums[i] == target) return intArrayOf(i, j)
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
