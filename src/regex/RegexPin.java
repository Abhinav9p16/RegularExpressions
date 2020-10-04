package regex;
import java.util.Scanner;
import java.util.regex.*; 

class RegexPin { 
	public static boolean isValidPinCode(String pin) {
		// Regex to check valid pin code of India.
	   String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

		Pattern p = Pattern.compile(regex);
		if (pin == null) {
			return false;
		}
		Matcher m = p.matcher(pin);
		return m.matches();
	}
	public static boolean isValidName(String fname) {
		// Regex to check valid username of India.
	   String regex = " ^[A-Z]{1}[a-zA-Z]{2,}$";

		Pattern p = Pattern.compile(regex);
		if (fname == null) {
			return false;
		}
		Matcher m = p.matcher(fname);
		return m.matches();
	}
	public static boolean isValidEmail(String email) {
		// Regex to check valid email of India.
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$";
		Pattern p = Pattern.compile(regex);
		if (email == null) {
			return false;
		}
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expressions");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PINCODE");
		String pin = sc.nextLine();
		System.out.println(pin + ":" + isValidPinCode(pin));
		System.out.println("Enter First name ");
		String fname = sc.nextLine();
		System.out.println(fname + ":" + isValidName(fname));
		System.out.println("Enter Last name ");
		String lname = sc.nextLine();
		System.out.println(lname + ":" + isValidName(lname));
		System.out.println("Enter the EMAIL");
		String email = sc.nextLine();
		System.out.println(email + ":" + isValidEmail(email));
	}
} 
