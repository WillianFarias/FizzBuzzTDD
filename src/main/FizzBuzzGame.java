package main;

public class FizzBuzzGame {

	public String executa(Integer valor) {
		String retorno = valor.toString();
		
		if(valor % 5 == 0 && valor % 2 == 0 && valor % 3 == 0)
			return "FizzBuzzFoo";
		if(valor % 3 == 0 && valor % 5 == 0)
			return "FizzBuzz";
		if(valor % 3 == 0 && valor % 2 == 0)
			return "FizzFoo";
		if(valor % 5 == 0 && valor % 2 == 0)
			return "BuzzFoo";
		if (valor % 3 == 0)
			retorno = "Fizz";
		if (valor % 5 == 0)
			retorno = "Buzz";
		if (valor % 2 == 0)
			retorno = "Foo";
		return retorno;
	}

}
