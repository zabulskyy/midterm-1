public class MailType {
    private String appointment;

    private Integer minAge = null;
    private Integer maxAge = null;
    private Boolean sex = null;

    MailType(String appointment){
        this.appointment = appointment;
    }

    boolean isProperFor(Client c){
        if (this.maxAge != null && this.minAge != null){
            return this.minAge <= c.getAge() && c.getAge() <= this.maxAge;
        }
        return this.sex == c.getSex();
    }

    @Override
    public String toString() {
        return this.getAppointment();
    }

    public MailType setAgeRange(int minAge, int maxAge){
        if (maxAge < minAge || minAge < 0 || maxAge < 0){
            System.out.println("age range is not proper");
            return this;
        }
        this.maxAge = maxAge;
        this.minAge = minAge;
        return this;
    }

    public boolean getSex() {
        return sex;
    }

    public MailType setSex(boolean sex) {
        this.sex = sex;
        return this;
    }

    public String getAppointment() {
        return appointment;
    }

    public MailType setAppointment(String appointment) {
        this.appointment = appointment;
        return this;
    }
}
