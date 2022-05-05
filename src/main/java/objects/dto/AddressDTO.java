package src.main.java.objects.dto;

        /*The quintessential form of a data structure is a class with public variables and no functions.
        This is sometimes called a data transfer object, or DTO. DTOs are very useful structures, especially
        when communicating with databases or parsing messages from sockets, and so on.
        They often become the first in a series of translation stages that convert raw data in a database into
        objects in the application code. Somewhat more common is the “bean” form showned.
        Beans have private variables manipulated by getters and setters.
        The quasi-encapsulation of beans seems to make some OO purists feel better but usually provides no other benefit.*/

public class AddressDTO {

    private String street;
    private String streetExtra;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String streetExtra, String city, String state, String zip) {
        this.street = street;
        this.streetExtra = streetExtra;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetExtra() {
        return streetExtra;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }
}

       /* Active Records are special forms of DTOs. They are data structures with public (or bean-accessed) variables;
        but they typically have navigational methods like save and find.
        Typically these Active Records are direct translations from database tables, or other data sources.
        Unfortunately we often find that developers try to treat these data structures as though they were objects by putting business
        rule methods in them. This is awkward because it creates a hybrid between a data structure and an object.
        The solution, of course, is to treat the Active Record as a data structure and to create separate objects that contain
        the business rules and that hide their internal data (which are probably just instances of the Active Record).*/