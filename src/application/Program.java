package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.service.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Students> set = new HashSet<>();
		clearScreen();
		
		System.out.print("Hi Teatcher: how many classes do you apply? ");
        int number_classes = sc.nextInt();
		
		for (int x = 1; x <= number_classes; x++) {
			System.out.println("How many studenst in your " + x + " class ");
			int number_Students = sc.nextInt();

			for (int i = 1; i <= number_Students; i++) {
				sc.nextLine();
				clearScreen();
				System.out.print("name: ");
				String name = sc.nextLine();
				System.out.print("ID: ");
				int id = sc.nextInt();
				set.add(new Students(name, id));
			}
		}

		clearScreen();
		System.out.println("\nNumber of Students: " + set.size());
		for (Students s : set) {
			System.out.println(s);
		}
		sc.close();

	}
	public static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

}
