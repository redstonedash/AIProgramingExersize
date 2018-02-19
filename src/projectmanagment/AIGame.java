package projectmanagment;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

import clientsoftwareinterface.JavaClientController;

public class AIGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			JavaClientController client = new JavaClientController();
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IOException e) {
			// TODO Auto-generated catch block
			System.out.println("The game failed to load");
			e.printStackTrace();
		}
	}
	/*
	 * GameObject:
	 * X
	 * Y
	 * Rotation
	 * HP
	 * MP
	 * VelX
	 * VelY
	 * VelR
	 * AtkDmg
	 * AtkSpd
	 * HPRegen
	 * MPRegen
	 */

}
	