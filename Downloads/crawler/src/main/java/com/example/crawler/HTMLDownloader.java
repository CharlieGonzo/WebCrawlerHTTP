package com.example.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HTMLDownloader {



    private Queue<List<Element>> list;

    public HTMLDownloader(){
        list = new LinkedList<>();
    }


    public List<Element> retrieveHTMLFile(){
        return list.remove();
    }

    public void downloadFile(String URL) throws IOException {
        Document html = Jsoup.connect(URL).get();
        List<Element> list = html.getAllElements();
        this.list.add(list);
        for(int i = 0;i<list.size();i++){
            Element e = list.get(i);
            Attribute a = e.attribute("href");
            if(a != null)
             System.out.println(a.toString().substring(6,a.toString().length()-1));
        }
    }


}
