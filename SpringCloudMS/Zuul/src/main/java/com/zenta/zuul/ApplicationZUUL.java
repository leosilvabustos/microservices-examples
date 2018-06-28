/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zenta.zuul;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableDiscoveryClient
@EnableZuulProxy
/**
 *
 * @author Nb-Zenta
 */
public class ApplicationZUUL {
    public static void main( String[] args )
    {
        SpringApplication.run(ApplicationZUUL.class, args);
    }
}
