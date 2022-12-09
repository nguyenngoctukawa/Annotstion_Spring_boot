package com.example.DemoSpring.Hello_Spring_Annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class DressAtw implements Outfit {
    @Override
    public void wear(){
        System.out.println("Autowired");
    }
}
