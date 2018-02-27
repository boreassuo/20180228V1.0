package com.kero99.wp.handler;

public class Manager extends Handler {

	public void preferential(double percentage) {
		if(percentage<0.1){
			System.out.println(getClass().getSimpleName()+"处理优惠。优惠额度:"+percentage*100+"%");
		}else{
			successor.preferential(percentage);
		}
	}

}
