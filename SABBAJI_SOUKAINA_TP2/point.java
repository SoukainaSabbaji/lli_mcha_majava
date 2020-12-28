class	Point
{	
    public	Point	(char	n,	double	a)	
{	
    Nom	= n;
    abs	= a;
}
public	void affiche()
{	 
    System.out.println("Point :"+nom+" son abscisse :"+abs)	;
}
public	void translate(double dx)
{	
    abs	+=	dx	;
}

public	class test111
{	
    public	static	void	main	(String	args[])
    {	
    Point x = new Point('a',1)	;
    x.affiche();
    x.translate(3);
    x.affiche();
    Point y	= new Point('b',6.5)	;
    y.affiche();
    }
}