public class Runner {

    static String firstName[] = {"a", "b", "c"};
    static String familyName[] = {"x", "y", "z"};

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Computer Science", "Mr.", "ABC", "XYZ");
        Student[] students = new Student[3];

        for (int i = 0; i < firstName.length; i++) {
            // randomly pick first name + surname? i think we need to make
            // a method that will randomly select a student first and then
            // call it here
        }


    }
}
