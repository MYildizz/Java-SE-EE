package com.ejbs;

import javax.ejb.Stateful;

@Stateful(name="dataservice")
public class DataService implements IData {
	
	public DataService() {
		
	}

	@Override
	public String Veriler() {

		return "EJB kullanýma açýldý";
	}

}
