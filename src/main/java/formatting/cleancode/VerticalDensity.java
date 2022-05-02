package src.main.java.formatting.cleancode;

/*is much easier to read. It fits in an “eye-full,” or at least it does for me.
        I can look at it and see that this is a class with two variables and a method,
        without having to move my head or eyes much:*/
public class VerticalDensity {

    private String m_className;
    private List<Property> m_properties = new ArrayList<Property>();

    public void addProperty(Property property) {
        m_properties.add(property);
    }
}
