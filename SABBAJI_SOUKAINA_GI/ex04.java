import java.util.Scanner;
public class sommme
{
public static void main(String[] args) 
{

    Scanner sc = new Scanner(System.in);
    int[] Tab;
    Tab = new int[4];
    int num = 0;
    int i = 0; 
    float sommme = 0; 
    System.out.printf("Entrez les quatre numeros \n");
    for (i = 0; i <= 3; i++)
    {
        System.out.printf("Entrez le numero %d",i+1);
        num = sc.nextInt();
        Tab[i] = num;
        sum += num;
    }
    while(i <= num)  
    {    
    sommme += i;  
    i++;  
    }
}
} 