

/*
 * Create a class named Shirt. 
 * Make all the member variables private.
 *  You will need a classvariable for the 
 *  shirt collar size, the shirt sleeve length, and the shirt material. 
 *  You will need to use the following code to declare the material variable 
 *  private String material:
	a. Make all the member methods public. 
	The methods will not be static. 
	Add accessor (get) and	mutator (set) methods for each member variable. 
	Make sure you have a constructor for the class 
	that accepts arguments for the collar size and sleeve length. 
	The constructor can set
	the material to cotton for all objects by using the following code:
	material = "Cotton";
	b. You can use some variation of the following code to print the material member variable:
	System.out.println("The material is " + material);
	 The code will only work, if it is part of the
	Shirt class. 
	If you print from main() in TestShirt, you will need to use an accessor (get)
	method of the class Shirt.
	c. Also create a "default" constructor that takes no arguments. 
	You may initialize the
	sleeve length and collar size to any value you wish in this constructor.
	 Initialize the	material to cotton.
	d. Create a source file named TestShirt.java.
	 This class will have the main( ) method in it.
	  You will 	need to instantiate three Shirt objects. 
	  Use the default constructor for one Shirt object and the	
	  overloaded constructor for the other two Shirt objects. 
	  You may print the required information
	for each object by having a separate method in TestShirt() that uses the accessor
	(get) methods of Shirt or you may add another public method to Shirt that prints all
	the information required.


 */


import java.util.*;

public class TestShirt
{
	public static void main(String args[])
	{
		Scanner input= new Scanner(System.in);
		
		//variables accepted and passed to constructor
		double c,s;
		
		
		//accepts collar size and passes to constructor
		System.out.println("Enter collar size");
		c=input.nextDouble();
		
		////accepts sleeve length and passes to constructor
		System.out.println("Enter sleeve length");
		s=input.nextDouble();
		
			
		Shirt s1= new Shirt();// call to default constructor
		Shirt s2 = new Shirt(3,20.2);//call to overloaded constructor
		Shirt s3= new Shirt(c,s);  //call to overloaded constructor
		
		
		//accept collar size, sleeve length , material and display for object 1
		System.out.println("Enter values for object 1");
		s1.getCollarSize();
		s1.getSleeveLength();
		s1.getMaterial();
		s1.display();
		
		//accept collar size, sleeve length , material and display for object 2
		System.out.println("Enter values for object 2");
		s2.getCollarSize();
		s2.getSleeveLength();
		s2.getMaterial();
		s2.display();
		
		//accept collar size, sleeve length , material and display for object 3
		System.out.println("Enter values for object 3");
		s3.getCollarSize();
		s3.getSleeveLength();
		s3.getMaterial();
		s3.display();
		
	}
}

class Shirt { 
	private double collarSize;
	private double sleeveLength ;
	private String material;
	Scanner input= new Scanner(System.in);
	
	Shirt()
	{
		System.out.println("Default constructor values");
		this.collarSize= 3.4; 
		this.sleeveLength= 20 ;
		this.material="cotton";
		System.out.println(" Collar size ="+this.collarSize+"Sleeve length ="+this.sleeveLength+"material="+this.material);
	}
	
	public void display() {
		
		System.out.println(" Collar size = "+collarSize+" Sleeve length = "+sleeveLength+" material= "+material);
	}

	Shirt( double cs, double sl)
	{
		System.out.println("Parameterized  constructor values");
		this.collarSize= cs;
		this.sleeveLength= sl ;
		this.material="cotton";
		System.out.println(" Collar size = "+this.collarSize+" Sleeve length = "+this.sleeveLength+" material= "+this.material);
	}
	
	public void getCollarSize()
	{
		System.out.println("Enter Collar Size");
		setCollarSize();	
	}
	
	public void getSleeveLength()
	{
		System.out.println("Enter Sleeve Length");
		setSleeveLength();		
	}
	
	public void getMaterial()
	{
		System.out.println("Enter Material");
		setMaterial();
	}
	
	public void setCollarSize()
	{
		collarSize=input.nextDouble();	
	}
	
	public void setSleeveLength()
	{
		sleeveLength=input.nextDouble();
	}
	
	public void setMaterial()
	{
		material=input.next();	
	}
}
