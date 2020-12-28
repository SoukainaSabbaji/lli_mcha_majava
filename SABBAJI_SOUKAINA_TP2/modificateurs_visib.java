class Data 
{
    private String name;
    public String getName() 
    {
        return this.name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
}
class Person extends Data
{
    public static void main(String[] main)
    {
        Data m = new Data();
        m.setName("Soukaina");
        System.out.println(m.getName());
    }
}