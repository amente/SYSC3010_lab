public class Student extends Person
{
   private static int nextFreeNumber = 0;
   private int number;



   public Student(String first, String last) throws Exception
   {
	   super(first, last);
	   number = nextFreeNumber++;
   }

   public int getNumber()
   {
	   return number;
   }
}

