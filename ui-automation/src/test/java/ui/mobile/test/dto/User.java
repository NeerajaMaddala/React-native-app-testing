package ui.mobile.test.dto;

import ch.qos.logback.core.util.StringUtil;

public class User extends BaseDTO{
    private String email;
    private String password;
    private String name;
    public String getEmail()
    {
        if(StringUtil.isNullOrEmpty(this.email))
        {
            this.email = getFaker().internet().emailAddress();
        }
        return  this.email;
    }


    public String getPassword() {
        if(StringUtil.isNullOrEmpty(this.password))
        {
            this.password =getFaker().internet().password();
        }
        return  this.password;
    }

    public String getFullName()
    {
        if(StringUtil.isNullOrEmpty(this.name))
        {
            this.name = getFaker().funnyName().name();
        }
        return  this.name;
    }




}
