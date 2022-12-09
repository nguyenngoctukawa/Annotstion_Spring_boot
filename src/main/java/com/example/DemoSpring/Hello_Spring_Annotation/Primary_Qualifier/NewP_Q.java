package com.example.DemoSpring.Hello_Spring_Annotation.Primary_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewP_Q {
    @Autowired
    @Qualifier("PA")
    public OutfitP_Q outfitP_q;
    public NewP_Q(){

    }
    public NewP_Q(OutfitP_Q outfitP_q){
        this.outfitP_q =outfitP_q;
    }

    public OutfitP_Q getOutfitP_q() {
        return outfitP_q;
    }

    public void setOutfitP_q(OutfitP_Q outfitP_q) {
        this.outfitP_q = outfitP_q;
    }
}
