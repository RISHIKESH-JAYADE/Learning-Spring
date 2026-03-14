package learning_java_based_spring_config.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import learning_java_based_spring_config.Desktop;
import learning_java_based_spring_config.Human;

@Configuration          //Indicates that this class contains Spring configuration
public class AppConfig {

    @Bean(name = "d0")                 //Indicates that this method produces a bean to be managed by the Spring container
    @Primary //This annotation is used to indicate that this bean should be given preference when multiple beans of the same type are present in the Spring container. It is used to resolve ambiguity when there are multiple beans of the same type.
    public Desktop desktop(){ //Bean name is "desktop" by default, which is the method name.
        Desktop desktop =  new Desktop();
        desktop.setBrand("Dell XPS");
        return desktop;
    }
    
    //By default, all the beans are singleton in Spring, which means that the same instance will be returned every time the bean is requested from the container.
    // Singleton: Object created once and shared across the application.
    // Prototype: A new instance is created every time the bean is requested.


    @Bean(name ="d1" )
    @Scope("prototype") //This bean will be created as a new instance every time it is requested from the Spring container.
    public Desktop desktop1(){
        Desktop desktop = new Desktop();
        desktop.setBrand("Lenovo Thinkpad");
        return desktop;
    }


    //Rishikesh is using d1
    @Bean
    public Human h1(@Qualifier("d1") Desktop desk){ //Qualifier is same as ref in xml configuration, it is used to specify which bean to inject when there are multiple beans of the same type.
        Human human = new Human();
            human.setAge(25);
            human.setName("Rishikesh");
            human.setDesktopMachine(desk); //Injecting the desktop bean into the human bean.

        return human;
    }

    @Bean
    public Human h2( Desktop desk){ 
        Human human = new Human();
            human.setAge(30);
            human.setName("Dattaraj");
            human.setDesktopMachine(desk);

        return human;
    }

}
