 /*class MethodOverriding {

	public static void main(String[] args) 
	
	{
		privateanimal()
		{
			System.out.println("Sound of a specific animal is termed as::");
		}

	}

}
*/

class MethodOverriding{
   //Overridden method
   public void eat()
   {
      System.out.println("Human is eating");
   }
   
   
   public static void main( String args[]) 
   {
     Boy obj = new Boy();
     MethodOverriding ob = new MethodOverriding();
     MethodOverriding o = new Boy();
    o.eat();
    ob.eat();
    obj.eat();
     }

   
}
class Boy extends MethodOverriding{
   //Overriding method
   public void eat()
     {
      System.out.println("Boy is eating");
      }
}


