package clientsoftwareinterface;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import projectmanagment.ObjectThing;

public class JavaClientController {
	public JavaClientController() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		ObjectThing thing = new ObjectThing();
		thing.name = "yo wassup";
		System.out.println("Java Client Created");
		URL[] url = new URL[]{new URL("file:///C:/Users/redstonedash/workspace/AIGame/AIProgramingExersize/DoNothingAI.jar")};
		
		URLClassLoader child = new URLClassLoader(url);
		//child.
		Object x = null;
		Class<?> classToLoad = child.loadClass("Head");
		Method method = classToLoad.getDeclaredMethod("updateEvent"/*, Object.class*/);
		Object instance = classToLoad.newInstance();
		Object result = method.invoke(instance/*, thing*/);
		/*
		 * 
		 * 
		 * 
		 */
	}
}
