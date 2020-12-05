import java.util.Scanner;
public class tableauop
{
    public static void main(String[] args) 
    {
        int i;
        float moyenne=0;
        float sommme=0;
        float min=0;
        float max=0;
        Scanner sc = new Scanner(System.in);
        float Tab[] = new float[5];
        System.out.println("Entrez les elements");
        for(int i = 0; i <= 4 ; i++)
        {
            Tab[i] = sc.nextFloat();
            somme += Tab[i];
        }
        for ( i = 0; i <= 4; i++)
        {
            if (Tab[i] > max) max = Tab[i]; 
            if (Tab[i] < min) min = Tab[i]; 
        }
        System.out.printf(" le nombre min est:" + min);
        System.out.printf("%n le nombre max est: " + max);
        moyenne = (float)sommme / 5;
        System.out.println("La moyenne des valeurs est"+moyenne);
    }
}
