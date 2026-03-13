package com.learning.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Alien obj = new Alien();    //The object is created by programmer and he needs to maintain it.
        //obj.Coding();
        /*
        We are learning Spring Framework.
        Spring consist of a IoC(inversion of control) Container.
        Spring objects are called beans.
        */
        //IOC Container  -> Spring maintains objects and ther lifecycle. 
        //We can ask Spring to give us the object when we need it. This is called Dependency Injection.
        //Spring has 2 types of IOC Container : BeanFactory(old) and ApplicationContext(new)


        // This line creats an IOC container and we can access the objects present in it.
        // spring.xml file is the configuration file which needs to passed.
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // we created a spring container and the configuration for that container is present in spring.xml file.
        // The moment we create the container, all the objects present in that container (spring.xml) are created. This is called Eager Instantiation. 
        
        
        // We can also create the objects when we need them. This is called Lazy Instantiation. 
        
        Alien a1 = (Alien)context.getBean("alien"); // we are asking spring container to give us the object of Alien class. The name of the object is alien which is present in spring.xml file.
        a1.Coding();

        Alien a2 = (Alien)context.getBean("alien"); 
        a2.Coding();

        //Output:
        //Object of Alien class is created.
        //Coding...366712642   
        //Coding...366712642
        // We can see that the hashcode of both the objects is same which means both a1 and a2 are pointing to the same object.
        //We can call multiple times the getBean method on same bean_id but it will always return the same object.

        Alien a3 = (Alien)context.getBean("alien2");

        a3.Coding();

        //Output:
        //Object of Alien class is created.
        // Object of Alien class is created.
        // Coding...274722023
        // Coding...274722023
        // Coding...521960438
        // We can see that the hashcode of a3 is different from a1 and a2 which means a3 is pointing to a different object.
        // The number of objects created in the spring container is 2 because we have defined 2 beans in the spring.xml file.


        //Prototype Scope : If we want to create a new object every time we call the getBean method then we need to use prototype scope. 
        // Check spirng.xml file for more details.
        Alien a4 = (Alien) context.getBean("alien3");
        a4.Coding();
        
        Alien a5 = (Alien) context.getBean("alien3");
        a5.Coding();

        //Output:
        // Object of Alien class is created.
        // Object of Alien class is created.
        // Coding...274722023
        // Coding...274722023
        // Coding...521960438
        // Object of Alien class is created.
        // Coding...632587706
        // Object of Alien class is created.
        // Coding...726950788
        
        //The beans with prototype scope are created every time we call the getBean method. 
        //So, in the above example, we have called the getBean method 2 times for the bean with id alien3, so 2 objects are created for that bean.
        //Lazy instantiation. a new objects are created when we call the getBean.


        System.out.println("================================");
        System.out.println("--------Setter Injection--------");
        System.out.println("================================");
        //Setter Injection : We can set the values of the properties of the bean using setter methods.
        Alien a6 = (Alien) context.getBean("alien4");
        //System.out.println("Age of Alien is: "+ a6.getAge());
        a6.show();


        System.out.println("================================");
        System.out.println("------Constructor Injection-----");
        System.out.println("================================");
        //Constructor Injection : We can set the values of the properties of the bean using constructor.

        Alien a7 = (Alien) context.getBean("alien5");
        a7.show();

        System.out.println("================================");
        System.out.println("------Interface-----");
        System.out.println("================================");
        NewAlien a8 = (NewAlien) context.getBean("alien6");
        a8.show();


        NewAlien a9 = (NewAlien) context.getBean("alien7");
        a9.show();
    }
}
