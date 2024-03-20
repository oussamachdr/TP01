package LineCoverageTest;
import Classes.Exercice1Correction;
import Classes.Exercice1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exo1Test {
    @Test
    void PalindromeTestNullStrings() {
        Assertions.assertThrows(NullPointerException.class, () ->Exercice1Correction.isPalindrome (null));
    }
    @Test
    void PalindromeTestwithPalindromeString(){
        Assertions.assertTrue(Exercice1Correction.isPalindrome("radar"));
    }
    @Test
    void PalindromeTestwithNoPalindromeString(){
        Assertions.assertFalse(Exercice1Correction.isPalindrome("rada"));
    }
    @Test
    void PalindromeTestWithPalindromStringsIncludSpaces() {
        Assertions.assertTrue(Exercice1Correction.isPalindrome("ra da r"));
    }
    @Test
    void PalindromeTestwithNoPalindromeStringIncludeSpaces(){
        Assertions.assertFalse(Exercice1Correction.isPalindrome("ra d a"));
    }
    @Test
    void PalindromeTestWithPalindromStringsLowerandUpperCase() {
        Assertions.assertTrue(Exercice1Correction.isPalindrome("rA daR"));
    }
    @Test
    void PalindromeTestWithNoPalindromStringsLowerandUpperCase() {
        Assertions.assertFalse(Exercice1Correction.isPalindrome("rA da"));
    }
}