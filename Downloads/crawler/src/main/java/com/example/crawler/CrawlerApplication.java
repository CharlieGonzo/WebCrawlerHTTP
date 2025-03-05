package com.example.crawler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrawlerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Seed URL
        String seed = "https://www.farmingdale.edu";

        //URL Frontier Service

        //test
        HTMLDownloader downloader = new HTMLDownloader();
        downloader.downloadFile(seed);
    }
}
