package Multithreading;

public class ThreadCaller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChildThread ct = new ChildThread();
	    ct.start();
	    ct.interrupt();
	    for (int i=0;i<=5; i++)
	    {
	    System.out.println("MainThread "+i);
	    }
	}

}
