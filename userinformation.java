/*Java program that asks the user to enter their surname and current age then
 print the number of characters of their sir name and even or odd depending on their age number*/
public class userinformation{
    public static void main(String[] args) {
        // Ask the user to their surname
        System.out.println("Enter your surname:");
        String surname = System.console().readLine();
        // Ask for the user's age
        System.out.println("Enter your current age: ");
        int age = Integer.parseInt(System.console().readLine());
        // the number of characters in the surname
        int surnameLength = surname.length();
        System.out.println("The number of characters in your surname is: " + surnameLength);
        // Determine if the age is even or odd and print the result
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }
    }
}
