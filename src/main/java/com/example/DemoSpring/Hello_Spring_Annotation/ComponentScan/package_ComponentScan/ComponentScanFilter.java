package com.example.DemoSpring.Hello_Spring_Annotation.ComponentScan.package_ComponentScan;

import org.springframework.stereotype.Component;

@Component
public class ComponentScanFilter {
    public void wear(){
        System.out.println("ComponentScan_package");
    }
}
