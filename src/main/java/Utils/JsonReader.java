package Utils;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReader {

	public List<String> jsonParseReader(String filePath , List<String> keys ) {

		keys = new ArrayList<String>();
		List<String> Valueslist = new ArrayList<String>();

		try {
			// Load Json File
			FileReader reader = new FileReader(filePath);
			// Parse Json
			JsonObject jsobj = (JsonObject) JsonParser.parseReader(reader);
					//JsonParser.parseReader(reader).getAsJsonObject();

			// Extract value for each Key
			for (String key : keys) {
				if (jsobj.has(key)) {
					String value = jsobj.get(key).getAsString();
					Valueslist.add(value);
				} else {
					// To handle missing keys
					System.out.println("Key : " +key+ " Not Found in JSON File");
				}
			}
			//To print the List
			System.out.println(" The Values List is : " +Valueslist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Valueslist;
	}
}
