/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenta.microservice;

/**
 *
 * @author Nb-Zenta
 */
public class FutbolSelection {
    
    private int id;
    private String name;
    private int fifaRank;

    public FutbolSelection(){}
    
    public FutbolSelection(int i, String n, int r){
        this.id = i;
        this.name = n;
        this.fifaRank=r;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFifaRank() {
        return fifaRank;
    }

    public void setFifaRank(int fifaRank) {
        this.fifaRank = fifaRank;
    }
    
    
    
}
