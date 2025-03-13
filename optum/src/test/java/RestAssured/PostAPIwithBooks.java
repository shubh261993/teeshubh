package RestAssured;

public class PostAPIwithBooks {
	
	private String isbn;
	
	
	public PostAPIwithBooks(String isbn)
	{
		this.isbn = isbn;
		
	}
	
	public void setISBN(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getISBN()
	{
		return isbn;
	}

}
