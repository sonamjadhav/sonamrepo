package encapsulation;

class EncapsulationDemo {
	private int ssn;
	private int empAge;
	// Getter and Setter methods
	public int getEmpSSN() {
		return ssn;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}
}
class Encap2 {
	public static void main(String args[]) {
		EncapsulationDemo obj = new EncapsulationDemo();
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("**************************************");
		obj.setEmpAge(32);
		obj.setEmpSSN(112233);
		System.out.println("Employee SSN: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}
}
//Employee SSN: 0
//Employee Age: 0
//**************************************
//Employee SSN: 112233
//Employee Age: 32
