package BranchCoverageTest;
import Classes.Exercice3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Exo3Test {
    @Test
    public void binarySearchShouldReturnExceptionIfStringsAreNull(){
        Assertions.assertThrows(NullPointerException.class,() -> Exercice3.binarySearch(null, 0));
    }
    @Test
    public void binarySearchShouldReturnIndiceOfElementifLowLessThanHighAndElementExsistinTheMiddle(){
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;  //1
        numbers[2] = 30;
        Assertions.assertEquals(1,Exercice3.binarySearch(numbers,20));
    }
    @Test
    public void binarySearchShouldReturnIndiceOfElementifLowLessThanHighAndElementBeforeTheMiddle(){
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        Assertions.assertEquals(0,Exercice3.binarySearch(numbers,10));
    }
    @Test
    public void binarySearchShouldReturnIndiceOfElementifLowLessThanHighAndElementAfterTheMiddle(){
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        Assertions.assertEquals(2,Exercice3.binarySearch(numbers,30));
    }
    @Test
    public void binarySearchShouldReturnIndiceOfElementifLowEqualToHigh(){
        int[] numbers = new int[1];
        numbers[0] = 10;
        Assertions.assertEquals(0,Exercice3.binarySearch(numbers,10));
    }
}
