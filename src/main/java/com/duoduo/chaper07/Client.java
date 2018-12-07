/**   
 * Copyright © 2018 eSunny Info. Tech Ltd. All rights reserved.
 * 
 * @Package: com.duoduo.chaper07 
 * @author: ekko   
 * @date: 2018年12月7日 下午2:04:17 
 */
package com.duoduo.chaper07;

 /** 
 * @ClassName: Client 
 * @Description: TODO
 * @author: ekko
 * @date: 2018年12月7日 下午2:04:17
 * 适配器模式：将一个类的接口，转换成客户端期望的另个接口。适配器让原本接口不兼容的类可以合作无间。
 * 
 * 适配器的实现方式：组合/继承
 * 
 * 外观模式：提供类一个统一的接口，用来访问子系统中的一群接口，外观定义了一个高层接口，让子系统更容易使用。
 * 
 * 最少知道原则：只和你的密友谈话
 * 
 * 
 * 
 * 
 */
public class Client {
	
	public static void main(String[] args) {
		TurkeyAdaper adaper = new TurkeyAdaper();
		adaper.setTurkey(new Turkey() {
			
			@Override
			public void gobble() {
				System.out.println("Turkey gobble running...");
				
			}
			
			@Override
			public void fly() {
				System.out.println("Turkey fly...");				
			}
		});
		
		adaper.fly();
		adaper.quack();
	}

}
