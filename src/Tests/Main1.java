package Tests;

import Anzeige.Anzeige;

import javax.swing.SwingUtilities;

public class Main {
	private static TestSprint1 test = new TestSprint1();

	public static void main(String[] args) {
		System.out.println("Test Mt1");
		test.MT1();

		System.out.println("Test Mt2");
		test.MT2();

		System.out.println("Test Mt3");
		test.MT3();

		System.out.println("Test It1");
		test.IT1();

		System.out.println("Test It2");
		test.IT1();

		// GUI-Start auf Event Dispatch Thread
		SwingUtilities.invokeLater(() -> {
			Anzeige anzeige = Anzeige.getInstance();
			anzeige.showAnzeige();
		});
	}
}

