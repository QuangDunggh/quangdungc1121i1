package useDemerging;

import java.util.Date;

public class Staff {
    private String fullName;
    private boolean gender;
    private Date birth;
    public Staff(String fullName, boolean gender, Date birth) {
        this.fullName = fullName;
        this.gender = gender;
        this.birth = birth;
    }
}
