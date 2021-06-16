package com.example.demo.controller;

public class Utils {


    public static String formatTime(String time) {
        return String.format("%s/%s/%s %s:%s:%s",
                time.substring(0,4), time.substring(4,6), time.substring(6,8),
                time.substring(8,10), time.substring(10,12), time.substring(12,14)
        );
    }
}
