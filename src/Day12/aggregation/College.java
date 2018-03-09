package Day12.aggregation;

public class College {
    public String name;
    public String Country;
    public String City;
    public Address Address;

    public College(String name, String country, String city, Address address){
        this.Address = address;
        this.City = city;
        this.Country = country;
        this.name = name;

    }

}
