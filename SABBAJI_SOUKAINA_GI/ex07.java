class surfacerec
{
   public static void main(String args[]) 
    {   
      Scanner sc= new Scanner(System.in);
        System.out.println("Entrez la longueur du rectangle:");
         double l= sc.nextDouble();
         System.out.println("Entrez la largeur du rectangle:");
          double la= sc.nextDouble();
      double surface=(l*la);
      System.out.println("la surface du rectangle est: " +surface);      
   }
}
