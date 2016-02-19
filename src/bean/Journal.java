package bean;

public class Journal extends Publication  {
	
	private String ISSN;

	public Journal(String lib_Id, String resource_Id, String availability,
			String title, int publish_Year, String publish_Format, String iSSN) {
		super(lib_Id, resource_Id, availability, title, publish_Year,
				publish_Format);
		ISSN = iSSN;
	}

	public String getISSN() {
		return ISSN;
	}

	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}
	

		
}
