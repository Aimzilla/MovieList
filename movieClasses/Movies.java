package movieClasses;

public class Movies {

	private String title;
	private String category;

	public Movies(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title; 
		}
	 
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {// this pulls from user input in
												// main method
		this.category = category;
	}

}
