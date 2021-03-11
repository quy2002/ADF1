package Laps6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> phoneList;

    public PhoneBook(){
        phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p:phoneList){
            if(p.getName() == name){
                if(!p.phone.contains(phone)){
                    p.addPhone(phone);
                }
                return;
            }
        }
        PhoneNumber newphone = new PhoneNumber(name,phone);
        phoneList.add(newphone);
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p:phoneList){
            if(p.getName() == name){
                phoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldphone, String newphone) {
        for (PhoneNumber p:phoneList){
            if(p.getName() == name){
                p.removePhone(oldphone);
                p.addPhone(newphone);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber p:phoneList){
            if(p.getName() == name){
                System.out.println("Name: "+name);
                for(String s:p.phone){
                    System.out.println(s);
                }
                return;
            }
        }
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

    }

    public void print(){
        for(PhoneNumber p:phoneList){
            System.out.println(p.getName());
        }
    }
}
