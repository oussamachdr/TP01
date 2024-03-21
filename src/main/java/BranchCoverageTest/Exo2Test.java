package BranchCoverageTest;

import Classes.Exercice2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exo2Test {
    @Test
    public void isAnagramShouldReturnExceptionIfStringsAreNull(){
        Assertions.assertThrows(NullPointerException.class,() -> Exercice2.isAnagram(null, null));
    }
    @Test
    public void isAnagramShouldReturnTrueifStringsAreNotNullAndAllTableCaseIsSetToZero(){
        Assertions.assertTrue(Exercice2.isAnagram("chien","niech"));
    }
    @Test
    public void isAnagramShouldReturnTrueifStringsAreNotNullAndExsistTableCaseIsNotSetToZero(){
        Assertions.assertFalse(Exercice2.isAnagram("chienz","niecha"));
    }
}
