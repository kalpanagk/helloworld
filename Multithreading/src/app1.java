 class app1 implements Runnable{
	
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("hello world" +i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
	}

}
