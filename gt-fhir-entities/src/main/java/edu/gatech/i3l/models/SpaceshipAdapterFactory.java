package edu.gatech.i3l.models;

import edu.gatech.i3l.models.SpaceshipAdapter;

import java.util.Properties;

import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;

public class SpaceshipAdapterFactory {
	private PyObject spaceshipClass;
	
	public SpaceshipAdapterFactory(){
		PythonInterpreter interpreter = new PythonInterpreter();
		/*Properties props = new Properties();
		props.setProperty("python.path", "/Users/ameliahenderson/Documents/GradCourses/MastersProject/export/");
		PythonInterpreter.initialize(System.getProperties(), props, new String[] {""});
		*/
		interpreter.exec("import sys");
		interpreter.exec("sys.path.append('/Users/ameliahenderson/Documents/GradCourses/MastersProject/export/')");
        interpreter.exec("from spaceship.export.adapter import SpaceshipAdapter");
        spaceshipClass = interpreter.get("Building");
	}
	
	public SpaceshipAdapter create (String modelPath){
		PyObject spaceshipObject = spaceshipClass.__call__(new PyString(modelPath));
		return (SpaceshipAdapter)spaceshipObject.__tojava__(SpaceshipAdapter.class);
		
	}
}