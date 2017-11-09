package pl.oskarpolak.firstApplication2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/hello/{age}", method = RequestMethod.GET)
    public String index(@PathVariable("age") int age, Model model){
        model.addAttribute("age", age);
        return "hello";
    }




}
