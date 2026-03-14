package learning_java_based_spring_config;

public class Desktop {
    private String brand;
    
    public Desktop() {
        System.out.println("Object of Desktop class is created with hashcode: "+this.hashCode() );
        
    }
    
    public void compile(){
        System.out.println("Compiling from the desktop object...");
    }

    public int returnHascode(){
        return this.hashCode();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}
