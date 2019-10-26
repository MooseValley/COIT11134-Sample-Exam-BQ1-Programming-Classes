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
