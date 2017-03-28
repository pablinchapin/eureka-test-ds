/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pablinchapin.chumtestb.web.api.model;

import java.io.Serializable;

/**
 *
 * @author pvargas
 */
public class Greeting implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private final String content;
    
    public Greeting(String content){
        this.content = content;
    }
    
    public String getContent(){
        return content;
    }
    
}