public class Sum_single implements Runnable{
	static final int MAX = 400000000;
	static final int NT = 1;
	static int id = 0;
	static long sum = 0;

	public void run(){
		long run_sum = 0;
		long start;
		long end;

		/*
		* setting start point,  
		*/
		synchronized(this){
			start = (MAX/NT) * id + 1;
			end = MAX/NT * (id+1);
			 
			id++;
		}
		
		for(long i=start; i<=end;i++){
			run_sum += i;
		}

		synchronized(this){
			sum  += run_sum;
		}
	}

	public static void main(String[] args) throws InterruptedException{
		Sum_single test = new Sum_single();
		Thread[] at = new Thread[NT];
		
		for(int i=0; i<NT; i++){
			at[i] = new Thread(test);
			at[i].start();
		}

		for(Thread t:at)
			t.join();
		System.out.println(test.sum);
	}

}
