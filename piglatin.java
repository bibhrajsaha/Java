import java.io.*;
class piglatin
    {
    public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Enter any word: ");
            String s=br.readLine();
 
            s=s.toUpperCase(); 
            int l=s.length();
            int pos=-1;
            char ch;
 
            for(int i=0; i<l; i++)
            {
                ch=s.charAt(i);
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    pos=i;
                    break;
                }
            }
 
            if(pos!=-1) 
            {
              String a=s.substring(pos); 
              String b=s.substring(0,pos); 
              String pig=a+b+"AY"; 
              System.out.println("The Piglatin of the word = "+pig);
            }
            else
              System.out.println("No vowel, no piglatin");
        }
    }