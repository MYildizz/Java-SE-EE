package com.ejbs;

import javax.ejb.Stateful;

@Stateful(name="memberservice")
public class MemberService implements IData {

	@Override
	public String Veriler() {
		// TODO Auto-generated method stub
		return "member burda";
	}

}
