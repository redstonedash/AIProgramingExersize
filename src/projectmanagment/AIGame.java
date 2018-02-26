package projectmanagment;

import java.util.Random;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.ArrayList;

import clientsoftwareinterface.JavaClientController;

public class AIGame {
	static ArrayList<double[]> units = new ArrayList<double[]>(10);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClientController client;
		try {
			client = new JavaClientController();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IOException e) {
			// TODO Auto-generated catch block
			System.out.println("The game failed to load");
			e.printStackTrace();
		}
		int i = 0;
		Random rng = new Random();
		for(double[] array : units)
		{
			i++;
			array = new double[13];
			array[1] = i % 2;
			array[2] = rng.nextDouble()*100;
			array[3] = rng.nextDouble()*100;
			array[4] = rng.nextDouble()*360;
		}
	}
	/*
	 * GameObject:
	 * Team
	 * X
	 * Y
	 * Rotation
	 * HP
	 * HPRegen
	 * MP
	 * MPRegen
	 * VelX
	 * VelY
	 * VelR
	 * AtkDmg
	 * AtkSpd
	 * CollisionRadius
	 * XP
	 * Lvl
	 * basic creeps spawn from a set number of spawn points equal to the number of teams, and path towards each other.
	 * units start with no ability but are in melee
	 * lvl 2 they become ranged or they get to unlock an ability from 4
	 * lvl 3 they become ranged or they get to unlock an ability from 4
	 */
	private double[][] closestNeighbor(ArrayList<double[]> units)
	{
		
		return null;
	}
}
	