package com.example.kamaloli.crosschat.communication;

/**
 * Created by KAMAL OLI on 12/02/2017.
 */

public class UserInformationController {
    //r=remotelyChatingUser
    String userName,rUserName;
    String usersName,rUsersName;
    String password;
    String email,rEmail;
    String mobileNumber;
    boolean currentStatus,rCurrentStatus;
    public UserInformationController(String userName,String password,String email){
        this.userName=userName;
        this.password=password;
        this.email=email;
    }
    private void setRemotelyChatingUserInfo(String userName,String name,String email){
        rUserName=userName;
        rUsersName=name;
        rEmail=email;

    }
    private String getRemotelyChatingUserName(){
        return rUserName;
    }
    private String getRemotelyChatingUsersname(){
        return rUsersName;
    }
    private String getRemotelyChatingUsersEmail(){
        return rEmail;
    }
}
