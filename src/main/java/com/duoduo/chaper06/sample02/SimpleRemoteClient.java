/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.duoduo.chaper06 
 * @author: ekko   
 * @date: 2018年12月6日 上午10:55:01 
 */
package com.duoduo.chaper06.sample02;

 /** 
 * @ClassName: SimpleRemoteClient 
 * @Description: TODO
 * @author: ekko
 * @date: 2018年12月6日 上午10:55:01  
 * 
 * 命令模式：将"请求"封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象，命令模式也支持可撤销的操作。
 * 			
 * 
 */
public class SimpleRemoteClient {
	
	public static void main(String[] args) {
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		SimpleRemoteControl cotrol = new SimpleRemoteControl();
		cotrol.setSlot(lightOnCommand);
		cotrol.buttonWasPressed();
	}

}
