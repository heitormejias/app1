package br.com.heitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.log4j.Log4j;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@Log4j
public class App 
{
    public static void main( String[] args )
    {
    	try {
			SpringApplication.run(App.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
