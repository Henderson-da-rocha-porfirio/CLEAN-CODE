package src.main.java.formatting.nocleancode;

/*Forces me to use much more eye and head motion to achieve the same level of comprehension.*/
/*Notice how the useless comments the close association of the two instance variables:*/
public class VerticalDensity {
    /**
     * The class name of the reporter listener
     */
    private String m_className;

    /**
     * The properties of the reporter listener
     */
    private List<Property> m_properties = new ArrayList<Property>();

    public void addProperty(Property property) {
        m_properties.add(property);
    }
}
