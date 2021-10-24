
public class Address {
	
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

	
	private int buildingNumber;
	private String appartmentName;
	private String street;
	private int zipcode;
	private String state;
	private String country ;
	
	public Address(int buildingNumber,String appartmentName,String street,int zipcode,String state,String country) {
		this.buildingNumber=buildingNumber;
		this.appartmentName=appartmentName;
		this.street=street;
		this.state=state;
		this.country=country;
		this.zipcode=zipcode;
	}

	@Override
	public String toString() {
		return "Address [buildingNumber=" + buildingNumber + ", appartmentName=" + appartmentName + ", street=" + street
				+ ", zipcode=" + zipcode + ", state=" + state + ", country=" + country + "]";
	}
	
}
