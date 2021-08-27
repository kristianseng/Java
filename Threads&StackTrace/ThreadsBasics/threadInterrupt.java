/* sleep method, which people are so fond of using in endless loops in the run method, automatically checks the isInterrupt variable
If it is true, the method won't sleep. Instead, it throws an InterruptedException exception.



*/
class Clock implements Runnable
{
public void run()
{
Thread current = Thread.currentThread();

while (!current.isInterrupted())
{
Thread.sleep(1000);
System.out.println("Tick");
}
}
public static void main(String[] args)
{
Clock clock = new Clock();
Thread clockThread = new Thread(clock);
clockThread.start();

Thread.sleep(10000);
clockThread.interrupt();
}
}

