package com.mycompany.core.rest.contextaccess;

public class A {
	
	private B test;
	
	public A(B b){
		this.test= b;
	}
	
	public B getTest() {
		return test;
	}
	
	public void setTest(B test) {
		this.test = test;
	}
	
	
	
	public void updateB(){
		 B b =	ApplicationContextProvider.getApplicationContext().getBean("b", B.class);
		 b.setName("Hemanta");
	}

}
