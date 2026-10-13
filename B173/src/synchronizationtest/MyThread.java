package synchronizationtest;

public class MyThread extends Thread{
	
	Hello h;
	String msg;
	
	public MyThread(String msg,Hello h)
	{
		this.h=h;
		this.msg=msg;
		
	}
	
	@Override
	public void run() {
		
		
		h.display(msg);
	}

}
