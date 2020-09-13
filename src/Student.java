public class Student extends Human {

    private long zach;
    private String group;

    public Student(String name, String lastname, int age, Sex sex,  long zach, String group) {
        super(name, age, sex, lastname);
        this.zach = zach;
        this.group = group;
    }

    public Student() {
    }

    public long getZach() {
        return zach;
    }

    public void setZach(long zach) {
        this.zach = zach;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student[" +
            "zach=" + zach +
            ", group='" + group + '\'' +
            ']' + super.toString();
    }
}
