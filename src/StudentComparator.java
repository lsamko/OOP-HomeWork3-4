import java.util.Comparator;

public class StudentComparator implements Comparator {

    public StudentComparator(int i, boolean forward) {
    }

    public StudentComparator(int i) {
    }

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 != null && o2 == null) {
            return 1;
        }
        if (o1 == null && o2 != null) {
            return -1;
        }
        if (o1 == null && o2 == null) {
            return 0;
        }

        Student student1 = (Student) o1;
        Student student2 = (Student) o2;
        String name1 = student1.getLastame();
        String name2 = student2.getLastame();
        if (name1.compareTo(name2) > 0) {
            return 1;
        }
        if (name1.compareTo(name2) < 0) {
            return -1;
        }
        return 0;
    }
}

