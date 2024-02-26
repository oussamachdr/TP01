package BranchCoverageTest;
import Classes.Exercice1Correction;
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
}