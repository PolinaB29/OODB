package lab1.UtilData;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String flat;

    private String postlCode;

    public Address(String country, String region, String city, String street, String house, String flat, String postlCode) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.postlCode = postlCode;
    }
}
