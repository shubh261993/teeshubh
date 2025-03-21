package com.ignite.optum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegExpression {
	
	@Test()
	public void regrx()
	{
		Pattern pat = Pattern.compile("e{1}*H+");
		Matcher match = pat.matcher("Hello wwworlda");
		boolean find = match.find();
		if(find)
		{
			System.out.println("Pattern Matched");
		} else {
			System.out.println("Pattern Not  Matched here");
		}
		
	}

}
