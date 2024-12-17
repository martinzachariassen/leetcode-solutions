package easy

import kotlin.test.Test
import kotlin.test.assertEquals

class RomanToIntegerTest {
    @Test
    fun `test roman to integer converter`() {
        assertEquals(3, RomanToInteger().romanToInt("III"))
        assertEquals(4, RomanToInteger().romanToInt("IV"))
        assertEquals(9, RomanToInteger().romanToInt("IX"))
        assertEquals(58, RomanToInteger().romanToInt("LVIII"))
        assertEquals(1994, RomanToInteger().romanToInt("MCMXCIV"))
    }

    @Test
    fun `test single character inputs`() {
        assertEquals(1, RomanToInteger().romanToInt("I"))
        assertEquals(5, RomanToInteger().romanToInt("V"))
        assertEquals(10, RomanToInteger().romanToInt("X"))
        assertEquals(50, RomanToInteger().romanToInt("L"))
        assertEquals(100, RomanToInteger().romanToInt("C"))
        assertEquals(500, RomanToInteger().romanToInt("D"))
        assertEquals(1000, RomanToInteger().romanToInt("M"))
    }

    @Test
    fun `test edge cases`() {
        assertEquals(1, RomanToInteger().romanToInt("I"))
        assertEquals(3999, RomanToInteger().romanToInt("MMMCMXCIX"))
    }

    @Test
    fun `test invalid inputs`() {
        try {
            RomanToInteger().romanToInt("A")
        } catch (e: Exception) {
            assertEquals("Input contains invalid Roman numeral characters", e.message)
        }

        try {
            RomanToInteger().romanToInt("")
        } catch (e: Exception) {
            assertEquals("Input string cannot be empty", e.message)
        }
    }
}
