package com.ignite.optum;

// class abc {
//	 
//	 public static class bf
//	 {
//		 bf()
//			{
//				System.out.println("hello");
//			}
//			
//			public static abc ddc()
//			{
//				
//				return null;
//				
//			}
//	 }
//	
//	 
//	
//}
// 
// 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String str = "baaabbabbb";
    	char ch[] = str.toCharArray();
    	int n[] = new int[str.length()];
    	char ch2[] = new char[str.length()];
    	String str2 = "";
    	String str3 = "";
    	int counter =0;
    	int index = 0;
    	for(int i=0;i<str.length();i++)
    	{
    		counter = 0;
    		for(int j=i+1;j<str.length();j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				n[i]++;
    				ch2[i] = ch[i];
    				ch[j] = 0;
    			}
    			
    		}
    	}
    	
    	for(int i=0;i<n.length;i++)
    	{
    	  if(n[i]!=0 && n[i]>=1 && ch2[i]!=0)
    	  {
    		  
    		  System.out.println(ch2[i] + " "+(n[i]+1));
    	  }
    	}
    	
    
    	
    }
}
