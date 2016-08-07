//Group members:  Karen, Vonnita & Amy

package movieClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMovies {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String category;
		String title = "";
		String choice = "y";

		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are 12 movies in this list.");

		while (choice.equalsIgnoreCase("y")) {

			ArrayList<Movies> movieList = new ArrayList();

			movieList.add(new Movies("Frozen", "Animated"));
			movieList.add(new Movies("Sponge Bob", "Animated"));
			movieList.add(new Movies("Hotel Transylvania", "Animated"));
			movieList.add(new Movies("The Green Mile", "Drama"));
			movieList.add(new Movies("Castaway ", "Drama"));
			movieList.add(new Movies("Captain Phillips ", "Drama"));
			movieList.add(new Movies("Friday the 13th", "Horror"));
			movieList.add(new Movies("Halloween ", "Horror"));
			movieList.add(new Movies("Chuckie", "Horror"));
			movieList.add(new Movies("Harry Potter", "SciFi"));
			movieList.add(new Movies("Star Trek", "SciFi"));
			movieList.add(new Movies("Planet of the Apes", "SciFi"));

			System.out.print("Which category are you interested in? (Animated/Drama/Horror/SciFi):");
			category = scan1.nextLine();

			System.out.println();

			Movies m1 = new Movies(title, category);
			// **don't entirely understand the need for this if category is already initialized to a String:
			m1.setCategory(scan1.toString());

			// adding valid input check
			if (category.equalsIgnoreCase("animated") || category.equalsIgnoreCase("horror")
					|| category.equalsIgnoreCase("drama") || category.equalsIgnoreCase("scifi")) {
				System.out.println("Here are the movies available in the " + category + " category:");

				// simplifying multiple if statements into a for loop...see github history
				for (int a = 0; a < movieList.size(); a++) {
					if (category.equalsIgnoreCase(movieList.get(a).getCategory())) {
						System.out.println(movieList.get(a).getTitle());
					}
				}
			} else {
				System.out.println("You have entered an invalid option.  Please select a valid choice.");
				continue;
			}

			System.out.println();
			System.out.print("Would you like to select from a different category? (y/n)");
			choice = scan1.nextLine();
		}
		scan1.close();
	}

}
