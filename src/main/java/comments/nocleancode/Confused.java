package src.main.java.comments.nocleancode;

import java.io.FileInputStream;
import java.io.IOException;

/*Here, for example, is a case I found in FitNesse, where a comment might indeed have been useful.
        But the author was in a hurry or just not paying much attention. His mumbling left behind an enigma:*/
public class Confused {
    public void loadProperties() {
        try {
            String propertiesPath = propertiesLocation +
            ”/”PROPERTIES_FILE;
            FileInputStream propertiesStream = new FileInputStream(propertiesPath);
            loadedProperties.load(propertiesStream);
        }
        catch (IOException e) {
            // No properties files means all defaults are loaded
        }
        }
    }

/* But who loads all the defaults? Were they loaded before the call to loadProperties.load?
        Or did loadProperties.load catch the exception, load the defaults, and then pass the exception on for us to ignore?
        Or did loadProperties.load load all the defaults before attempting to load the file?
        Was the author trying to comfort himself about the fact that he was leaving the catch block empty?
        Or — and this is the scary possibility — was the author trying to tell himself to come back here later and write the code that would load the defaults?
        Our only recourse is to examine the code in other parts of the system to find out what’s going on.
        Any comment that forces you to look in another module for the meaning of that comment has failed to communicate to you and is not worth the bits it consumes.*/
