package com.usersapiexample.users.models;

public class UserDeleteStatus {

    private Long userId;
    private Boolean deleted;

    public static UserDeleteStatus deleted(Long userId){
        return new UserDeleteStatus(userId, true);
    }

    public static UserDeleteStatus notDeleted(Long userId){
        return new UserDeleteStatus(userId, false);
    }

    private UserDeleteStatus(Long userId, Boolean deleted){
        this.userId = userId;
        this.deleted = deleted;
    }

    public Boolean getDeleted(){
        return this.deleted;
    }

    public String getMessage(){
        String prefix = "User with id=" + this.userId.toString();
        if(this.deleted) {
            return prefix.concat(" has been deleted");
        }
        return prefix.concat(" cannot be deleted");
    }
}
