package useJSON;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJSONUrl {

	public static void main(String[] args) {
		String urlArray ="https://randomname.de/?format=json&count=10";
		String url = "http://ip.jsontest.com/";
		try {
			JSONReader reader = new JSONReader(url);
			JSONObject myJSON = reader.readJSONFromUrl();
			System.out.println(myJSON.toString());
			JSONReader readerArray = new JSONReader(urlArray);
			JSONArray myJSONArray = readerArray.readJSONArrayFromUrl();
			System.out.println(myJSONArray.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
				
	}

}
