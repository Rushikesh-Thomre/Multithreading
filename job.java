package threading;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthColorChooserUI;

public class job extends Thread {
	private static int balance = 1000;

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			withdraw(150);
		}

	}

	private static synchronized void withdraw(int amt) {
		System.out.println(Thread.currentThread().getName());
		if (balance > 200) {
			balance = balance - amt;
			System.out.println("Remaining balamnce =" + balance);
		} else {
			System.out.println("insufficient fund ");
		}

	}

}
