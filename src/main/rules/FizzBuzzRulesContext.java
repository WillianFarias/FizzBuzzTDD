package main.rules;

public class FizzBuzzRulesContext {
	
	private static final int QUANTIDADE_RULES = 8;
	
	private IFizzBuzzRules[] rules = new IFizzBuzzRules[QUANTIDADE_RULES];

	public FizzBuzzRulesContext() {
		this.rules[0] = new Default();
		this.rules[1] = new FizzBuzzFoo();
		this.rules[2] = new BuzzFoo();
		this.rules[3] = new FizzFoo();
		this.rules[4] = new FizzBuzz();
		this.rules[5] = new Buzz();
		this.rules[6] = new Fizz();
		this.rules[7] = new Foo();
	}

	public IFizzBuzzRules findRule(Integer number) {
		for (IFizzBuzzRules fizzBuzzRules : rules) {
			if (fizzBuzzRules.validate(number))
				return fizzBuzzRules;
		}
		return null;
	}
}
