package com.kero99.wp.handler;

public class Vp extends Handler {

	public void preferential(double percentage) {
		if(percentage<0.2){
			System.out.println(getClass().getSimpleName()+"�����Żݡ��Żݶ��:"+percentage*100+"%");
		}else{
			successor.preferential(percentage);
		}
	}

}
