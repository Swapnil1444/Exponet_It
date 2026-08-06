package com.abstraction.Interface;

public class EmailNotificationServiceImple implements NotificationService {

	@Override
	public void send(String msg) {
		System.out.println("Send Email Msg:" + msg);
	}

	@Override
	public void cancleNotification(String msg) {
		System.out.println("Send Email Msg:" + msg);
	}
}
