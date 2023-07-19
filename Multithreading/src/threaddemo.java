
public class threaddemo extends Thread{
	
	public static void main(String args[]) {
		
		threaddemo t1 = new threaddemo();
		threaddemo t2 = new threaddemo();
		
		System.out.println("name of the thread is" +t1.getName());
		System.out.println("name of the thread is" +t2.getName());
		System.out.println("name of the thread is" + Thread.currentThread().getName());
		
		System.out.println("name of the thread is" +t1.getPriority());
		System.out.println("name of the thread is" +t2.getPriority());
		System.out.println("name of the thread is" + Thread.currentThread().getPriority());
		
		
		
		
	}

}
