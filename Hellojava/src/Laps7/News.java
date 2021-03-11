package Laps7;

import java.util.ArrayList;

public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate;
    ArrayList<Integer> rateList;

    public News() {
        rateList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Tieu de:"+getTitle());
        System.out.println("Ngay xuat ban:"+getPublishDate());
        System.out.println("Tac gia:"+getAuthor());
        System.out.println("Noi dung:"+getContent());
        System.out.println("Danh gia:"+getAverageRate());
    }

    public void calculate(){
        float a = 0;
        for (Integer x : rateList){
            a+=x;
        }
        this.averageRate = a/(rateList.size());
    }
}
