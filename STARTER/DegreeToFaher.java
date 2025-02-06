import java.util.Scanner;

class DegreeToFaher
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Degree in Celsius :");
		float cel = sc.nextFloat();
		float fah=(cel*9.0f/5.0f)+32.0f;

		System.out.println(cel+" Celsius is "+fah+" Fahrenheit");

	}
}