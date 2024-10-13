import java.util.Scanner;

public class divisibilitytest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
        if (isDivisibleBy(number, i)) {
        System.out.println("The number " + number + " is divisible by " + i + " because " + Reason(number, i));}
        }
     scanner.close();
    }
    // check if the number is divisible
    public static boolean isDivisibleBy(int number, int divisor) {
     return number % divisor == 0;
    }
    // give a reason
    public static String Reason(int number, int divisor) {
        switch (divisor) {
 case 1:
     return "every number is divisible by 1.";
 case 2:
    return number % 2 == 0 ? "it is even." : "it is odd.";
case 3:
return sumOfDigits(number) % 3 == 0 ? "the sum is divisible by 3." : "the sum  is not divisible by 3.";
case 4:
    return (number % 100) % 4 == 0 ? "the last two numbers are divisible by 4." : "the last two numbers are not divisible by 4.";
case 5:
         return (number % 10 == 0 || number % 10 == 5) ? "it ends with a 0 or 5." : "it does not end with a 0 or 5.";
case 6:
     return (number % 2 == 0 && sumOfDigits(number) % 3 == 0) ? "it is divisible by both 2 and 3." : "it is not divisible by both 2 and 3.";
 case 7:
 return "it follows specific divisibility rules of 7.";
case 8:
return (number % 1000) % 8 == 0 ? "the last three numbers are divisible by 8." : "the last three numbers are not divisible by 8.";
case 9:
return sumOfDigits(number) % 9 == 0 ? "the sum is divisible by 9." : "the sum is not divisible by 9.";
 default:
return ""
;
 }
 }
// the sum of numbers
 public static int sumOfDigits(int number) {
   int sum = 0;
    while (number > 0) {
    sum += number % 10;
number /= 10;
        }
 return sum;
}
}
