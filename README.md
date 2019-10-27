# COIT11134 - Sample Exam - BQ1 - Programming, Classes

## Question 1	(5 MARKS)

The following codes define Person class in a file named Person.java.

```
public class Person
{
   private String name;
   private int age;

   public Person(String n, int a)
   {
      name = n;
      age = a;
   }

   @Override
   public String toString()
   {
      return name + " " +age;
   }

} //end class definition
```

Your tasks are:
• to define two set methods to set the name and age of Person.
• to define two get methods to retrieve the name and age of Person.
• to define a method named isAdult so that it will return true if the person’s age is
greater than 18.
• to create PersonTester.java file wherein PersonTester class helps you
o to create a Person object with the name value of “Johnson” and the age value of 35.
o to use toString method to display the above mentioned Person object’s
field values

( Assume PersonTestor.java and Person.java are two separate files )
