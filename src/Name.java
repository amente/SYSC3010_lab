public class Name
{
   private String first, last;
<<<<<<< HEAD
   public Name(String first, String last) {}
   public String toString() { return null; }
   public boolean equals(Object o) { return false; }
public String getFirst() {
	return first;
}
public void setFirst(String first) {
	this.first = first;
}
public String getLast() {
	return last;
}
public void setLast(String last) {
	this.last = last;
}
}
=======
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
 
>>>>>>> ad74495ab2dc43b73a171a87cc2ca788afefe9d4
