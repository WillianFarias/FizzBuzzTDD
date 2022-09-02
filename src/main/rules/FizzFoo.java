package main.rules;

public class FizzFoo implements IFizzBuzzRules {

	@Override
	public Boolean validate(Integer valor) {
		return (valor % 3 == 0 && valor % 2 == 0);
	}

	@Override
	public String perform(Integer valor) {
		return validate(valor) ? "FizzFoo" : "";
	}

}
