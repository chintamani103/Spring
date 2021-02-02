/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nc.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author INTEL
 */
@RestController
public class HelloRestController {
    
    @RequestMapping("/")    
    public String index() {
		return "Hello World!";
	}
    
}
