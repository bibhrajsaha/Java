import java.io.*;
class numberswap
    {
        public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int a,b;
            System.out.print("Enter the 1st no: ");
            a=Integer.parseInt(br.readLine());
            System.out.print("Enter the 2nd no: ");
            b=Integer.parseInt(br.readLine());
 
            System.out.println("-------------------------------");
            System.out.println("The numbers before swapping are");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
 
            a=a+b;
            b=a-b;
            a=a-b;
 
            System.out.println("-------------------------------");
            System.out.println("The numbers after swapping are");
            System.out.println("a = "+a);
            System.out.println("b = "+b);
        }
    }