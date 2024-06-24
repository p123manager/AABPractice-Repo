package utilitypack;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertFileUtility {
	//get value of property file
	 public static String getValueFromPropertyFile(String pfpath,String propertyname)throws Exception
	  {
		  //open an existing property file in read mode
		  FileInputStream fi=new FileInputStream(pfpath);
		  Properties p=new Properties();
		  p.load(fi);
		  String value=p.getProperty(propertyname);
		  fi.close();
		  return value;
	  }
}
