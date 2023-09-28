package git;


public class Company {
	
	private String name;
    private String city;
    private String domain;
    private int sharePrice;
    
	public Company(String name, String city, String domain, int sharePrice) {
		this.name = name;
		this.city = city;
		this.domain = domain;
		this.sharePrice = sharePrice;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public int getSharePrice() {
		return sharePrice;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", city=" + city + ", domain=" + domain + ", sharePrice=" + sharePrice + "]";
	}
    
}
