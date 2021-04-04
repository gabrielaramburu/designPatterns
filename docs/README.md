# Factories

## SimplebFactory
Not concidered a pattern by itself but still useful to understand the whole picture. 

**Motivation**
Encapsulate objects creation.

**Drawback**
The client class still maintain transitive dependencies.

![](simpleFactory.png)

## Factory Method

**Motivation**
- Encapsulate objects creation.
- To achive dependency inversion.
- Use of inheritance.

## AbstractFactory

**Motivation**
- Encapsulate objects creation.
- To achive dependency inversion.
- Use of composition.

**Drawback**
Change the interface is required if some new object type need to be created.
