package com.kero99.wp.handler;
/**
 * sale		������Ա		5%
 * manager	����			10%
 * vp		����			20%
 * ceo		ִ�й�		30%
 *
 */
public abstract class Handler {
	protected Handler successor;
	//�����ϼ�����
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * �Żݷ���
	 */
	public abstract void preferential(double percentage);
	
}
