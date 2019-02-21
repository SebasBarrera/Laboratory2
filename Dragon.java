package model;

public class Dragon 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private String name;		// this would be the name of the baearded dragon.
	
	private double weight;  	// this would be the weight of the baearded dragon.

	private double lengthy;       // this would be the lengthy of the baearded dragon.

	private String sex; 		// this would say if the baearded dragon  is male or female. We will take the value of M for male and the value of F for female.

	private double bmi; 		// this would be the body mass index.

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	// it doesn´t have relations

	//--------------------------------------------------------------------------------------------------

	//Methods//

	//--------------------------------------------------------------------------------------------------

	public Dragon (String newName, double newWeight, double newLengthy, String newSex,  double newBmi)

	{// in this method I am initializing the object, and assigning each parameter to each attribute.
		
		name   = newName;

		weight = newWeight;

		lengthy  = newLengthy;		

		sex    = newSex;

		bmi    = newBmi;

	}

	public String getName()
	
	{//this method helps us to get the value of the attribute name.

		return name;

	}

	public void setName(String newName)
		
	{//this method helps us to assign an initial value to the attribute .

		newName = name;

	}

	public double getWeight()

	{//this method helps us to get the value of the attribute height.

		return weight;

	}

	public void setwWight(double newWeight)

	{//this method helps us to assign an initial value to the attribute weight.

		newWeight = weight;

	}

	public double getLengthy()

	{//this method helps us to get the value of the attribute weight.

		return lengthy;

	}

	public void setLengthy(double newLengthy)

	{//this method helps us to assign an initial value to the attribute lengthy.

		newLengthy = lengthy;

	}

	public String getSex()

	{//this method helps us to get the value of the attribute sex.

		return sex;

	}

	public void setSex(String newSex)

	{//this method helps us to assign an initial value to the attribute sex.

		newSex = sex;

	}

	public double getBmi()

	{//this method helps us to get the value of the attribute bmi.

		return bmi;

	}

	public void setBmi(double newBmi)

	{//this method helps us to assign an initial value to the attribute bmi.

		newBmi = bmi;

	}

	/*public double calculateBmi()

	{

		return weight / (lengthy * lengthy);

	}*/

}