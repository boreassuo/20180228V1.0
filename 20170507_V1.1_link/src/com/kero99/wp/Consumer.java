package com.kero99.wp;

import com.kero99.wp.handler.Handler;
import com.kero99.wp.handler.HandlerFactory;

public class Consumer {
	public static void main(String[] args) {
		Handler handler=HandlerFactory.create();
		handler.preferential(0.52);
	}
}
