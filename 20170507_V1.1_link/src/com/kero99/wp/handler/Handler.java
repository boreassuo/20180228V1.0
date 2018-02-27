package com.kero99.wp.handler;
/**
 * sale		销售人员		5%
 * manager	经理			10%
 * vp		副总			20%
 * ceo		执行官		30%
 *
 */
public abstract class Handler {
	protected Handler successor;
	//设置上级对象
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	/**
	 * 优惠方法
	 */
	public abstract void preferential(double percentage);
	
}
