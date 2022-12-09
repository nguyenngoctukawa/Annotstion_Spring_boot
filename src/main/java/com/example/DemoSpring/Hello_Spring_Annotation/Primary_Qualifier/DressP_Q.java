package com.example.DemoSpring.Hello_Spring_Annotation.Primary_Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("DE")
//@Primary
public class DressP_Q implements OutfitP_Q{
    @Override
    public void wear(){
        System.out.println("Primary_Qualifier");
    }
}
