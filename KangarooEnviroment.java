package model;

public class KangarooEnviroment 

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private double food1;				// this would be the amount of food that the kangaroo1 needs.		// 
																											//I put all this atributs here
	private double food2;				// this would be the amount of food that the kangaroo2 needs.		//
																											//because is the Enviroment who 																								
	private double food3;				// this would be the amount of food that the kangaroo3 needs.		// 
																											//have the water and the food,																									
	private double water1;				// this would be the amount of water that the kangaroo1 needs.		//	
																											//and not the animal, he only																								
	private double water2;				// this would be the amount of water that the kangaroo2 needs.		//	
																											//drinks or eats it from it.																									
	private double water3;				// this would be the amount of water that the kangaroo3 needs.		//	
																											//	
	private	double area1;				// this woild be the area of the first kangaroo.

	private	double area2;				// this woild be the area of the second kangaroo.

	private	double area3;				// this woild be the area of the third kangaroo.	

	private double enviromentArea;		// this would be the area of the enviroment																			
	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	private Kangaroo kangaroo1;

	private Kangaroo kangaroo2;

	private Kangaroo kangaroo3;

	//--------------------------------------------------------------------------------------------------

	//Methods

	//--------------------------------------------------------------------------------------------------

	public KangarooEnviroment(double newFood1, double newFood2, double newFood3, double newWater1, double newWater2, double newWater3, double newArea1, double newArea2, double newArea3, double newEnviromentArea, Kangaroo newKangaroo1, Kangaroo newKangaroo2, Kangaroo newKangaroo3) 

	{// in this method I am initializing the object, and assigning each parameter to each attribute.
		
		food1  = newFood1;

		food2  = newFood2;

		food3  = newFood3;
		
		water1 = newWater1;

		water2 = newWater2;

		water3 = newWater3;

		enviromentArea = newEnviromentArea;

		kangaroo1 = newKangaroo1;

		kangaroo2 = newKangaroo2;

		kangaroo3 = newKangaroo3;

	}

	//public String claculateMaleFemale()

	//{

	//	return "this method is in construccion"; /*kangaroo1.getSex() == "m" ? (kangaroo2.getSex() == "f" && kangaroo3.getSex() == "f") : (kangaroo2.getSex() == "m" ? (kangaroo1.getSex() == "f" && kangaroo3.getSex() == "f") :(kangaroo3.getSex() == "m" ? (kangaroo1.getSex() == "f" && kangaroo2.getSex() == "f") : (kangaroo1.getSex() == "f" && kangaroo2.getSex() == "f" && kangaroo3.getSex() == "f")));*/

	//} 

	/*public double calculateArea1()

	{

		return kangaroo1.getHeight() * 8;

	}

	public double calculateArea2()

	{

		return kangaroo2.getHeight() * 8;

	}

	public double calculateArea3()

	{

		return kangaroo3.getHeight() * 8;

	}*/

//this is a try		/*public double calculateTotalArea()
//this is a try
//this is a try		{
//this is a try
//this is a try			return calculateArea1() + calculateArea2() + calculateArea3();
//this is a try
//this is a try		}    if not, cmnd+Z in kangaroo zone still you remember.

	public double getFood1()

	{//this method helps us to get the value of the attribute food1.

		return food1;

	}

	public void setFood1(double newFood1)

	{//this method helps us to assign an initial value to the attribute food1.

		food1 = newFood1;

	}

	public double getFood2()

	{//this method helps us to get the value of the attribute food2.

		return food2;

	}

	public void setFood2(double newFood2)

	{//this method helps us to assign an initial value to the attribute food2.

		food2 = newFood2;

	}

	public double getFood3()

	{//this method helps us to get the value of the attribute food3.

		return food3;

	}

	public void setFood3(double newFood3)

	{//this method helps us to assign an initial value to the attribute food3.

		food3 = newFood3;

	}

	/*public double calculateFood1()

	{// here, I'm calculating how many food the kangaroo needs

		return (kangaroo1.getWeight() <= 30) ? (kangaroo1.getWeight() * 80)/100 : (kangaroo1.getWeight() <= 48 ? kangaroo1.getWeight() * 1.1 : 40 + kangaroo1.getWeight() * 0.4);

	}

	public double calculateFood2()

	{// here, I'm calculating how many food the kangaroo2 needs

		return (kangaroo2.getWeight() <= 30) ? (kangaroo2.getWeight() * 80)/100 : (kangaroo2.getWeight() <= 48 ? kangaroo2.getWeight() * 1.1 : 40 + kangaroo2.getWeight() * 0.4);

	}

	public double calculateFood3()

	{// here, I'm calculating how many food the kangaroo3 needs

		return (kangaroo3.getWeight() <= 30) ? (kangaroo3.getWeight() * 80)/100 : (kangaroo3.getWeight() <= 48 ? kangaroo3.getWeight() * 1.1 : 40 + kangaroo3.getWeight() * 0.4);

	}*/

	public double getWater1()

	{//this method helps us to get the value of the attribute water1.

		return water1;

	}

	public void setWater1(double newWater1)

	{//this method helps us to assign an initial value to the attribute water1.

		water1 = newWater1;

	}

	public double getWater2()

	{//this method helps us to get the value of the attribute water2.

		return water2;

	}

	public void setWater2(double newWater2)

	{//this method helps us to assign an initial value to the attribute water2.

		water2 = newWater2;

	}

	public double getWater3()

	{//this method helps us to get the value of the attribute water3.

		return water3;

	}

	public void setWater3(double newWater3)

	{//this method helps us to assign an initial value to the attribute water3.

		water3 = newWater3;

	}  

	/*public double calculateWater1()

	{// here, I'm calculating how many water the kangaroo needs

		return kangaroo1.calculateBmi() * 1.5;

	}

	public double calculateWater2()

	{// here, I'm calculating how many water the kangaroo needs

		return kangaroo2.calculateBmi() * 1.5;

	}

	public double calculateWater3()

	{// here, I'm calculating how many water the kangaroo needs

		return kangaroo3.calculateBmi() * 1.5;

	}*/

	public double getArea1()

	{//this method helps us to get the value of the attribute area1.

		return area1;

	}

	public void setArea1(double newArea1)

	{//this method helps us to assign an initial value to the attribute area1.

		area1 = newArea1;

	}

	public double getArea2()

	{//this method helps us to get the value of the attribute area2.

		return area2;

	}

	public void setArea2(double newArea2)

	{//this method helps us to assign an initial value to the attribute area2.

		area2 = newArea2;
		
	}

	public double getArea3()

	{//this method helps us to get the value of the attribute area3.

		return area3;

	}

	public void setArea3(double newArea3)

	{//this method helps us to assign an initial value to the attribute area3.

		area3 = newArea3;
		
	}

	public double getEnviromentArea()

	{//this method helps us to get the value of the attribute enviromentArea.

		return enviromentArea;

	}

	public void setEnviromentArea(double newEnviromentArea)

	{//this method helps us to assign an initial value to the attribute enviromentArea.

		enviromentArea = newEnviromentArea;
		
	}

	public Kangaroo getKangaroo1()

	{//this method helps us to get the value of the relation kangaroo1.

		return kangaroo1;

	}

	public void setKangaroo1(Kangaroo newKangaroo1)

	{//this method helps us to assign an initial value to the relation kangaroo1.

		kangaroo1 = newKangaroo1;

	}

	public Kangaroo getKangaroo2()

	{//this method helps us to get the value of the relation kangaroo2.

		return kangaroo2;

	}

	public void setKangaroo2(Kangaroo newKangaroo2)

	{//this method helps us to assign an initial value to the relation kangaroo2.

		kangaroo2 = newKangaroo2;
		
	}

	public Kangaroo getKangaroo3()

	{//this method helps us to get the value of the relation kangaroo3.

		return kangaroo3;

	}

	public void setKangaroo3(Kangaroo newKangaroo3)

	{//this method helps us to assign an initial value to the relation kangaroo3.

		kangaroo3 = newKangaroo3;
		
	}

}
