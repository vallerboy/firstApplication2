package pl.oskarpolak.firstApplication2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "Logowanie!";
    }

}
