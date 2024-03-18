package LineCoverageTest;

import Classes.Exercice1Correction;
import Classes.Exercice2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo2Test {

    @Test
    void AnagramTestNullStrings() {
        Assertions.assertThrows(NullPointerException.class, () -> Exercice2.isAnagram (null,null));
    }


}