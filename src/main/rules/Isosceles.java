package main.rules;

public class Buzz implements IFizzBuzzRules {

	@Override
	public Boolean validate(Integer valor) {
		return (valor % 5 == 0);
	}

	@Override
	public String perform(Integer valor) {
		return validate(valor) ? "Buzz" : "";
	}

}
