package projectmanagment;

import java.util.Random;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;

import clientsoftwareinterface.JavaClientController;

public class AIGame {
	static ArrayList<ArrayList<Object>> frendlyUnits = new ArrayList<ArrayList<Object>>(0);
	static ArrayList<ArrayList<Object>> enemyUnits = new ArrayList<ArrayList<Object>>(0);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClientController frendly;
		JavaClientController enemy;
		try {
			frendly = new JavaClientController();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IOException e) {
			// TODO Auto-generated catch block
			System.out.println("The game failed to load");
			e.printStackTrace();
		}
		try {
			enemy = new JavaClientController();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IOException e) {
			// TODO Auto-generated catch block
			System.out.println("The game failed to load");
			e.printStackTrace();
		}
		Random rng = new Random();
		for(int i = 0; i<5; i++)
		{
			addUnit(frendlyUnits,0,-1,180,10,5,false);
			addUnit(enemyUnits,0,1,0,10,5,false);
		}
		for(int i = 0; i<1; i++)
		{
			addUnit(frendlyUnits,0,-1,180,10,5,true);
			addUnit(enemyUnits,0,1,0,10,5,true);
		}
	}
	private static void updateEvent()
	{
		freiendly.update()
	}
	private static void addUnit(ArrayList<ArrayList<Object>> units, double X, double Y, double R, double HP, int attackCD, boolean isRanged)
	{
		units.add(new ArrayList<Object>());
		ArrayList<Object> foo = units.get(units.size());
		foo.add(X);
		foo.add(Y);
		foo.add(R);
		foo.add(HP);
		foo.add((int) -1); // this means there is no target yet.
		foo.add(attackCD);
		foo.add(isRanged);
	}

	private static double[][] closestNeighbor(ArrayList<ArrayList<Object>> setA, ArrayList<ArrayList<Object>> setB)
	{
		for(int i = 0; i < setA.size(); i++)
		{
			double x = (double)setA.get(i).get(0);
			double y = (double)setA.get(i).get(1);
			for(int j = 0; j < setB.size(); j++)
			{
				Math.hypot(setB.get(j).get(0)-x, setA.get(j)[1]-y);
			}	
		}
		for(int i = 0; i < setA.size(); i++)
		{
			double x = setA.get(i)[0];
			double y = setA.get(i)[1];
			for(int j = 0; j < setB.size(); j++)
			{
				Math.hypot(setB.get(j)[0]-x, setA.get(j)[1]-y);
			}	
		}
		return null;
	}
}
	
