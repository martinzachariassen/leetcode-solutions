package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TwoSumTest {
    @Test
    fun `test two sum with valid input`() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `test two sum with multiple solutions`() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `test two sum with duplicate numbers`() {
        val nums = intArrayOf(3, 3)
        val target = 6
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `test two sum with no solution`() {
        val nums = intArrayOf(1, 2, 3, 4)
        val target = 10
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf() // No solution expected
        assertArrayEquals(expected, result)
    }

    @Test
    fun `test two sum with negative numbers`() {
        val nums = intArrayOf(-3, 4, 3, 90)
        val target = 0
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf(0, 2)
        assertArrayEquals(expected, result)
    }

    @Test
    fun `test two sum with single element`() {
        val nums = intArrayOf(1)
        val target = 2
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf() // No solution with single element
        assertArrayEquals(expected, result)
    }

    @Test
    fun `test two sum with empty array`() {
        val nums = intArrayOf()
        val target = 5
        val result = TwoSum().twoSum(nums, target)
        val expected = intArrayOf() // No solution for empty array
        assertArrayEquals(expected, result)
    }
}
