// Practice Exam question solution by Mike OMalley.
public class Person
{
   private String name;
   private int age;

   public Person(String n, int a)
   {
      name = n;
      age = a;
   }

   public String getName()
   {
      return name;
   }

   public int getAge()
   {
      return age;
   }

   public boolean isAdult()
   {
      if (age > 18)
         return true;
      else
         return false;
   }


   @Override
   public String toString()
   {
      return name + " " +age;
   }

} //end class definition
