package com.example.DemoSpring.Hello_Spring_Annotation.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//singletor
public class DressFilter {

    public void Wear(){
        System.out.println("Scan");
    }
}
