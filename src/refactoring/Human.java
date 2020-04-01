package refactoring;

public class Human {
	private String name;
	private int age;
	private Address address = new Address();

	public Human(String name, int age, String country, String city, String street, String house, String quarter) {
		super();
		this.name = name;
		this.age = age;
		this.address.country = country;
		this.address.city = city;
		this.address.street = street;
		this.address.house = house;
		this.address.quarter = quarter;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getFullAddress() {
		return this.address.getFullAddress();
	}
	
	public static class Address {
		public String country;
		public String city;
		public String street;
		public String house;
		public String quarter;

		public Address() {
		}

		public String getFullAddress() {
			StringBuilder result = new StringBuilder();
			return result.append(country).append(", ").append(city).append(", ").append(street).append(", ").append(house)
					.append(" ").append(quarter).toString();
		}
	}

}
