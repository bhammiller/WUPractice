package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {


    // METHODS ////////////
    @GetMapping("/getcity")
    public String findLocation(){

        return "inputpage";
    }

    @PostMapping("/getcity")
    public String processLocation(@Valid @ModelAttribute("getdate") DateQuerry dateQuerry, BindingResult result,
             Model model){
        if (result.hasErrors()) {
            System.out.println(result.toString());
            return "inputpage";
        } else {

            return "redirect:/showcity";
        }
    }

    @GetMapping("/showcity")

    public String showLocation(Model model){
        return "outputpage";
    }
}
