public class Human {

    private String name;
    private int age;
    private Sex sex;
    private String lastname;

    public Human(String name, int age, Sex sex, String lastname) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.lastname = lastname;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }


    public String getLastame() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Human{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", sex=" + sex +
            ", lastname='" + lastname + '\'' +
            '}';
    }
}
