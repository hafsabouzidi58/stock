package org.sid.forms;

import lombok.Data;

@Data
public class UserFormUsername{

    private String newUserName;
    private String lastUserName;

    public String getNewUserName() {
        return newUserName;
    }

    public UserFormUsername(String newUserName, String lastUserName) {
        this.newUserName = newUserName;
        this.lastUserName = lastUserName;
    }

    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    public String getLastUserName() {
        return lastUserName;
    }

    public void setLastUserName(String lastUserName) {
        this.lastUserName = lastUserName;
    }
}
