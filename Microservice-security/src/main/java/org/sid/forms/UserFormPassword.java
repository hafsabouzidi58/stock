package org.sid.forms;

import lombok.Data;

@Data
public class UserFormPassword{

    private String username;
    private String password;
    private String confirmedPassword;

    public String getUsername() {
        return username;
    }

    public UserFormPassword(String username, String password, String confirmedPassword) {
        this.username = username;
        this.password = password;
        this.confirmedPassword = confirmedPassword;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }
}
