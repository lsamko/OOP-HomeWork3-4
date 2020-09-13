public class Main {

    public static void main(String[] args) throws myException {
        Group group = new Group();
        Student student1 = new Student("Ivan", "Korolenko", 18, Sex.MALE, 1238881, "Math");
        Student student2 = new Student("Viktor", "Palushkov", 17, Sex.MALE, 56901019, "Physic");
        Student student3 = new Student("Lily", "Tymoshchuk", 21, Sex.FEMALE, 31823012, "Chemistry");
        Student student4 = new Student("Mykyta", "Ivanov", 16, Sex.MALE, 30192831, "History");
        Student student5 = new Student("Oksana", "Pacai", 18, Sex.FEMALE, 19230853, "Math");
        Student student6 = new Student("Mariia", "Velychko", 17, Sex.FEMALE, 28152035, "Physic");
        Student student7 = new Student("Stepan", "Voitovych", 21, Sex.MALE, 20198234, "Chemistry");
        Student student8 = new Student("Denys", "Torp", 18, Sex.MALE, 98142064, "Math");
        Student student9 = new Student("Rita", "Paskal", 20, Sex.FEMALE, 21004533, "History");
        Student student10 = new Student("Lubov", "Goshiv", 18, Sex.FEMALE, 31886109, "Chemistry");
        Student student11 = new Student("Timur", "Vasko", 23, Sex.MALE, 21009451, "Physic");

        try {
            group.addStudent(student1);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student2);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student3);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student4);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student5);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student6);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student7);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student8);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student9);
        } catch (myException e) {
            e.printStackTrace();
        }
        try {
            group.addStudent(student10);
        } catch (myException e) {
            e.printStackTrace();
        }
//        try {
//            group.addStudent(student11);
//        } catch (myException e) {
//            e.printStackTrace();
//        }

        group.searchByLastname("Tutov");
        group.deleteStudent(566666433);

        group.addStudentInteractive();

    }
}
