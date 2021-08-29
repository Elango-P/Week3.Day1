package week3.day1;

public class AxisBank extends Bankinfo {
	@Override
	public void deposit() {
		System.out.println("Opening Deposit Account is Temperporily Stopped ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank Axis = new AxisBank();

		Axis.saving();
		Axis.fixed();
		Axis.deposit();
	}

}
