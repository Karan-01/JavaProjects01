/* @KaranSharma
Q.2 Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.
*/
package KaranSharma;

class FibonacciReverseSeries
{
	synchronized static public void fibonacci()
	{
		System.out.println(Thread.currentThread().getName()+"....Fibonacci Series.....");
		int a=0,b=1,c,i;
		System.out.print(a+" "+b);
		for(i=2;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	
	synchronized static public void reverse()
	{
		System.out.println("\n"+Thread.currentThread().getName()+"....Reverse order.....");
		for(int i=10;i>=1;i--)
		{
			System.out.println("Reverse order : "+i);
		}
	}
}


class NewThread implements Runnable
{

	@Override
	public void run()
	{
		FibonacciReverseSeries frs=new FibonacciReverseSeries();
		frs.fibonacci();
	}
}


class NewThread1 implements Runnable
{

	@Override
	public void run()
	{
		FibonacciReverseSeries frs=new FibonacciReverseSeries();
		frs.reverse();
	}
}

public class FiboRevThread {

	public static void main(String[] args) {
		FibonacciReverseSeries frs=new FibonacciReverseSeries();
		NewThread t=new NewThread();
		NewThread1 t1=new NewThread1();
		
		Thread th1=new Thread(t,"Thread 1 ");
		Thread th2=new Thread(t1,"Thread 2 ");
		
		th1.start();
		th2.start();
	}
}