package com.example.DemoSpring.Hello_Spring_Annotation.Primary_Qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PA")

public class PackegeP_Q implements OutfitP_Q {
    @Override
    public void wear(){
        System.out.println("bai moi");
    }
}
