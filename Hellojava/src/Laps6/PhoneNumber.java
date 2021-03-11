package Laps6;

import java.util.ArrayList;

public class PhoneNumber {
    String name;
    ArrayList<String> phone;

    public PhoneNumber(String name,String phone) {
        this.name = name;
        this.phone = new ArrayList<>();
        this.phone.add(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPhone(String phone){
        this.phone.add(phone);
    }

    public void removePhone(String phone){
        this.phone.remove(phone);
    }
}
