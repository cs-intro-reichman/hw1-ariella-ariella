// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * (lim + 1)) + 1;
		int b = (int) (Math.random() * (lim + 1)) + 1;
		int c = (int) (Math.random() * (lim + 1)) + 1;
		System.out.println(a + " " + b + " " + c);
		int min = Math.min(a, Math.min(b, c));
		int max = Math.max(a, Math.max(b, c));
		int mid = Math.min(Math.max(a, b), Math.max(c, Math.min(a, b)));
		System.out.println(min + " " + mid + " " + max);
	}
}

