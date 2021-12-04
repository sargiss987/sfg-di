package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = (PetController) context.getBean("petController");
		System.out.println("-----------The Best Pet is");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) context.getBean("myController");

		System.out.println("---------------- Primary");
		System.out.println(myController.sayHello());

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");

		System.out.println("---------------- Property");
		System.out.println(propertyInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

		System.out.println("---------------- Constructor");
		System.out.println(constructorInjectedController.getGreeting());

		SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

		System.out.println("---------------- Setter");
		System.out.println(setterInjectedController.getGreeting());


	}

}
