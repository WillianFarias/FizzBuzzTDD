package main.rules;

public class BuzzFoo implements IFizzBuzzRules {

	@Override
	public Boolean validate(Integer valor) {
		return (valor % 5 == 0 && valor % 2 == 0);
	}

	@Override
	public String perform(Integer valor) {
		return validate(valor) ? "BuzzFoo" : "";
	}

}
