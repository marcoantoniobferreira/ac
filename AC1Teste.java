
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AC1Teste {
    @Test
	public void arrayTest() {
		AC1 a = new AC1();
		//testar se o maior é 940
        //assertEquals(940, a.maior(), "O Maior Numero 940");
        assertEquals("O Maior Numero 940", 940, a.maior());

		//testar se o menor é 510
        //assertEquals(510, a.menor(), "O menor deve ser 510");
        assertEquals("O menor deve ser 510", 510, a.menor());

		//testar se a soma é 7540
        //assertEquals(7540, a.soma(), "A soma é 7540");
        assertEquals("A soma é 7540", 7540, a.soma());
		
		//testar a quantidade de vezes que o numero 3 aparece
        //assertEquals(0, a.repeticoes(3), "940 aparece 2 vezes");
        assertEquals("3 aparece 0 vezes", 0, a.repeticoes(3));

		// //testar a quantidade de vezes que o numero 790 aparece
        // assertEquals(1, a.repeticoes(790), "940 aparece 2 vezes");
        assertEquals("790 aparece 1 vez", 1, a.repeticoes(790));

		// //testar a quantidade de vezes que o numero 940 aparece
        // assertEquals(2, a.repeticoes(940), "940 aparece 2 vezes");
        assertEquals("940 aparece 2 vezes", 2, a.repeticoes(940));
    }
    
}
