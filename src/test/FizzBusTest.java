package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.FizzBuzzGame;

public class FizzBusTest {

	@Test
	public void deveRetornarFizzParaNumerosDivisiveisPorTres() {
		Integer valor = 3;
		String valorEsperado = "Fizz";

		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		String retorno = fizzBuzzGame.executa(valor);

		assertEquals(retorno, valorEsperado);
	}

	@Test
	public void deveRetornarBuzzParaNumerosDivisiveisPorCinco() {
		Integer valor = 5;
		String valorEsperado = "Buzz";

		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		String retorno = fizzBuzzGame.executa(valor);

		assertEquals(retorno, valorEsperado);
	}
	
	@Test
	public void deveRetornarFizzBuzzParaNumerosDivisiveisPorCincoETres() {
		Integer valor = 15;
		String valorEsperado = "FizzBuzz";

		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		String retorno = fizzBuzzGame.executa(valor);

		assertEquals(retorno, valorEsperado);
	}
	
	@Test
	public void naoDeveSerSubistituidoCasoNaoSejaDivisivel() {
		Integer valor = 2;
		String valorEsperado = "2";

		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

		String retorno = fizzBuzzGame.executa(valor);

		assertEquals(retorno, valorEsperado);
	}

}
