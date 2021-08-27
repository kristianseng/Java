What advantages does this provide? The most important of them is loose coupling.   

public class Viber implements Messenger {  

    public void sendMessage() {  

        System.out.println("Sending a Viber message!");  
    }  

     public void getMessage() {  
         System.out.println("Receiving a Viber message!");  
     }  
}    

Imagine that we're designing a program that will collect client data. The Client class definitely needs a field to indicate which specific messenger the client is using.   



But there's one snag. As you already know, Java has no multiple inheritance. But there is support for multiple interfaces.    
 A class can implement as many interfaces as you want.    
