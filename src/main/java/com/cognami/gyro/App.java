package com.cognami.gyro;

import clojure.lang.RT;
/**
Boot strapper for Clojure code
**/
public class App {
    private static final String MAINCLJ = "com/cognami/gyro/gyro.clj";

    public static void main(String[] args){
        System.out.println("Java Hello World!" );
        try {
            RT.loadResourceScript(MAINCLJ);
            RT.var("com.cognmi.gyro", "main").invoke(args);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
