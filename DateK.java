package model;

public class DateK

{

	//--------------------------------------------------------------------------------------------------

	//Atributes

	//--------------------------------------------------------------------------------------------------

	private int day;		//this would be the day

	private int month;		//this would be the month

	private int year;		//this would be the year


	//--------------------------------------------------------------------------------------------------

	//relations

	//--------------------------------------------------------------------------------------------------

	//it doesn´t have relations

	//--------------------------------------------------------------------------------------------------

	//methods

	//--------------------------------------------------------------------------------------------------
	
	public DateK(int newDay, int newMonth, int newYear)

	{// in this method I am initializing the object, and assigning each parameter to each attribute.

		day   = newDay;

		month = newMonth;

		year  = newYear;

	}

	public int getDay()

	{//this method helps us to get the value of the attribute day.

		return day;

	}

	public void setDay(int newDay)

	{//this method helps us to assign an initial value to the attribute day.

		day = newDay;

	}

	public int getMonth()

	{//this method helps us to get the value of the attribute month.

		return month;

	}

	public void setMonth(int newMonth)

	{//this method helps us to assign an initial value to the attribute month.

		month = newMonth;

	}
	
	public int getYear()

	{//this method helps us to get the value of the attribute year.

		return year;

	}

	public void setYear(int newYear)

	{//this method helps us to assign an initial value to the attribute year.

		year = newYear;

	}

}