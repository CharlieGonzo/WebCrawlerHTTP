package com.example.crawler;

import java.util.LinkedList;
import java.util.Queue;

public class URLFrontier {

    private Queue<String> URLs;

    public URLFrontier(){
        URLs = new LinkedList<>();
    }

    public void addURL(String URL){
        URLs.add(URL);
    }

    public String getnextURL(){
        return URLs.remove();
    }
}
