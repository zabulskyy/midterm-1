public class Client {
    private String name;
    private int age;
    private boolean sex;  // 0 is female; 1 is male
    private String otherInformation;

    Client(String name, int age, boolean sex, String otherInformation) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.otherInformation = otherInformation;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Client setAge(int age) {
        this.age = age;
        return this;
    }

    public boolean getSex() {
        return sex;
    }

    public Client setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    public String getOtherInformation() {
        return otherInformation;
    }

    public Client setOtherInformation(String otherInformation) {
        this.otherInformation = otherInformation;
        return this;
    }
}
