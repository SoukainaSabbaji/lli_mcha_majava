class	PointNom extends	Point
{	
    public	void setPointNom(int x,int	y,char nom)
{	
    setPoint(x,y);
    this.nom = nom;
}
public	void setNom(char nom)
{	
    this.nom = nom;
}
public void affCoordNom()
{	
    System.out.print("Point	de	nom	"+nom+"");
}
