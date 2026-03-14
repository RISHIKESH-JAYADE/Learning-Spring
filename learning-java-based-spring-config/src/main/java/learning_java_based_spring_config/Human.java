package learning_java_based_spring_config;

public class Human {

    private int age;
    private String name;
    private Desktop desktopMachine;
   

    public Human(){
        System.out.println("Object of Human class is created with hashcode: "+this.hashCode() );
    }

    //getter and setter methods for age and name
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Desktop getDesktopMachine() {
        return desktopMachine;
    }

    public void setDesktopMachine(Desktop desktopMachine) {
        this.desktopMachine = desktopMachine;
    }
    
    //functionality of human 

    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
    public void work(){
        System.out.println("Working with desktop with hashcode: "+ this.desktopMachine.returnHascode());
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", name=" + name + ", desktopMachine ID=" + desktopMachine.returnHascode() + 
                        " desktop Brand=" + desktopMachine.getBrand() + "]";
    }

    
    

}
