package main;

import main.rules.FizzBuzzRulesContext;
import main.rules.IFizzBuzzRules;

public class FizzBuzzGame {

	private FizzBuzzRulesContext fizzBuzzRulesContext = new FizzBuzzRulesContext();

	public String executa(Integer valor) {
		IFizzBuzzRules rule = fizzBuzzRulesContext.findRule(valor);

		return rule.perform(valor);
	}
}
