public class Runner {

    static String firstName[] = {"Bob", "Jim", "Lauren", "Jane", "Paul"};
    static String familyName[] = {"Sand", "Thomas", "Reed", "Boat", "Forest"};
    static int Age[]= {16, 17, 17, 17, 18};
    static int Grade[] = {11, 12, 12, 11, 12};


    public static void main(String[] args) {

        Teacher teacher = new Teacher("Computer Science", "Mr", "Nathan", "Levin");
        Student[] students = new Student[5];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(firstName[i], familyName[i], Math.random()*4, Grade[i], Age[i]);
            System.out.println(students[i]);
        }

        Classroom classroom = new Classroom(students, teacher);
        classroom.printClass();
    }

    public static void randomStudent() {
        // incomplete still, we need to build a method that will randomly generate a student's information
    }
}
