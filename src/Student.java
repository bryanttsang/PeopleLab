public class Student extends Person
{
    private double GPA;
    private int Grade;
    private int Age;

    public Student(double GPA, int Grade, int Age, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.GPA = GPA;
        this.Grade = Grade;
        this.Age = Age;
    }

    public double getGPA()
    {
        return GPA;
    }

    public int getGrade()
    {
        return Grade;
    }

    public int getAge()
    {
        return Age;
    }

    @Override
    public String toString()
    {
        return this.getFamilyName() + ", " + this.getFirstName();
    }
}
