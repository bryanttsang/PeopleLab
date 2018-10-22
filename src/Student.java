public class Student extends Person
{
    private double GPA;
    private String Sex;
    private int Age;

    public Student(double GPA)
    {
        super("", "");
        this.GPA = GPA;
        this.Sex = Sex;
        this.Age = Age;
    }

    @Override
    public double getGPA()
    {
        return GPA;
    }

    @Override
    public String getSex()
    {
        return Sex;
    }

    @Override
    public int getAge()
    {
        return Age;
    }

    @Override
    public String toString()
    {
        return familyName + ", " + firstName;
    }
}
