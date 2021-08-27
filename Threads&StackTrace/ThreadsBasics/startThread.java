//Class that implements the Runnable interface.

class Printer implements Runnable
{
public void run()
{
System.out.println("I’m printer");
}
}

// 1 Create an instance of the Printer class, which implements the run method.
// 2 Create a new Thread object. We pass the constructor the printer object, whose // run() method needs to be invoked.
// 3 Start the new thread by calling the start() method.

public static void main(String[] args)
{
Printer printer = new Printer();
Thread childThread = new Thread(printer);
childThread.start();
}


Can implement Runnable or extends Thread !

To tell a Thread object which specific method it should start, we need to somehow pass a method to it. In Java, this is done using the Runnable interface. This interface contains a single abstract method: void run(). The Thread class has a Thread(Runnable Runnable) constructor. You can pass in any object that implements the Runnable interface.

Your class must inherit Runnable and override its run method. Invoking this method is what starts the new thread. You can write whatever you want in the run method.


What's more, you can combine this all into one class. The Thread class inherits the Runnable interface, so you only need to override its run method
