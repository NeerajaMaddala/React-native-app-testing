package ui.mobile.test.dto;

import net.datafaker.Faker;

public class BaseDTO {
    private Faker faker;
    public BaseDTO(){
        faker = new Faker();
    }


    public Faker getFaker(){
        return  faker;
    }

    public String returnDefaultString(String value){
        if(value.equals("BLANK"))
        {
            return null;
        }
        return value;
    }
}
