public class Student extends Person
{
   private static int nextFreeNumber = 0;
   private int number;
<<<<<<< HEAD
   public Student(String first, String last) {};

   public int getNumber() { return -1; }

   // You decide if you need toString() and equals()
=======
   
   public Student(String first, String last)
   {
	   super(first, last);
	   number = nextFreeNumber++;
   }

   public int getNumber()
   {
	   return number;
   }
>>>>>>> ad74495ab2dc43b73a171a87cc2ca788afefe9d4
}

