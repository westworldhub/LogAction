package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogAction {

    private static  String logFile = "logs.txt";
    public static void WriteLogAction(String action) {

        String timeStamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        String log = timeStamp+ ": " +action;
        try {
            FileWriter myWriter = new FileWriter(logFile,true);
            myWriter.write(log + "\n");
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred trying to write to log.");
            throw new RuntimeException(e);
        }
    }
}

