public class Fact
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez votre numero ::");
    int num  = sc.nextInt();
    int i = 1;
    int fact = 1;
    while(i <= num)
    {
        factorial *= i;
        i++;
    }
        System.out.printf("factorielle de  %d = %d", num, factorial);
    }
}