package com.example.DemoSpring.Hello_Spring_Annotation;

import com.example.DemoSpring.Hello_Spring_Annotation.Autowired.NewDresAtw;
import com.example.DemoSpring.Hello_Spring_Annotation.Component.Dress;
import com.example.DemoSpring.Hello_Spring_Annotation.ComponentScan.package_ComponentScan.ComponentScanFilter;
import com.example.DemoSpring.Hello_Spring_Annotation.Primary_Qualifier.NewP_Q;
import com.example.DemoSpring.Hello_Spring_Annotation.Scope.DressFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.example.DemoSpring.Hello_Spring_Annotation.ComponentScan.package_ComponentScan")
@SpringBootApplication
public class HelloSpringAnnotationApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(HelloSpringAnnotationApplication.class, args);

//		ComponentScanFilter componentScanFilter=context.getBean(ComponentScanFilter.class);
//		System.out.println("ComponentScan: " +componentScanFilter); COMPONENTSCAN
//		"Dress dress=context.getBean(Dress.class);
//		System.out.println("Dress: " +dress);
//		dress.Wear();" Component
//		"NewDresAtw newDresAtw= context.getBean(NewDresAtw.class);
//		System.out.println("NewDressAtw : "+newDresAtw);
//		System.out.println("Autowired: "+newDresAtw.outfit);
//		newDresAtw.outfit.wear();" Autowired
//		"DressFilter dress1 = context.getBean(DressFilter.class);
//		DressFilter dress2 = context.getBean(DressFilter.class);
//		System.out.println("Dress1: "+ dress1);
//		System.out.println("Dress2: "+ dress2) ;" Scope
		NewP_Q newP_q=context.getBean(NewP_Q.class);
		System.out.println("NewP_Q : "+ newP_q);
		System.out.println("NewP_Q--- Outfit : "+ newP_q.outfitP_q);



	}

}
