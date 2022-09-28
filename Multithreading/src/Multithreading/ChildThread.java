package Multithreading;

public class ChildThread extends Thread {

	
		public void run()
		{
			for (int i=1; i<=5; i++)
			{
				try {
					Thread.sleep(3000); 
					System.out.println("ChildThread "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					
					System.out.println("My sleep got interrupted");
				//	e.printStackTrace();
				}
				Thread.yield();
				
			}
		}
	}


