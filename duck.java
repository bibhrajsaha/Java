import java.io.*;
class duck
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String n=br.readLine(); 
 
        int l=n.length(); 
        int c=0; 
        char ch;
 
        for(int i=1;i<l;i++)
        {
            ch=n.charAt(i); 
            if(ch=='0')
                c++;
        }
 
        char f=n.charAt(0); 
 
        if(c>0 && f!='0')
            System.out.println("It is a duck number");
        else
            System.out.println("It is not a duck number");
    }
}