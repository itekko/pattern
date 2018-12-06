/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.duoduo.chaper06 
 * @author: ekko   
 * @date: 2018年12月6日 上午10:47:50 
 */
package com.duoduo.chaper06.sample01;

 /** 
 * @ClassName: LightOnCommand 开灯命令实现类 
 * @Description: TODO
 * @author: ekko
 * @date: 2018年12月6日 上午10:47:50  
 */
public class LightOnCommand implements Command {
	
	Light light;

	/* (non Javadoc) 
	 * @Title: execute
	 * @Description: TODO 
	 * @see com.duoduo.chaper06.Command#execute() 
	 */
	public LightOnCommand(Light light) {
		this.light = light;
	}
	@Override
	public void execute() {
		light.on();
	}

}
