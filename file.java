import java.io.*;
class file
    {
    public static void main(String args[])throws IOException
        {
            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
            System.out.print("Enter the full path of the file : ");
            String s = br.readLine();
             
            int x = s.lastIndexOf('\\'); 
            int y = s.lastIndexOf('.'); 
             
            String path = s.substring(0,(x+1));
            String file = s.substring((x+1),y);
            String extn = s.substring((y+1));
             
            System.out.println("Output :");
            System.out.println("Path : "+path);
            System.out.println("File Name : "+file);
            System.out.println("Extension : "+extn);
        }
    }