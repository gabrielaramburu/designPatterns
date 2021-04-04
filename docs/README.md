# Welcome to StackEdit!

Hi! I'm your first Markdown file in **StackEdit**. If you want to learn about StackEdit, you can read me. If you want to play with Markdown, you can edit me. Once you have finished with me, you can create new files by opening the **file explorer** on the left corner of the navigation bar.


# Factories

## SimplebFactory
Not concidered a pattern by itself but still useful to understand the whole picture. 

**Motivation**
Encapsulate objects creation.

**Drawback**
The client class still maintain transitive dependencies.

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
