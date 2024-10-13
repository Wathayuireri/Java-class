//Java program that displays all the multiples of 2, 3, and 7 within the range 71 to 150:
public class multiples {
public static void main(String[] args) {
System.out.println("Multiples of 2, 3, and 7 between 71 and 150:");
 for (int i = 71; i <= 150; i++) {
if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
System.out.print(i + " ");
 }
}
 System.out.println();
}
}