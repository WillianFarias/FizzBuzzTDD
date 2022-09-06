package main.rules;

public class Default implements IFizzBuzzRules {

	@Override
	public Boolean validate(Integer valor) {
		return (valor % 5 != 0 && valor % 2 != 0 && valor % 3 != 0);
	}

	@Override
	public String perform(Integer valor) {
		return valor.toString();
	}

}
