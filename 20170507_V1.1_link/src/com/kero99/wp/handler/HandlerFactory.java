package com.kero99.wp.handler;

public class HandlerFactory {

	public static Handler create() {
		Handler sale=new Sale();
		Handler manager=new Manager();
		Handler vp=new Vp();
		Handler ceo=new CEO();
		
		sale.setSuccessor(manager);
		manager.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		
		return sale;
	}

}
