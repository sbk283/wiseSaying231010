package org.example;

public class WiseSaying {
    private long Id;
    private String author;
    private String content;

    WiseSaying(long Id,String author,String content){
        this.Id = Id;
        this.author = author;
        this.content = content;
    }
    public long getId(){
        return this.Id;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getContent(){
        return this.content;
    }
}