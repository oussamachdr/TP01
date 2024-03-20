package LineCoverageTest;
import Classes.Exercice3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exo3Test {
    @Test
    public void binarySearchShouldReturnExceptionIfArrayIsNull(){
        Assertions.assertThrows(NullPointerException.class,() -> Exercice3.binarySearch(null, 0));
    }
    @Test
    public void binarySearchShouldReturnIndiceOfElement(){
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        Assertions.assertEquals(3,Exercice3.binarySearch(numbers,40));
    }
    @Test
    public void binarySearchShouldReturnMinceOne(){
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        Assertions.assertEquals(-1,Exercice3.binarySearch(numbers,-8));
    }

}
