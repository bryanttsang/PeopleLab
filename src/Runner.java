public class Runner {

    static String firstName[] = {"Bob", "Jim", "Lauren", "Jane", "Paul"};
    static String familyName[] = {"Sand", "Thomas", "Reed", "Boat", "Forest"};
    static int Age[]= {16, 17, 17, 17, 18};
    static int Grade[] = {11, 12, 12, 11, 12};


    public static void main(String[] args) {

        Teacher teacher = new Teacher("Computer Science", "Mr", "Nathan", "Levin");
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = randomStudent();
        }

        Classroom classroom = new Classroom(students, teacher);
        classroom.printClass();
    }

    public static Student randomStudent() {
        int nameIndex = (int)(5*Math.random());
        int surnameIndex = (int)(5*Math.random());
        int gradeIndex = (int)(5*Math.random());
        int ageIndex = (int)(5*Math.random());
        double GPA = (double)(4*Math.random());

        return new Student (firstName[nameIndex], familyName[surnameIndex], GPA, Grade[gradeIndex], Age[ageIndex]);
    }
}
