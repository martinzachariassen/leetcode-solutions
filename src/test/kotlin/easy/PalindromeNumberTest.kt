package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PalindromeNumberTest {
    @Test
    fun `test positive palindrome number`() {
        val input = 121
        assertTrue(PalindromeNumber().isPalindrome(input))
    }

    @Test
    fun `test negative number as not palindrome`() {
        val input = -121
        assertFalse(PalindromeNumber().isPalindrome(input))
    }

    @Test
    fun `test number ending with zero as not palindrome`() {
        val input = 10
        assertFalse(PalindromeNumber().isPalindrome(input))
    }

    @Test
    fun `test single digit number as palindrome`() {
        val input = 7
        assertTrue(PalindromeNumber().isPalindrome(input))
    }

    @Test
    fun `test large palindrome number`() {
        val input = 1221
        assertTrue(PalindromeNumber().isPalindrome(input))
    }

    @Test
    fun `test non-palindrome number`() {
        val input = 1234
        assertFalse(PalindromeNumber().isPalindrome(input))
    }

    @Test
    fun `test zero as palindrome`() {
        val input = 0
        assertTrue(PalindromeNumber().isPalindrome(input))
    }
}
