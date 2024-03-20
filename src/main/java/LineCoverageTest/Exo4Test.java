package LineCoverageTest;

import Classes.Exercice4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exo4Test {
    @Test
    public void solveShouldReturnExceptionIfAEqualZero(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> Exercice4.solve(0, 0,0));
    }
    @Test
    public void solveShouldReturnNullIfEquationDoesntHaveSolution(){
        Assertions.assertNull(Exercice4.solve(2, 0, 2));
    }
    @Test
    public void solveShouldReturnSolutionIfDeltaIsEqualZero(){
        double[] array = new double[1];
        array[0]=-1;
        Assertions.assertArrayEquals(array,Exercice4.solve(1,2,1));
    }
    @Test
    public void solveShouldReturnSolutionIfDeltaIsGraterThanZero(){
        double[] array = new double[2];
        array[0]=-1;
        array[1]=-2;
        Assertions.assertArrayEquals(array,Exercice4.solve(1,3,2));
    }
}
