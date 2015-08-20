package ca.uhn.fhir.jpa.conf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLClassLoader;
import java.util.Properties;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

public class PropertiesResolver {
	
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(PropertiesResolver.class);
	public static final String PROPERTIES_FILE = "fhir.properties";
	
	private static PropertiesResolver resolver = new PropertiesResolver();
	private Properties properties;
	
	private PropertiesResolver(){
		this.properties = new Properties();
		try {
			URLClassLoader classloader = (URLClassLoader) getClass().getClassLoader();
			ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver(classloader);
			Resource[] resources = resolver.getResources("classpath*:/*"+PROPERTIES_FILE); //FIXME this search takes a while
			if(resources.length != 0)
				properties.load(new FileInputStream(resources[0].getFile()));
		} catch (FileNotFoundException e) {
			ourLog.warn(e.getMessage());
		} catch (IOException e) {
			ourLog.warn(e.getMessage());
		}
	}
	
	public static PropertiesResolver getInstance(){
		return resolver;
	}

	public String getPropertyValue(String propertyName){
		String propertyValue = null;
		if(!properties.isEmpty()){
			propertyValue = properties.getProperty(propertyName);
			return propertyValue;
		} else{
			ourLog.error("The file ? was not found in classpath.", PROPERTIES_FILE);
		}
		return propertyValue;
	}
}
