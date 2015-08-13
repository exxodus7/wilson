package com.sslab.test;

import com.apple.eawt.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author lauren
 */
@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    @Autowired
    private CommonRepository repository;
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
        
        repository.deleteAll();
        
        // save a couple of objects
        ICommonObject objectA = new CommonObject();
        
    }
}
