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
}
