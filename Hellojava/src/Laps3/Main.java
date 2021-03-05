package Laps3;

public class Main {
    public static void main(String[] args){
        Room r = new Room();
        r.setName("Phong 1");
        r.setPosition("Tang 2");
        r.addUser("Trần Đình Qúy");
        r.addUser("Phí Văn Long");
        r.addUser("Đỗ Văn Huấn");
        r.removeUser(2);
        for(String s: r.users){
            System.out.println(s);
        }
    }
}
