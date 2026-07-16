package com.method;

public class ParameriedMethed {

	public void m1(byte b) {
		System.out.println("Byte : " + b);
	}

	public void m2(byte b, short s) {
		System.out.println("Byte : " + b + " Short:" + s);
	}

	public void m3(byte b, short s, int i) {
		System.out.println("Byte : " + b + " Short:" + s + " int:" + i);
	}

	public void m4(byte b, short s, int i, long l) {
		System.out.println("Byte : " + b + " Short:" + s + " int:" + i + " long:" + l);
	}

	public void m5(byte b, short s, int i, long l, boolean b1) {
		System.out.println("Byte : " + b + " Short:" + s + " int:" + i + " long:" + l + " Boolean:" + b1);
	}

	public void m6(byte b, short s, int i, long l, boolean b1, float f) {
		System.out
				.println("Byte : " + b + " Short:" + s + " int:" + i + " long:" + l + " Boolean:" + b1 + " Float:" + f);
	}

	public void m7(byte b, short s, int i, long l, boolean b1, float f, double d) {
		System.out.println("Byte : " + b + " Short:" + s + " int:" + i + " long:" + l + " Boolean:" + b1 + " Float:" + f
				+ " double:" + d);
	}

	public void m8(byte b, short s, int i, long l, boolean b1, float f, double d, char c) {
		System.out.println("Byte : " + b + " Short:" + s + " int:" + i + " long:" + l + " Boolean:" + b1 + " Float:" + f
				+ " double:" + d + " char" + c);
	}

	public static void main(String[] args) {

		ParameriedMethed p = new ParameriedMethed();
		byte b = 20;
		short s = 11;

		p.m1(b);
		p.m2(b, s);
		p.m3(b, s, 10);
		p.m4(b, s, 10, 20);
		p.m5(b, s, 20, 11, true);
		p.m6(b, s, 11, 22, false, 20.3f);
		p.m7(b, s, 11, 211, false, 20.1f, 111.33);
		p.m8(b, s, 11, 22, true, 220.2f, 11.11, 'c'); 
		p.m11(10);
		

	}

	public void m11(long a) {
		System.out.println("heloo");
	}

}
