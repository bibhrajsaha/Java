import java.util.*;
class automorphic
{
  public static void main(String args[]) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number : ");
    int n = sc.nextInt();
    int sq = n*n;
 
    String num = Integer.toString(n); 
    String square = Integer.toString(sq); 
 
    if(square.endsWith(num)) 
        System.out.print(n+" is an Automorphic Number.");
    else
        System.out.print(n+" is not an Automorphic Number.");
    }
}