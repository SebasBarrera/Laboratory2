package model;

public class KangarooZone 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private double totalArea;		// this will be the total area of de kangaroo zone

	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private KangarooEnviroment ke1;

	private KangarooEnviroment ke2;

	private KangarooEnviroment ke3;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	public KangarooZone(double newTotalArea, KangarooEnviroment newKe1, KangarooEnviroment newKe2, KangarooEnviroment newKe3) 

	{// in this method I am initializing the object, and assigning each parameter to each attribute.

		totalArea = newTotalArea;

		ke1       = newKe1;

		ke2       = newKe2;

		ke3       = newKe3;

	}

	public double getTotalArea()

	{//this method helps us to get the value of the attribute totalArea.

		return totalArea;

	}

	public void setTotalArea(double newTotalArea)

	{//this method helps us to assign an initial value to the attribute totalArea.

		totalArea = newTotalArea;

	}

	public KangarooEnviroment getKe1()

	{//this method helps us to get the value of the relation ke1.

		return ke1;

	}

	public void setKe1(KangarooEnviroment newKe1)

	{//this method helps us to assign an initial value to the attribute ke1.

		ke1 = newKe1;
	
	}

	public KangarooEnviroment getKe2()

	{//this method helps us to get the value of the relation ke2.

		return ke2;

	}

	public void setKe2(KangarooEnviroment newKe2)

	{//this method helps us to assign an initial value to the attribute ke2.

		ke2 = newKe2;
		
	}

	public KangarooEnviroment getKe3()

	{//this method helps us to get the value of the relation ke3.

		return ke3;

	}

	public void setKe3(KangarooEnviroment newKe3)

	{//this method helps us to assign an initial value to the attribute ke3.

		ke3 = newKe3;
		
	}

	/*public double calculateTotalArea()

	{

		return ke1.calculateTotalArea() + ke2.calculateTotalArea() + ke3.alculateTotalArea();
	}*/

}