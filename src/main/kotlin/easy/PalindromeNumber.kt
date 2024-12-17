package easy

/**
 * Problem: Check if an integer is a palindrome.
 *
 * A palindrome is a number that reads the same forward and backward.
 *
 * Examples:
 * - Input: x = 121 -> Output: true (121 == 121 reversed)
 * - Input: x = -121 -> Output: false (Negative numbers are not palindromes)
 * - Input: x = 10 -> Output: false (10 != 01 when reversed)
 *
 * Constraints:
 * - x is a 32-bit signed integer, i.e., -2^31 <= x <= 2^31 - 1
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean = x.toString().reversed() == x.toString()
}
