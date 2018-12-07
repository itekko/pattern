/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.duoduo.chaper07 
 * @author: ekko   
 * @date: 2018年12月7日 下午1:57:28 
 */
package com.duoduo.chaper07;


/** 
 * @ClassName: TurkeyAdaper  适配器
 * @Description: TODO
 * @author: ekko
 * @date: 2018年12月7日 下午1:57:28  
 */
public class TurkeyAdaper implements Duck{
	
	Turkey turkey;

	public void setTurkey(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for (int i = 0; i < 5; i++) {
			turkey.fly();
		}
	}
	
	
	
	

}
