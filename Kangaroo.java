package model;

public class Kangaroo

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------
	
	private String name;		// this would be the name of the kangaroo.
	
	private int weight;  		// this would be the weight of the kangaroo.

	private double height;      // this would be the weight of the kangaroo.

	private String sex; 		// this would say if the kangaroo is male or female.

	private String bloodType;   // this would be the kind of blood that the kangaroo has.

	private double bmi; 		// this would be the body mass index.

	private String vaccine;		// this would say if the kangaroo needs to be vaccinateed. 

	private String heartRisk;	// this would say the level of heart risk. 

	//--------------------------------------------------------------------------------------------------

	//Relations

	//--------------------------------------------------------------------------------------------------

	private DateK birth;			// this would be the birthday of th kangaroo

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	public Kangaroo(String newName, int newWeight, double newHeight, String newSex, String newBloodType, double newBmi, String newHeartRisk, String newVaccine, DateK newBirth)

	{// in this method I am initializing the object, and assigning each parameter to each attribute.
		
		name      = newName;
		
		weight    = newWeight;

		height    = newHeight;

		sex       = newSex;

		bloodType = newBloodType;		

		bmi       = newBmi;

		heartRisk = newHeartRisk;
		
		vaccine   = newVaccine;

		birth     = newBirth;

	}

	public String getName()
	
	{//this method helps us to get the value of the attribute name.

		return name;

	}

	public void setName(String newName)
		
	{//this method helps us to assign an initial value to the attribute name.

		name = newName;

	}

	public double getHeight()

	{//this method helps us to get the value of the attribute height.

		return height;

	}

	public void setHeight(double newHeight)

	{//this method helps us to assign an initial value to the attribute height.

		height = newHeight;

	}

	public int getWeight()

	{//this method helps us to get the value of the attribute weight.

		return weight;

	}

	public void setWeight(int newWeight)

	{//this method helps us to assign an initial value to the attribute weight.

		weight = newWeight;

	}

	public String getSex()

	{//this method helps us to get the value of the attribute sex.

		return sex;

	}

	public void setSex(String newSex)

	{//this method helps us to assign an initial value to the attribute sex.

		sex = newSex;

	}

	public String getBloodType()

	{//this method helps us to get the value of the attribute bloodType.

		return bloodType;

	}

	public void setBloodType(String newBloodType)

	{//this method helps us to assign an initial value to the attribute bloodType.

		bloodType = newBloodType;

	}

	public double getBmi()

	{//this method helps us to get the value of the attribute bmi.	

		return bmi;

	}

	public void setBmi(double newBmi)

	{//this method helps us to assign an initial value to the attribute bmi.

		bmi = newBmi;

	}

	/*public double calculateBmi()

	{//here, the operation of the ibm is declared

		return weight / (height*height);

	}*/

	public String getHeartRisk()

	{//this method helps us to get the value of the attribute heartRisk.

		return heartRisk;

	}

	public void setHearRisk(String newHeartRisk)

	{//this method helps us to assign an initial value to the attribute heartRisk.

		heartRisk = newHeartRisk;

	}

	//public String calculateHeartRisk()

	//{// here, I'm calculating when the kangaroo has a heart risk
 
	//	return "the methood is in construccion.";/*(bmi <= 18 ? (bloodType == ab ?  ("low risk" : "medium risk") : (bloodType == a ? "low risk" : "medium risk") : (bmi <=25 ? "low risk" : bloodType == "ab" ? "low risk" : "high risk"));*/

	//}

	public String getVaccine()

	{//this method helps us to get the value of the attribute vaccine.

		return vaccine;

	}

	public void setVaccine(String newVaccine)

	{//this method helps us to assign an initial value to the attribute vaccine.

		vaccine = newVaccine;

	}

	public DateK getBirth()

	{//this method helps us to get the value of the relation birth.

		return birth;

	}

	public void setBirth(DateK newBirth)

	{//this method helps us to assign an initial value to the the relation birth.

		birth = newBirth;

	}

}
