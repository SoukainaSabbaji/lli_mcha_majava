public class Person 
{
   private String name;
   public String getName() 
   {
     return name;
   }
   public void setName(String newName) 
   {
     this.name = newName;
   }
}

public class Main 
{
  public static void main(String[] args) 
  {
    Person nvobjet = new Person();
    nvobjet.setName("John"); 
    System.out.println(nvobjet.getName());
  }
}