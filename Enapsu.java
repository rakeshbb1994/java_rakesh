
public class Enapsu {


	private int i;//encap 
	private int j; 

	public void display() { 

		System.out.println("these are the 2 answer"); 
	} 
} 
class child extends Enapsu //inher 
{ 
	public void display()//method overiding 
	{ 
		System.out.println("this is for method overriding"); 
	} 


	public void mul(int i, int j) 
	{ 
		int k=i*j; 
		System.out.println("mul of 2 int val is:"+k); 

	} 
	public void mul(double i,double j)//method overloading 
	{ 
		double z=i*j; 
		System.out.println("mul val of 2 double is:"+z); 
	} 
} 
class Son 
{ 

	public static void main(String args[]) 
	{ 
		Enapsu p=new  Enapsu(); 

		Enapsu pt=new child(); 
		child cd=new child(); 
		p.display(); 
		cd.mul(2, 20); 
		cd.mul(2.2, 1.1); 
		pt.display(); 
	}

}