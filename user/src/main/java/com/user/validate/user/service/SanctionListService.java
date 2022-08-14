package com.user.validate.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.yaml.snakeyaml.tokens.ScalarToken;

import java.io.*;
import java.util.Scanner;
//import java.lang.reflect.Field;



@Service
public class SanctionListService {
    Status status = new Status();

     String inputFileName = "C:\\Users\\Administrator\\Desktop\\Git Commands.txt";
     boolean matchFound = false;

     public Status fetchUserInSanctionList(String name) {

         try (Scanner scanner = new Scanner(new FileInputStream(inputFileName))) {

             while (scanner.hasNextLine()) {
                 if (scanner.nextLine().contains(name)) {
                     matchFound = true;
                     break;
                 }

             }

         } catch (FileNotFoundException e) {

             throw new RuntimeException(e);
         }

         if(matchFound) status.setMessage("Found");
         else status.setMessage("Not Found");

         return status;
     }

}
