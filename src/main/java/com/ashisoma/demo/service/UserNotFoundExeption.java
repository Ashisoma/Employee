package com.ashisoma.demo.service;

public class UserNotFoundExeption extends RuntimeException {
    public UserNotFoundExeption(String s) {
        super(s);
    }
}
