/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.chumtestb.web.api.controller;

import com.pablinchapin.chumtestb.web.api.model.Greeting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pvargas
 */

@RestController
public class GreetingController {
    
    private static final String template = "Hello, %s!";
    
    @RequestMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable("name") String name){
        return new Greeting(String.format(template, name));
    }
    
}
