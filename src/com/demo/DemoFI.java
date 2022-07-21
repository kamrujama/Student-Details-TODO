package com.demo;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Demo
{
	public void disp();
	
}

public class DemoFI
{
	public static void main(String args[])
	{
		
		List<String> asList = Arrays.asList("sonu","ram","shyam");
		asList.stream().map((string)->{return string + "hi";}).forEach(name->System.out.println(name));
		
	}
}