package main.rules;

public class FizzBuzzRulesContext {

	private IFizzBuzzRules[] rules = new IFizzBuzzRules[7];

	public FizzBuzzRulesContext() {
		this.rules[0] = new FizzBuzzFoo();
		this.rules[1] = new BuzzFoo();
		this.rules[2] = new FizzFoo();
		this.rules[3] = new FizzBuzz();
		this.rules[4] = new Buzz();
		this.rules[5] = new Fizz();
		this.rules[6] = new Foo();
	}

	public IFizzBuzzRules findRule(Integer number) {
		for (IFizzBuzzRules fizzBuzzRules : rules) {
			if (fizzBuzzRules.validate(number))
				return fizzBuzzRules;
		}
		return null;
	}
}
