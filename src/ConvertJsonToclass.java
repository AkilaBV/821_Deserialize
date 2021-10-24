import org.testng.annotations.Test;

import com.google.gson.Gson;

public class ConvertJsonToclass {
	
	
	/*
	  Create a pojo class to store the values of the below json 
{
"BuildingNo": "123",
"AppartmentName": "abc",
"Street":"sampleStreet",
"Zipcode","12345"
"State": "California",
"Country " : "USA"

}
	 */
	
@Test
public void test() {
	
	Address a=new Address(123,"abc","sampleStreet",12345,"California","USA");
	System.out.println(a.toString());
	//serilaziation converting java object to json
	Gson gson=new Gson();
	String jsonString=gson.toJson(a);
	System.out.println("serialised address objectj in to json" + jsonString);
	//deserialization converting json to java object
	Address a1=gson.fromJson(jsonString,Address.class);
	System.out.println(a1.toString());
}
}
