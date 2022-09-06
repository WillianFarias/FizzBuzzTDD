package main.rules;

public class FizzBuzzRulesContext {

	private IFizzBuzzRules[] rules;

	public FizzBuzzRulesContext() {
		this.rules[0] = new Fizz();
		this.rules[1] = new Foo();
		this.rules[2] = new FizzFoo();
		this.rules[3] = new FizzBuzzFoo();
		this.rules[4] = new FizzBuzz();
		this.rules[5] = new BuzzFoo();
		this.rules[6] = new Buzz();
	}

	public IFizzBuzzRules findRule(Integer number) {
		for (IFizzBuzzRules fizzBuzzRules : rules) {
			if (fizzBuzzRules.validate(number))
				return fizzBuzzRules;
		}
		return null;
	}
}
