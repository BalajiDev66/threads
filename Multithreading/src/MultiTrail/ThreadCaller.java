package MultiTrail;

public class ThreadCaller {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	  ChildThread ct = new ChildThread();
	//  System.out.println(ct.getState());
	 //  ct.setPriority(4);
	  ct.start();
	  ct.interrupt();
	 // ct.join();
	//  System.out.println(ct.getState());
	  for (int i=1; i<=5; i++) {
	  
		  System.out.println("Main Thread  "+i);
	  }
	}

}
