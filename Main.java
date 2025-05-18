package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.util.List;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;

class Main {
    public static void main(String[] args) {
        //GroundTransport ground = new  GroundTransport();
        MainMenu.show();
    }

}

