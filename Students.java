package week3.day1;

public class Students {

	public void getStudentinfo(int a) {
		System.out.println("Student id is " + a);

	}

	public void getStudentinfo(int a, String name) {
		System.out.println("Student id is " + a);
		System.out.println("Student Name is " + name);
	}

	public void getStudentinfo(String email, long phoneNumber) {
		System.out.println("Student email is " + email);
		System.out.println("Student phonenumber is "+phoneNumber);
	}

	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentinfo(600675);
		stud.getStudentinfo(600675, "Elango");
        stud.getStudentinfo("Elango93",867866453);
	}

}
