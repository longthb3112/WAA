package edu.mum.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;
import edu.mum.validator.CalculatorValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController  {


    @Autowired
    CalculatorValidator calculatorValidator;

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value={"/","/calculator"})
    public String inputCalc(Calculator calculator)   {
        return  "CalculatorForm" ;
    }

    @RequestMapping(value="/calculatorSave")
    public String handleCalc(Calculator calculator, HttpServletRequest request, HttpServletResponse response )   {
        List<String> errors = calculatorValidator.validate(calculator);
        if (errors.isEmpty()) {
            calculatorService.add(calculator);
            calculatorService.mult(calculator);

            request.setAttribute("calculator", calculator);
            return "CalculatorView";
        } else {
            // store errors and calculator in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("calculator", calculator);
            return "CalculatorForm";
        }
    }
}
