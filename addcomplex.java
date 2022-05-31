import java.util.*;
class Complex
{
	int real, imaginary;
	Complex()
	{
	}
	Complex(int tempReal, int tempImaginary)
	{
		real = tempReal;
		imaginary = tempImaginary;
	}
	Complex addComp(Complex c1, Complex c2)
	{
		Complex temp = new Complex();
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		return temp;
	}
}
public class addcomplex
{
	public static void main(String args [])
	{
		Complex c1 = new Complex (a , b);
		System.out.println("Complex Number 1:" + c1.real + "+ i" + c1.imaginary);	
		Complex c2 = new Complex (c , d);
		System.out.println("Complex Number 2:" + c2.real + "+ i" + c2.imaginary);
		Complex c3 = new Complex();
		c3 = c3.addComp(c1, c2);
		System.out.println("Sum of the complex numbers is :" + c3.real + " + i" + c3.imaginary);
	}
}
