package mum.edu.validator;

import mum.edu.domain.Calculator;

import java.util.ArrayList;
import java.util.List;


public class CalculatorValidatorImpl implements CalculatorValidator {
	
	public List<String> validate(Object  object ) {
		List<String> errors = new ArrayList<String>();
		
		Calculator calculator = (Calculator) object;
		Integer add1 = calculator.getAdd1();
		if (add1 == null) {
			errors.add("First textbox must have a number");
		}
		Integer add2 = calculator.getAdd2();
		if (add2 == null) {
			errors.add("Second textbox must have a number");
		}
		return errors;
	}
}
