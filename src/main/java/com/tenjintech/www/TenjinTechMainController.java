package com.tenjintech.www;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TenjinTechMainController {

    /**
     * Handle the root(/) endpoint and return the index page
     * @return
     */
    @RequestMapping("/")
    public String Index(){
        return "index";
    }
    
    
    @RequestMapping(value = "Lesson Plans", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("text", "Our Lesson Plans");
        return "Lesson Plans";
    }
    
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("text", "Welcome to FleetManager");
        return "index";
    }
}
