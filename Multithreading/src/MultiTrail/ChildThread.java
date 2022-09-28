package MultiTrail;

public class ChildThread extends Thread {
	
	public void run() {
		
	
	for(int i=1; i<=5; i++)
	{
		try {
			Thread.sleep(2000);
			System.out.println("Chid Thread "+i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("My sleep got interrupted");
			//e.printStackTrace();
		}
		Thread.yield();
	//	System.out.println("Chid Thread "+i);
	}

}

}



