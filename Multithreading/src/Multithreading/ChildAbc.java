package Multithreading;

public class ChildAbc extends Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ChildAbc Childabc = new ChildAbc();
     Childabc.start();
	}
    public void run()
    {
    	System.out.println("Child of ABC");
    }
}
