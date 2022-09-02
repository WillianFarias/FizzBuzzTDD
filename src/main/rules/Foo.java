package main.rules;

public class Foo implements IFizzBuzzRules {

	@Override
	public Boolean validate(Integer valor) {
		return (valor % 2 == 0);
	}

	@Override
	public String perform(Integer valor) {
		return validate(valor) ? "Foo" : "";
	}

}
