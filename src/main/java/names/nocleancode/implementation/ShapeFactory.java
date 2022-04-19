package src.main.java.names.nocleancode.implementation;

import src.main.java.names.nocleancode.interfaces.IShapeFactory;/*These are sometimes a special case for encodings. For example, say you are building an ABSTRACT FACTORY for the creation of shapes. This factory will be an interface and will be implemented by a concrete class. What should you names them? IShapeFactory and IShapeFactory? I prefer to leave interfaces unadorned. The preceding I, so common in today’s legacy wads, is a distraction at best and too much information at worst. I don’t want my users knowing that I’m handing them an interface. I just want them to know that it’s a IShapeFactory. So if I must encode either the interface or the implementation,
        I choose the implementation. Calling it ShapeFactory, or even the hideous CShapeFactory,
        is preferable to encoding the interface.*/

public class ShapeFactory implements IShapeFactory {

}
