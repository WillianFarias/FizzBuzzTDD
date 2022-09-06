package main;

import main.rules.FizzBuzzRulesContext;
import main.rules.IFizzBuzzRules;

public class FizzBuzzGame {

	private FizzBuzzRulesContext fizzBuzzRulesContext = new FizzBuzzRulesContext();

	public String executa(Integer valor) {
		String retorno = valor.toString();
		IFizzBuzzRules rule = fizzBuzzRulesContext.findRule(valor);

		if (rule != null)
			return rule.perform(valor);

		return retorno;
	}

}
