package movieClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMovies {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		String category;
		String title = "";
		String choice = "y";

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
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println();
		System.out.println("There are 12 movies in this list.");
		System.out.print("Which category are you interested in? (Animated/Drama/Horror/SciFi):");
		
		category = scan1.nextLine();
		
		System.out.println();
		System.out.println("Here are the movies available in the " + category + " category:");
		
		Movies m1 = new Movies(title, category);
		m1.setTitle(title);
		m1.setCategory(category);
		
		if(category.equalsIgnoreCase("animated")){
			System.out.println(movieList.get(0).getTitle());
			System.out.println(movieList.get(1).getTitle());
			System.out.println(movieList.get(2).getTitle());
		}
		if(category.equalsIgnoreCase("drama")){
			System.out.println(movieList.get(3).getTitle());
			System.out.println(movieList.get(4).getTitle());
			System.out.println(movieList.get(5).getTitle());
		}
		if(category.equalsIgnoreCase("horror")){
			System.out.println(movieList.get(6).getTitle());
			System.out.println(movieList.get(7).getTitle());
			System.out.println(movieList.get(8).getTitle());
		}
		if(category.equalsIgnoreCase("scifi")){
			System.out.println(movieList.get(9).getTitle());
			System.out.println(movieList.get(10).getTitle());
			System.out.println(movieList.get(11).getTitle());
		}
		
		
		System.out.println();
		System.out.println("Would you like to select from a different category?");
		choice = scan1.nextLine();
	}
		
	}

}
