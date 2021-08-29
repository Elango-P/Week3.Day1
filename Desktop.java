package org.system;

public class Desktop extends Computer {

	public void Desktopsize() {
		System.out.println("Desktop size is :32'");
	}

	public static void main(String[] args) {

		Desktop desk = new Desktop();
		desk.Computermodel();
		desk.Desktopsize();

	}

}