import java.util.Scanner;
public class voyelles 
{
   public static void main(String args[])
   {
      int a = 0;
      int e = 0;
      int i = 0;
      int u = 0;
      int y = 0;
      System.out.println("Entrez une chaine de caracteres :");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      for (int j=0 ; j<str.length(); j++)
      {
         char ch = sentence.charAt(j);
         if(ch == 'a')
         a++;
         if(ch == 'u')
         u++;
         if(ch == 'i')
         i++;
         if(ch == 'e')
         e++;
         if(ch == 'y')
         y++;
      }
      System.out.printf("%d fois la lettre a: \n" +a);
      System.out.printf("%d fois la lettre e: \n" +e);
      System.out.printf("%d fois la lettre i: \n" +i);
      System.out.printf("%d fois la lettre u: \n" +u);
      System.out.printf("%d fois la lettre y: \n" +y);
   }
}
