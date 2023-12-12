package threading;

public class Trigger {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		job jj = new job();
		jj.setName("Amazon");
		jj.start();
		
		job jx = new job ();
		jx.setName("filpkard");
		jx.start();
	}
}
