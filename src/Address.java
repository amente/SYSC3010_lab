
public class Address
{
	public static int NAME_TEXT_LENGTH = 50;
    private int unit;
    private String street;
    private String city;
    private String postalCode;

    public Address (String street, String city, String postalCode) throws Exception
    { 
    	if (street.length() ==0 || street.length()>NAME_TEXT_LENGTH){
    		throw new Exception();
    	}else{
    		this.street = street;
    	}
    	
    	if(!postalCode.matches("^[ABCEGHJKLMNPRSTVXY]{1}\\d{1}[A-Z]{1} *\\d{1}[A-Z]{1}\\d{1}$")){
    		throw new Exception();
    	}else{
    		this.postalCode = postalCode;
    	}
    	
    	if (city.length() ==0 || city.length()>NAME_TEXT_LENGTH){
    		throw new Exception();
    	}else{
    		this.city = city;
    	}
    	
    	
    };
    public Address (int unit, String street, String city, String postalCode) throws Exception
    { 
    	this(street,city,postalCode);
    	this.unit = unit;    	
    };

     public String toString() { 
    	 return Integer.toString(unit)+" "+street+"\n"+city+" "+postalCode;
     }
     public boolean equals(Object o) { 
    	 if(o instanceof Address){
    		 Address a = (Address)o;
    		 return a.unit == this.unit && a.city.equalsIgnoreCase(this.city) && 
    				 a.postalCode.equalsIgnoreCase(this.postalCode)&&a.street.equalsIgnoreCase(this.street);
    	 }
    	 return false;
     }
     
     private boolean isValidPostalCode( String postalCode ) { return false; }
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
 
} 
