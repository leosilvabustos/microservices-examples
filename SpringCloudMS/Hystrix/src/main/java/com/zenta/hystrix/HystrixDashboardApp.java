/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenta.hystrix;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author Nb-Zenta
 */
@Configuration
@EnableAutoConfiguration
@EnableHystrixDashboard
@ComponentScan
@EnableTurbine
public class HystrixDashboardApp {
    
    public static void main( String[] args )
    {
      new SpringApplicationBuilder(HystrixDashboardApp.class).web(true).run(args);
    }
    
}
