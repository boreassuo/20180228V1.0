package com.kero99.wp.handler;

public class CEO extends Handler {

	public void preferential(double percentage) {
		if(percentage<0.3){
			System.out.println(getClass().getSimpleName()+"�����Żݡ��Żݶ��:"+percentage*100+"%");
		}else{
			System.out.println(getClass().getSimpleName()+"�ܾ��Żݡ��Żݶ�ȳ������ޣ��Żݶ����:"+percentage*100+"%");
		}
	}

}
