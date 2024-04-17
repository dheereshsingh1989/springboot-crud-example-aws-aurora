package com.dheeresh.crud.boot.jpadatasource.service;

import java.util.HashMap;
import java.util.Map;

public class ITCompany {

	private Map<String, String> companyInfo = new HashMap<>();
	
	public void registerCompany(String name, String website) {
		companyInfo.put(name, website);
	}
	
	public String getCompanyWebsite(String name) {
		return companyInfo.get(name);
	}
}
