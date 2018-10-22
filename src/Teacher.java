public class Teacher extends Person {

    private String Subject;
    private String Title;

    public Teacher(String Subject, String Title, String firstName, String familyName) {
        super(firstName, familyName);
        this.Subject = Subject;
        this.Title = Title;
    }

    public String getSubject {
        return Subject;
    }

    public String setSubject {
        this.Subject = Subject;
    }
}
