import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Group implements Voenkom {

    Student[] student = new Student[10];
    private String groupName;

    public Group() {
        this.groupName = "unknown";
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudent(Student s) throws myException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < student.length; i++) {
            if (student[i] == null) {
                s.setGroup(this.groupName);
                student[i] = s;
                //   System.out.println("Student " + s.getName() + " " + s.getLastame() + " was successfully added");
                return;
            }
        }
        throw new myException();
    }

    public Student searchByLastname(String lastname) {
        for (Student s : student) {
            if (s != null && lastname.equalsIgnoreCase(s.getLastame())) {
                return s;
            }
        }
        System.out.println("There is no such student with lastname " + lastname + " in the Group");
        return null;
    }

    public boolean deleteStudent(long number) {
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null && student[i].getZach() == number) {
                student[i] = null;
                System.out.println("Student with Zach number <" + number + "> was excluded");
                return true;
            }
        }
        System.out.println("There is no student with such Zach number <" + number + "> in the Group");
        return false;
    }

    public void addStudentInteractive() throws myException {
        while (true) {
            Student s = new Student();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Please enter student name:");
                s.setName(reader.readLine());
                System.out.println("Please enter student lastname:");
                s.setlastname(reader.readLine());
                System.out.println("Please enter student gender (FEMALE / MALE):");
                s.setSex(Sex.valueOf(reader.readLine()));
                System.out.println("Please enter student age:");
                s.setAge(Integer.parseInt(reader.readLine()));
                System.out.println("Please enter student group:");
                s.setGroup(reader.readLine());
                System.out.println("Please enter student zach:");
                s.setZach(Long.parseLong(reader.readLine()));

                addStudent(new Student());
                System.out.println(
                    "Student " + s.getName() + " " + s.getLastame() + " is added to the group: " + s.getGroup());
                break;
            } catch (Exception e) {
                System.out.println("Invalid enter, student is not added, try again? (y / n):");
                try {
                    if (reader.readLine().equals("y")) {
                        System.out.println("Please enter student data:");
                    } else {
                        break;
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }

            }
        }
    }

    public void sortByParameter(int i) {
        Arrays.sort(this.student, new StudentComparator(i));
    }

    public void sortByParameter(int i, boolean forward) {
        Arrays.sort(this.student, new StudentComparator(i, forward));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group").append(this.groupName).append(System.lineSeparator());
        int i = 0;
        return "Group{" +
            "student=" + Arrays.toString(student) +
            ", groupName='" + groupName + '\'' +
            '}';
    }

    @Override
    public Student[] getRecruter() {
        int n = 0;
        for (Student s : student) {
            if (s != null && s.getSex().equals(Sex.MALE) && s.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] recruterArray = new Student[n];
        int i = 0;
        for (Student s : student) {
            if (s != null && s.getSex().equals(Sex.MALE) && s.getAge() >= 18) {
                recruterArray[i] = s;
                i += 1;
            }
        }
        return recruterArray;
    }
}

