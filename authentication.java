import java.util.*;
import excep.*;
public class authentication
{
	public static void main(String args[])
	{
		String username="tom";
		String password="cat";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the username");
		String u1 = sc.nextLine();
		System.out.println("Enter the password");
		String u2 = sc.nextLine();
		try
		{
			if ((u1.equals(username)) && (u2.equals(password)))
			{
				System.out.println("Access Granted");
			}
			else
			{
				throw new credentialexception("invalid");
			}
		}
		catch (credentialexception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

