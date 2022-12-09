package com.example.DemoSpring.Hello_Spring_Annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewDresAtw {
    @Autowired
    public  Outfit outfit;
    public NewDresAtw(){
    }
    public NewDresAtw(Outfit outfit){
        this.outfit=outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }
}
