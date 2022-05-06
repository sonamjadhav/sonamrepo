package Method;

public class primeNumber {

	public static void main(String[] args) {
		int primeCt = 0;
		System.out.println("Total Prime number count: " + primeCt);
		System.out.println("check give number is prime or not: "+checkPrimeNumber(1));
		checkPrimeNumberTillPassedNumber(10);
	}

	static boolean checkPrimeNumber(int num) {
		int counter = 0;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					counter = ++counter;
				}
			}
			if (counter == 2) {
				System.out.println("Prime Number: " + num);
				return true;
			} else {
				System.out.println("Number is not a prime: " + num);
				return false;
			}
		} else {
			System.out.println("Number is not a prime: " + num);
			return false;
		}
	}

	static void checkPrimeNumberTillPassedNumber(int num) {
		if (!(num == 0 || num == 1)) {
			for (int i = 2; i < num; i++) {
				int counter = 0;
				for (int j = i; j >= 1; j--) {
					if (i % j == 0) {
						counter = ++counter;
					}
				}
				if (counter == 2) {
					System.out.println("Prime Number: " + i);
				}
			}
		}
	}

}
