package com.mycompany.core.rest.contextaccess;

public class C {

	private B test;
	
	public C(B b){
		this.test= b;
	}
	
	public B getTest() {
		return test;
	}
	public void setTest(B test) {
		this.test = test;
	}
	
}
