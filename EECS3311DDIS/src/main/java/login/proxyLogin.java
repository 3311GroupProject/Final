package login;

import java.util.HashMap;


public class proxyLogin extends UserData {
    String incomingUsername, incomingPassword;
    static boolean loginStatus = false;
    static String loginMessage;


    /**
     * This is a constructor for ProxyLogin with parameters username and password
     *
     * @param username  - String coming form user
     * @param password- String coming from user
     */

    proxyLogin(String username, String password) {
        username = this.incomingUsername;
        password = this.incomingPassword;


        /**
         * This method invokes ProxyLogin to validate
         */
        loginStatus = doValidate(incomingUsername, incomingPassword, loginMessage);


    }


    public boolean doValidate(String username, String password, String loginMessage) {
        boolean flag = false;
        UserData uData = new UserData();
        HashMap<String, String> loginData = uData.getUserData();


        if (loginData.containsKey(username)) {
            if (loginData.get(username).equals(password)) {
                flag = true;
                loginMessage = "Login Successful";
            } else {
                loginMessage = "Invalid Password- Login Unsuccessful";
            }

        } else {
            loginMessage = "Username doesnot exist";

        }


        return flag;


    }

}		
		
