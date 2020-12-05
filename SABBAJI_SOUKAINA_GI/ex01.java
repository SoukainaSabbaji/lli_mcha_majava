import java.util.Scanner;
public class operations
{
public static void main(String[] args) 
{

    Scanner sc = new Scanner(System.in);

    float[] Tab;
    Tab = new float[4];
    int num = 0;
    int i = 0; 
    float sommme = 0; 
    float max = 0; 
    float min = 100; 

    System.out.println ("Entrez les quatre numeros\n");

    for (i = 0; i <= 3; i++)
    {
        System.out.println ("Entrez le numero");
        num = sc.nextInt();
        Tab[i] = num;
        sommme += num;
    }
    //calculer le min et le max 
    for ( i = 0; i <= 3; i++)
    {
        for (int j = i+1; j <= 2; j++)
        {
            float div=Tab[i] / Tab[j];
            System.out.printf("la division est : \n" +div);
        }
    }
    for ( i = 0; i <= 3; i++)
    {
        if (Tab[i] > max) max = Tab[i]; 
        if (Tab[i] < min) min = Tab[i]; 
    }
    System.out.printf(" le nombre min est:" + min);
    System.out.printf("%n le nombre max est: " + max);
    System.out.printf("%n la sommme des nombres est:"+somme);
}
}