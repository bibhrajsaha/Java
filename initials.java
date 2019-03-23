import java.io.*;
class initials
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		char x;
		int l;
		System.out.print("Enter any sentence: ");
		s=br.readLine();
		s=" "+s; 
		s=s.toUpperCase(); 
		l=s.length(); 
		System.out.print("Output = ");
	 
		for(int i=0;i<l;i++)
		{
			x=s.charAt(i);
			if(x==' ') 
			System.out.print(s.charAt(i+1)+".");
		}
	}
}