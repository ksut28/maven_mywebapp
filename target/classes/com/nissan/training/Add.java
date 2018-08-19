package com.nissan.training;

public class Add {
	
	public String calc(String n1, String n2)
	{
		if(n1=="" || n2=="" || isNan(n1) || isNan(n2))
			return "Enter Valid Numbers";
		else
		{
			double d1 = Double.parseDouble(n1);
			double d2 = Double.parseDouble(n2);
			double sum = d1+d2;
		}
		return String.valueOf(sum);
	}
}