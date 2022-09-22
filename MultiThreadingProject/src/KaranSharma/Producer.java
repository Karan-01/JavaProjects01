/*
 * 
Q.3 Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If demanding number is greater than availableProduct
  consumer should wait till supply increases the availableProduct. 
 */
package KaranSharma;

class DemandSupply
{
	int availProduct=13;
	synchronized public void demandMethod(int avail)
	{
		if(availProduct<avail) 
		{
			try {
				wait(150);
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		else
			availProduct-=avail;
			System.out.println("Demand product:-"+availProduct);
		}
	
	synchronized public void supplyMethod(int i)
	{
		availProduct+=i;
		System.out.println("supply product:-"+availProduct);

		notify();
	}
}
class MyThread1 extends Thread{
	 DemandSupply ds;
	MyThread1( DemandSupply ds)
	{
		this.ds=ds;
	}
	public void run()
	{
		ds.demandMethod(1);
	}
}class MyThread2 extends Thread{
	 DemandSupply ds;
	MyThread2( DemandSupply ds)
	{
		this.ds=ds;
	}
	public void run()
	{
		ds.supplyMethod(2);
	}
} 
public class Producer {

	public static void main(String[] args) {
		
		 DemandSupply ds=new  DemandSupply();
			MyThread1 th=new MyThread1(ds);
			MyThread2 th1=new MyThread2(ds);
			th.start();
			th1.start();

	}

}