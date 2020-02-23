package mum.edu.controller;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.CalculatorValidator;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class CalculatorController {

@AutoWired
CalculatorValidator calculatorValidator;
	
@RequestMapping(value={"/"})
 	public String inputCalculation(HttpServletRequest request,
			HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}

@RequestMapping(value={"/calculator_save"})
	public String saveCalculator(Calculator calculator, HttpServletRequest request,
			HttpServletResponse response) {
         List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {
            request.setAttribute("calculator", calculator);
            return "/WEB-INF/jsp/result.jsp";
        } else {
  
            // store errors and product in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", calculator);
            return "/WEB-INF/jsp/calculator.jsp";
        }
 	}
}
