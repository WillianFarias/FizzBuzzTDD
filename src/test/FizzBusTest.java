package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBusTest {
	
	@Test
	public void testFizz( ) {
		int valor = 3;
		
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		
		String retorno = fizzBuzzGame.executa(valor);
		
		assertEquals(retorno, "Fizz");
	}

}
