
public class Professor extends Person
{
   private String office;


   public Professor(String firstName, String lastName) throws Exception
   {
	   super(firstName, lastName);
   }
   
   public void setOffice(String office)
   {
	   this.office = office;
   }
   
   public String getOffice()
   {
	   return office;
   }

}

