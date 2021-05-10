package com.fpt.itrans.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @GetMapping("/iTrans")
    public String test(){
        return "hello";
    }


}
