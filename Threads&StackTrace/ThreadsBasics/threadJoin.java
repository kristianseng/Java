class Printer implements Runnable
{
private String name;
public Printer(String name)
{
this.name = name;
}
public void run()
{
System.out.println("I’m " + this.name);
}
}

public static void main(String[] args)
{
Printer printer1 = new Printer("Nick");
Thread thread1 = new Thread(printer1);
thread1.start();

thread1.join();     // Main thread waits thread1 to be done
}
