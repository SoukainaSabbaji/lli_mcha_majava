import java.util.Scanner;
public class chainecara
{
   public static void main(String args[])
   {
      String str;
      Scanner sc = new Scanner(System.in);
      System.out.print("Entrez votre chaine de caracteres : ");
      str = sc.nextLine();
      //premiere lettre dans la chaine de caractere en utilisant la fonction charat
      char pr = str.charAt(0);
      //derniere lettre dans la chaine
      char der = str.charAt(str.length()- 1);
      System.out.print("votre chaine de caracteres est :" + str);
      System.out.println("la premiere lettre de la chaine : " +str + " est : "+pr);
      System.out.println("la derniere lettre de la chaine : " +str + " est : "+der);
   }
}