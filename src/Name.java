public class Name
{
   private String first, last;
   public Name(String first, String last)
   {
	   this.first = first;
	   this.last = last;
   }
   public String getFirst() { return first; }
   public String getLast() { return last; }
   public void setFirst(String first) { this.first = first; }
   public void setLast(String last) { this.last = last; }
   public String toString()
   {
	   return first + " " + last;
   }
   public boolean equals(Object o)
   {
	   return o instanceof Name && toString().equals(( (Name)o ).toString());
   }
}
 