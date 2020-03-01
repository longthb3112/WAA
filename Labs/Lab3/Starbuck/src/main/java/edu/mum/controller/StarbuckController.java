package edu.mum.controller;

import edu.mum.Repository.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StarbuckController {
    @Autowired
    DataFacade data;

    @RequestMapping(value="/")
    public String welcome() {
        return "login";
    }

    @RequestMapping(value="/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String calculate(@RequestParam String name,@RequestParam String password) {
        String expectedPassword = data.findPassword(name);
        if(expectedPassword == null || !expectedPassword.equals(password)) {
           return "login";
        } else {
            return "login-success";
        }
    }
    @RequestMapping(value="/advice")
    public String getAdvice(@RequestParam("roast") String roast, Model model) {
        List<String> advice = data.getAdvice(roast);
        model.addAttribute("advice",advice);
        model.addAttribute("roast",roast);

        return "display";
    }
}
