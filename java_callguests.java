public class Main {
	public static int callGuests(int n) {
		if(n <= 1) { 
		return 1;
		}
		int way1 = callGuests(n-1);
		
		int way2 = (n-1) * callGuests(n-2);
		return way1 + way2;
	}
	public static void main(String[] args) {
		int n=5;
		System.out.print(callGuests(n));
	}
}