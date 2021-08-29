package week3.day1;

public class MyMobile {

	public static void main(String[] args) {

		System.out.println("          -------AndroidPhone-------");

		Androidphone and = new Androidphone();

		and.makeCall();
		and.sendMsg();
		and.saveContact();
		and.takeVideo();

		System.out.println("             -----------SmartPhone----------");
		Smartphone smph = new Smartphone();

		smph.connectWhatsapp();
		smph.makeCall();
		smph.sendMsg();
		smph.saveContact();

	}

}
