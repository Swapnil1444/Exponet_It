package com.abstraction.Interface;

public class WhatsAppNotificationServiceImple implements NotificationService{

	@Override
	public void send(String msg) {
		System.out.println("Send WhatsApp Msg:"+msg);
	}
	@Override
	public void cancleNotification(String msg) {
		System.out.println("Send WhatsApp Msg:"+msg);
	}
}
