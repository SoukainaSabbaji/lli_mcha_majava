import java.util.Scanner;
public class equationdeuxieme 
{
   public static void main(String args[])
   {
      double x1 = 0, x2 = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Entrez la valeur de a ::");
      double a = sc.nextDouble();
      System.out.println("Entrez la valeur de b ::");
      double b = sc.nextDouble();
      System.out.println("Entrez la valeur de c  ::");
      double c = sc.nextDouble();
      double delta = (b*b)-(4*a*c);
      double sqrt = Math.sqrt(delta);
      if(delta <0)
      {
          System.out.println("l'equation n'a pas de solutions");
      }
      if(delta>0)
      {
         x1 = (-b + sqrt)/(2*a);
         x2 = (-b - sqrt)/(2*a);
         System.out.println("les solutions sont :: "+x1 +" et " +x2);
      }
      else if(delta == 0)
      {
         System.out.println("la seule solution est :: "+(-b + sqrt)/(2*a));
      }
   }
}