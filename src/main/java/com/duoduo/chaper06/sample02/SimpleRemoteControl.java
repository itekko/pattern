/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.duoduo.chaper06 
 * @author: ekko   
 * @date: 2018年12月6日 上午10:52:46 
 */
package com.duoduo.chaper06.sample02;

 /** 
 * @ClassName: SimpleRemoteControl 
 * @Description: TODO
 * @author: ekko
 * @date: 2018年12月6日 上午10:52:46  
 */
public class SimpleRemoteControl {
	
	Command slot;
	
	/** 
	 * @Title:SimpleRemoteControl
	 * @Description:TODO  
	 */  
	public SimpleRemoteControl() {
		 
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
	

}
