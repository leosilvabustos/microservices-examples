/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenta.microservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nb-Zenta
 */
public class Repository {
  
    private Map<Integer, FutbolSelection> repo;
    public Repository(){
        repo = new HashMap();
        repo.put(1, new FutbolSelection(1, "Chile", 1));
        repo.put(2, new FutbolSelection(2, "Brasil", 2));
        repo.put(3, new FutbolSelection(3, "Uruguay", 3));
        repo.put(4, new FutbolSelection(4, "Colombia", 4));
        repo.put(5, new FutbolSelection(5, "Peru", 5));
        
    }
    
    public List<FutbolSelection> getAll(){
        List<FutbolSelection> list = new ArrayList<FutbolSelection>();
        for( Map.Entry<Integer, FutbolSelection> entry : repo.entrySet()){
            list.add((FutbolSelection) entry.getValue());
        };
        return list;
    }
    
    public FutbolSelection get(int id) {
        if(repo.containsKey(id)){
            return repo.get(id);
        }
        return null;
    }
}
