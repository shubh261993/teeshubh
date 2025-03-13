package RestAssured;

public class PostAPIwithPOJOClass {
	
	private String email;
	private String username;
	private String password;
	private String name;
	private String job;
	
	
	public PostAPIwithPOJOClass(String name, String job)
	{
		this.name = name;
		this.job = job;
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setJob(String job)
	{
		this.job = job;
	}
	
	public String getJob()
	{
		return job;
	}
	
//	public void setEmail(String email)
//	{
//		this.email = email;
//	}
//	
//	public String getEmail()
//	{
//		return email;
//	}
//	
//	public void setUsername(String username)
//	{
//		this.username = username;
//	}
//	
//	public String getUsername()
//	{
//		return username;
//		
//	}
//	
//	public void setPassword(String password)
//	{
//		this.password = password;
//	}
//	
//	public String getPassword()
//	{
//		return password;
//		
//	}
}
