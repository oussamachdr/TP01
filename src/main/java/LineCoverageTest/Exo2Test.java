package LineCoverageTest;
import Classes.Exercice2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Exo2Test {

    @Test
    public void isAnagramShouldReturnExceptionIfStringsAreNull(){
        Assertions.assertThrows(NullPointerException.class,() ->Exercice2.isAnagram(null, null));
    }
    @Test
    public void isAnagramshouldreturnTrue() {
        Assertions.assertTrue(Exercice2.isAnagram("chient", "chenit"));
    }
    @Test
    public void isAnagramshouldreturnFalseIftheStringSizeAreTheSame() {
        Assertions.assertFalse(Exercice2.isAnagram("abc", "cde"));
    }
    @Test
    public void isAnagramshouldreturnFalseIftheStringSizeAreNotTheSame() {
        Assertions.assertFalse(Exercice2.isAnagram("abcdd", "cde"));
    }
}