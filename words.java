import java.io.*;
class words
{
public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any sentence : "); 
        String s=br.readLine();
 
        s=s+" "; 
        int len=s.length(); 
        String x="",maxw="",minw="";
        char ch;
        int p,maxl=0,minl=len;
 
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); 
            if(ch!=' ')
            {
                x=x+ch;
            }
            else
            {
                p=x.length();
 
                if(p<minl)
                {
                    minl=p;
                    minw=x;
                }
 
                if(p>maxl) 
                {
                    maxl=p;
                    maxw=x;
                }
                x=""; 
            }
        }
        System.out.println("Shortest word = "+minw+"\nLength = "+minl);
        System.out.println("Longest word = "+maxw+"\nLength = "+maxl);
    }
}