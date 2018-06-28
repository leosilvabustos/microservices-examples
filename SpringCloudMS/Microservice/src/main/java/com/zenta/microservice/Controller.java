/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenta.microservice;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nb-Zenta
 */
@RestController
public class Controller {
    
    private Repository repo = new Repository();
    
    @RequestMapping(value="/selections/{id}", method=RequestMethod.GET)
    public FutbolSelection getById(@PathVariable Integer id){
        return repo.get(id);
    }
    
    @RequestMapping(value="/selections", method=RequestMethod.GET)
    public List<FutbolSelection> getById(){
        return repo.getAll();
    }
}
