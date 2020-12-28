class	calcul ak
{	
    public static int  ak(int m, int n)
{	
    if	( (m<0)	|| (n<0) )	
    return	0;
    else if	(m == 0)	
    return	(n+1);
    else if(n == 0)	
    return	ak(m-1,1);
    else	
    return	 ak(m-1,ak(m,n-1));
}
}
public	class ak
{	
    public	static void	main(String	args[])
{	
    int	m,n;
    System.out.print("Entrez le premier parametre :");
    m = Clavier.lireInt();
    System.out.print("Entrez le second parametre :");
    n =	Clavier.lireInt();
    System.out.println("ak("+m+","+n+")="+calcul.ak(m,n));
}
}
