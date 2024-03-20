package BranchCoverageTest;
import Classes.Exercice1Correction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exo1Test {
    @Test
    void isPalindromeTestNullStrings() {
        Assertions.assertThrows(NullPointerException.class, () ->Exercice1Correction.isPalindrome (null));
    }
    @Test
    void isPalindromeTestWithNoNullStringsAndIisLessThanJAndCharIDiffrentWithCharJ() {
        Assertions.assertFalse(Exercice1Correction.isPalindrome("radfr"));
    }
    @Test
    void isPalindromeTestWithNoNullStringsAndIisLessThanJAndCharIEqualtWithCharJ() {
        Assertions.assertTrue(Exercice1Correction.isPalindrome("radar"));
    }
    @Test
    void isPalindromeTestWithNoNullStringsAndIisEqualToJ() {
        Assertions.assertTrue(Exercice1Correction.isPalindrome("r"));
    }
}