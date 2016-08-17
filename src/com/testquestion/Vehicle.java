package com.testquestion;

public class Vehicle
{
		
	protected boolean runs = false;
	protected boolean currentlyRunning = false;
	public Vehicle(boolean runs, boolean currentlyRunning)
	{
		this.runs = runs;
		this.currentlyRunning = currentlyRunning;
	}
	public boolean isRuns()
	{
		return runs;
	}
	public void setRuns(boolean runs)
	{
		this.runs = runs;
	}
	public boolean isCurrentlyRunning()
	{
		return currentlyRunning;
	}
	public void setCurrentlyRunning(boolean currentlyRunning)
	{
		this.currentlyRunning = currentlyRunning;
	}


}
