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
	private Class<?> classToLoad;
	private Method method;
	private Object instance;
	private Object result;
	public JavaClientController() throws ClassNotFoundException, NoSuchMethodException, SecurityException, 
	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException
	{
		System.out.println("Java Client Created");
		URL[] url = new URL[]{new URL("file:///C:/Users/377804/Documents/GitHub/AIProgramingExersize/Client.jar")};
		
		URLClassLoader child = new URLClassLoader(url);
		//child.
		classToLoad = child.loadClass("Head");
		method = classToLoad.getDeclaredMethod("updateEvent");
		instance = classToLoad.newInstance();
	}
	public ArrayList<double[]> Update(ArrayList<double[]> state) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		result = method.invoke(instance);
		return state;
	}
}