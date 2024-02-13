// Practicum 8 (Even or Odd Program)
// (TO COMPLETE)

// This program will prompt the user for an integer value
// and display whether it is even or odd.

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// <n> is odd
// <n> is even
// --------------------------------------------------------------

// (TO COMPLETE)
public class main{
  public static void main(String[] args)
  {
    int n;
    boolean odd;

    System.out.print("Input an integer: ");
    //Scanner creation and ask for an integer
    java.util.Scanner UserInput = new java.util.Scanner(System.in);
    n = UserInput.nextInt();

    //Checks if n is odd or even
    if((double)n % 2 == 0)
    {
      odd = false;    //If even
    }
    else
    {
      odd = true;   // If odd
    }
// (MUST KEEP THESE LINES)
    if(odd)
      System.out.println(n + " is odd");
    else
      System.out.println(n + " is even");
  }
}