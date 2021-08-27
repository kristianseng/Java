class Clock implements Runnable
{
private boolean isCancel = false;

public void cancel()
{
this.isCancel = true;
}

public void run()
{
while (!isCancel)
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
clock.cancel();
}
}
