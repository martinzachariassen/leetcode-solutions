package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

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
    fun `test two sum throws exception when no solution`() {
        val nums = intArrayOf(1, 2, 3)
        val target = 10
        val exception =
            assertThrows<IllegalArgumentException> {
                TwoSum().twoSum(nums, target)
            }
        assert(exception.message == "No two sum solution")
    }
}
