package main;

import main.rules.Buzz;
import main.rules.BuzzFoo;
import main.rules.Fizz;
import main.rules.FizzBuzz;
import main.rules.FizzBuzzFoo;
import main.rules.FizzFoo;
import main.rules.Foo;

public class FizzBuzzGame {

	private Fizz fizz = new Fizz();
	private FizzBuzzFoo fizzBuzzFoo = new FizzBuzzFoo();
	private FizzBuzz fizzBuzz = new FizzBuzz();
	private FizzFoo fizzFoo = new FizzFoo();
	private BuzzFoo buzzFoo = new BuzzFoo();
	private Buzz buzz = new Buzz(); 
	private Foo foo = new Foo();

	public String executa(Integer valor) {
		String retorno = valor.toString();

		if (fizzBuzzFoo.validate(valor))
			return fizzBuzzFoo.perform(valor);
		if (fizzBuzz.validate(valor))
			return fizzBuzz.perform(valor);
		if (fizzFoo.validate(valor))
			return fizzFoo.perform(valor);
		if (buzzFoo.validate(valor))
			return buzzFoo.perform(valor);
		if (fizz.validate(valor))
			retorno = fizz.perform(valor);
		if (buzz.validate(valor))
			retorno = buzz.perform(valor);
		if (foo.validate(valor))
			retorno = foo.perform(valor);
		return retorno;
	}

}
