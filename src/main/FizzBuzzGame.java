package main;

public class FizzBuzzGame {

	public String executa(Integer valor) {
		String retorno = valor.toString();
		
		if(valor % 3 == 0 && valor % 5 == 0)
			return "FizzBuzz";
		else if (valor % 3 == 0)
			retorno = "Fizz";
		else if (valor % 5 == 0)
			retorno = "Buzz";
		return retorno;
	}

}
