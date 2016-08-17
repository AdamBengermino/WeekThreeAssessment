package com.testquestion;

public class Car extends Vehicle 
{
	protected int windows = 0; 
	protected int doors = 0; 
	protected String make = null; 
	protected String model = null;
	protected String color = null;
	public boolean hasSpoiler = false;
	public boolean hasBeenDetailed = false;
	
	public Car(boolean runs, boolean currentlyRunning, int windows, int doors, String make, String model, String color,
			boolean hasSpoiler, boolean hasBeenDetailed)
	{
		super(runs, currentlyRunning);
		this.windows = windows;
		this.doors = doors;
		this.make = make;
		this.model = model;
		this.color = color;
		this.hasSpoiler = hasSpoiler;
		this.hasBeenDetailed = hasBeenDetailed;
	}

	public int getWindows()
	{
		return windows;
	}

	public void setWindows(int windows)
	{
		this.windows = windows;
	}

	public int getDoors()
	{
		return doors;
	}

	public void setDoors(int doors)
	{
		this.doors = doors;
	}

	public String getMake()
	{
		return make;
	}

	public void setMake(String make)
	{
		this.make = make;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public boolean isHasSpoiler()
	{
		return hasSpoiler;
	}

	public void setHasSpoiler(boolean hasSpoiler)
	{
		this.hasSpoiler = hasSpoiler;
	}

	public boolean isHasBeenDetailed()
	{
		return hasBeenDetailed;
	}

	public void setHasBeenDetailed(boolean hasBeenDetailed)
	{
		this.hasBeenDetailed = hasBeenDetailed;
	} 
	
	
}
