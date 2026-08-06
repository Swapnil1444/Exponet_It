package com.abstraction.Interface;

public class SMSNotificationServiceImple implements NotificationService{

	@Override
	public void send(String msg) {
		System.out.println("Send SMS Msg:"+msg);
	}
	@Override
	public void cancleNotification(String msg) {
		System.out.println("Send SMS Msg:"+msg);		
	}
}
