import java.util.Scanner;  
public class hrmn 
{    
    static void somme_harmonique(int n) 
    { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez votre numero ::");
    int n  = sc.nextInt();
    double i, somme = 0; 
    for (i = 1; i <= n; i++)
    {
        somme +=1/i; 
    } 
    System.out.printf("la somme des nombres de la serie harmonique est %f", somme);
    } 
    public static void main(String args[]) 
    { 
        somme_harmonique();             
    } 
} 