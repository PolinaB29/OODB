package lab1;

import java.util.Date;

public class Staff {
    private String fullName;
    private int passport;
    private Date birthday;
    private String position;

    public Staff(String fullName, int passport, Date birthday,String position) {
        this.fullName = fullName;
        this.passport = passport;
        this.birthday = birthday;
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPassport() {
        return passport;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
