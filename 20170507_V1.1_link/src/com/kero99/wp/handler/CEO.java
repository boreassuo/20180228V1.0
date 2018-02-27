package com.kero99.wp.handler;

public class CEO extends Handler {

	public void preferential(double percentage) {
		if(percentage<0.3){
			System.out.println(getClass().getSimpleName()+"处理优惠。优惠额度:"+percentage*100+"%");
		}else{
			System.out.println(getClass().getSimpleName()+"拒绝优惠。优惠额度超出上限，优惠额度是:"+percentage*100+"%");
		}
	}

}
