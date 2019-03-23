import java.io.*;
class alphafreq
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any string: ");
        String s = br.readLine();
  
        s=s.toLowerCase(); 
        int l=s.length();
  
        char ch;
        System.out.println("Output:");
        System.out.println("=========================="); 
        System.out.println("Alphabet\tFrequency");
        System.out.println("==========================");
  
        int count=0;
        for(char i='a'; i<='z'; i++)
            {
                count = 0;
                for(int j=0; j<l; j++)
                {
                    ch=s.charAt(j); 
                    if(ch==i) 
                        count++; 
                }
                if(count!=0)
                {
                    System.out.println(i+"\t\t"+count);
                }
            }
    }
}