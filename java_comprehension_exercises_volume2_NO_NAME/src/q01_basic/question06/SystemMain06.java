package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws IOException {

		ConsoleReader cr = new ConsoleReader();

		cr.inputString();
		cr.inputNumber();

		try {

			cr.inputNumber();
			cr.inputString();

		} catch (IOException e) {

			e.printStackTrace();

		} catch (NumberFormatException e) {

			System.out.println("error");
			e.printStackTrace();
			return;
		}

		int id = cr.inputNumber();
		String password = cr.inputString();
		String name = "Miura Manabu";
		int age = 25;
		int rank = 3;

		Member member = new Member(id, password, name, age, rank);

	}

}
