package main.rules;

public class Fizz implements IFizzBuzzRules {

	private String fizz = "Fizz";

	@Override
	public Boolean validate(Integer valor) {
		return valor % 3 == 0;
	}

	@Override
	public String perform(Integer valor) {
		return this.validate(valor) ? this.fizz : "";
	}
}
