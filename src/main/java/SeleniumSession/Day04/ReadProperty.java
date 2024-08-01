package SeleniumSession.Day04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	Properties prop;
	
	public Properties initProp() {
		
		try {
			FileInputStream fi=new FileInputStream(".\\src\\main\\java\\Config\\config.properties");
			prop=new Properties();
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
