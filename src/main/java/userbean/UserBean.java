package userbean;

import java.io.Serializable;

public class UserBean implements Serializable{

    private String first_name;
    private String last_name;

    public UserBean(){};

    public String get_first_name() {
        return this.first_name;
    }
    public String get_last_name() {
        return this.last_name;
    }

    public void set_first_name(String first_name) {
        this.first_name = first_name;
    }

    public void set_last_name(String last_name) {
        this.last_name = last_name;
    }
}
