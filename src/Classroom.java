public class Classroom {

    private Student[] students;
    private Teacher teacher;

    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public String getSubject() {
        return this.teacher.getSubject();
    }

    public double classAverage() {

        double avg = 0;

        for (int i = 0; i < students.length; i++) {
            avg += students[i].getGPA();
        }

        return avg/students.length;
    }

    public void printClass() {
        System.out.println("Teacher: " + this.teacher);
        System.out.println("Subject: " + this.getSubject());

        for (int i = 0; i < students.length; i++) {
            System.out.println(this.students[i].getFirstName() + " " + this.students[i].getFamilyName());
            System.out.println("Grade: " + this.students[i].getGrade() + " GPA: " + this.students[i].getGPA() + " Age: " + this.students[i].getAge());
        }

        System.out.println("Class average: " + classAverage());


    }

}
