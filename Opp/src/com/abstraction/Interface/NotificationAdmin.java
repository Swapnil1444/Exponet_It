package com.abstraction.Interface;

public class NotificationAdmin {

	public static void main(String[] args) {
		System.out.println("------------------------");
		NotificationService service1=new EmailNotificationServiceImple();
		service1.send("Your transaction is successful. ");
		System.out.println("------------------------");

		NotificationService service2=new SMSNotificationServiceImple();
		service2.send("Otp is 1234");
		System.out.println("------------------------");

		NotificationService service3=new WhatsAppNotificationServiceImple();
		service3.send("Something product details. ");
		
		System.out.println("------------------------");
        service2.cancleNotification("Successfully cancelled your product . ");

	}

}
