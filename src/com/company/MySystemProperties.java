package com.company;


import java.util.Properties;

public class MySystemProperties {

    public static void main(String[] args) {
        printMySystemProperties();
    }


        public static void printMySystemProperties() {

              //  Properties props = System.getProperties();
              //  props.list(System.out);
            System.out.println(System.getProperty("os.name"));
        }
    }


