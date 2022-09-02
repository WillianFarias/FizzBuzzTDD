package main.rules;

public class FizzBuzz implements IFizzBuzzRules {

	@Override
	public Boolean validate(Integer valor) {
		return (valor % 3 == 0 && valor % 5 == 0);
	}

	@Override
	public String perform(Integer valor) {
		return validate(valor) ? "FizzBuzz" : "";
	}

}
