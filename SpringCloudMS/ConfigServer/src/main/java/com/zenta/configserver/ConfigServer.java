/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenta.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author Nb-Zenta
 */
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigServer {
    
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer.class, args);
    }
    
}
