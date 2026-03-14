package learning_java_based_spring_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning_java_based_spring_config.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Desktop desktop = context.getBean("desktop",Desktop.class); //Retrieving the Desktop bean from the Spring container.

        Desktop d0 = context.getBean("d0",Desktop.class);
        d0.compile();

        Desktop d1 = context.getBean("d0",Desktop.class); 
        //The hascode will be printed only once because it is called via consturctor and same object is returned every time a new bean is requested because it is singleton.
        d1.compile();

        Desktop d2 = context.getBean("d1",Desktop.class);
        d2.compile();

        Desktop d3 = context.getBean("d1",Desktop.class);
        d3.compile();


        System.out.println("================================");
        System.out.println("============Human Bean==========");
        System.out.println("================================");
        Human h1 = context.getBean("h1",Human.class);
        System.out.println(h1.toString()); 

        Human h2 = context.getBean("h2",Human.class);
        System.out.println(h2.toString());
        
    }
}