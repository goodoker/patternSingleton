package com.company.Netology;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {}

    public void log(String msg) {
        System.out.println("[" + LocalDateTime.now().format(DateTimeFormatter.
                ofPattern("dd.mm.yyyy HH:mm:ss")) + " " + num++ + "]" + msg);
    }

    public static Logger getInstance() {
        if(logger == null) logger = new Logger();
        return logger;
    }


}
