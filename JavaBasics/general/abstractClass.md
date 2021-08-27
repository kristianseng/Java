Abstract class is simply a **'blueprint'** we will use later to create classes.      

1) you can't create an instance of an abstract class  
2) Note: two methods in the abstract class are also designated as abstract, and they don't have any implementation.   
The reason is the same: **abstract classes don't create default behavior for abstract cars. They just indicate what every car should be able to do. **  
3) a class is abstract if **at least one of its methods is abstract. ** 
4) At the same time, **if a method is marked with the word abstract, each child class must implement it or declare it as abstract.** Otherwise, the compiler will generate an error.   

 
public abstract class Car {  

   private String model;  
   private String color;  
   private int maxSpeed;  

   public abstract void gas();  

   public abstract void brake();  

   public String getModel() {  
       return model;  
   }  

   public void setModel(String model) {   
       this.model = model;  
   }  

   public String getColor() {  
       return color;  
   }  

   public void setColor(String color) {  
       this.color = color;  
   }  

   public int getMaxSpeed() {  
       return maxSpeed;  
   }  

   public void setMaxSpeed(int maxSpeed) {  
       this.maxSpeed = maxSpeed;  
   }  
}  


public class Sedan extends Car {

   @Override
   public void gas() {
       System.out.println("The sedan is accelerating!");
   }

   @Override
   public void brake() {
       System.out.println("The sedan is slowing down!");
   }

}
