package com.mybean;

import org.springframework.stereotype.Component;

@Component
public class Company {
	
	public String getCompanyInfo()
	{
		String info="Hi Tech city";
		return info;
	}

}
