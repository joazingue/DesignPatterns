
# Design Patterns 

Design patterns followed from Refactoring Guru

https://refactoring.guru/design-patterns/java


## Abstract Factory

Abstract factory helps you to create distinct type of objects with same functionality.
In this example will create buttons for MacOS and Windows. The system will use the one that belongs to the OS.

Abstract Factory Main module:
```
abstractFactory.example.Demo.java
```

1. Create the interface of all objects types to create (Button and checkbox in this example)
2. Create class to implement interface (Button class for MacOS and for Windows)
3. Create abstract factory. the abstract factory does the trick. This is the interface to create factories according to the type of objects that will be created.
4. GUIFactory is the interface to create MascOS and Windows factories wich will create the respective buttons
5. Implement abstract factory (GIUFactory) for WindowsFactory and MacOSFactory
6. The application will take the GUIFactory type to create the respective buttons (or objects)
7. Main module gets the OS name and instances the respective factory type (MacOSFactory or WindowsFactory), this is given to Application object to start the factory


## Builder

Builder design pattern helps you to create object with many components, it's used to avoid single gave arguments (create new (arg1, arg2, arg3, arg4, arg...n))
This example simulates a car built. There are two type of builders which ensamble the car pieces and one director which dictates what builder will work

Builder main module:
```
builder.example.Demo.java
```

1. Create car components classes, each with its functionalities
2. Create the car type classes that uses the components
3. Create the builder interface to set the necessary components
4. Implements the builder for the distinct builder types, each return the respective car type
5. Create the director, this gets a builder type and sets the components for the builder
6. In the main module, instance a director and the type of builder, pass the builder to the director and it returns a built car


## Factory Method

Factory method creates a factory to create distinct type of objects with at least one functionality in common.
For this example will create  buttons for HTML and Windows

Factory method main module:
```
factoryMethod.example.Demo.java
```

1. Create the Button interface
2. Implement the Buttons classes, each with the functionality according to it (Windows and HTML)
3. Create the factories abstract class (Dialog in this example) this is abstract class because it implements code in one of its method.
4. Extend factory to other factories (Windows and HTML) each creates the respective button
5. The Demo takes the OS type and creates the respective factory, the factory creates the objects of its type




