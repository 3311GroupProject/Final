package login;

import java.util.HashMap;

public class UserData {

    HashMap<String, String> userData = new HashMap<String, String>();


    public UserData() {
        //parse json here and make a HashMap


        userData.put("JOHN", "noPassword1");
        userData.put("ANNA", "noPassword2");
        userData.put("SAMEUL", "noPassword3");


    }

    protected HashMap<String, String> getUserData() {


        return userData;
    }

}
