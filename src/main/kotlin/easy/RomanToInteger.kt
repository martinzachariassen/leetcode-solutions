package easy

/*
Roman numerals are represented by seven different symbols:

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example:
- 2 is written as "II", which is two ones added together.
- 12 is written as "XII", which is X + II.
- 27 is written as "XXVII", which is XX + V + II.

Roman numerals are generally written from largest to smallest (left to right).
However, for specific numbers, subtraction is used instead of addition:

- The numeral for 4 is written as "IV" (5 - 1), not "IIII".
- The numeral for 9 is written as "IX" (10 - 1), not "VIIII".

There are six cases where subtraction occurs:
1. I can be placed before V (5) and X (10) to make 4 and 9.
2. X can be placed before L (50) and C (100) to make 40 and 90.
3. C can be placed before D (500) and M (1000) to make 400 and 900.

### Problem:
Given a Roman numeral as a string `s`, convert it to an integer.

### Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

### Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V = 5, III = 3.

### Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90, IV = 4.

### Constraints:
1. 1 <= s.length <= 15
2. s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
3. It is guaranteed that `s` is a valid Roman numeral in the range [1, 3999].
*/
class RomanToInteger {
    /**
     * A mapping of Roman numeral symbols to their corresponding integer values.
     * This map serves as the reference for converting Roman numeral characters to integers
     * in the context of Roman numeral string processing and validation.
     */
    private val romanValues =
        mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000,
        )

    /**
     * Validates the input string for Roman numeral conversion.
     *
     * @param s the input string to be validated. It must not be empty and must only contain valid
     *          Roman numeral characters as defined in the `romanValues` map.
     * @throws IllegalArgumentException if the input string is empty or contains invalid characters.
     */
    private fun validateInput(s: String) {
        require(s.isNotEmpty()) { "Input string cannot be empty" }
        require(s.all { it in romanValues }) { "Input contains invalid Roman numeral characters" }
    }

    /**
     * Converts a Roman numeral string to its corresponding integer value.
     *
     * @param s the input string representing a Roman numeral. It must not be empty
     *          and must only contain valid Roman numeral characters.
     * @return the integer value corresponding to the given Roman numeral string.
     * @throws IllegalArgumentException if the input string is empty or contains invalid characters.
     */
    fun romanToInt(s: String): Int {
        validateInput(s)

        var previousValue = 0 // To track the last processed value
        var sum = 0 // To store the cumulative sum

        // Iterate over the string in reverse (right to left)
        for (char in s.reversed()) {
            val currentValue = romanValues[char]!!

            if (currentValue < previousValue) {
                // Subtraction case: Smaller number before a larger number
                sum -= currentValue
            } else {
                // Normal addition case
                sum += currentValue
            }

            // Update previousValue for the next iteration
            previousValue = currentValue
        }

        return sum
    }
}
