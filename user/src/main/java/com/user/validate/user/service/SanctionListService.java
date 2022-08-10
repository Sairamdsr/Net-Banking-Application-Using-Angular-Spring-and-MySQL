package com.user.validate.user.service;

import org.springframework.stereotype.Service;
//import org.yaml.snakeyaml.tokens.ScalarToken;

import java.io.*;
//import java.lang.reflect.Field;



@Service
public class SanctionListService {
    Status message = new Status();

    String[] words = null;
    File file = new File("C:\\Users\\Administrator\\Desktop\\Git Commands.txt");
    private final FileReader fileReader = new FileReader(file);
    private final BufferedReader bufferedReader = new BufferedReader(fileReader);
    String s;

    public SanctionListService() throws FileNotFoundException {
    }


    public Status fetchName(String name) throws IOException {

        while ((s = bufferedReader.readLine()) != null) {
            words = s.split(" ");
            for (String tempWord : words) {
                if (tempWord.equals(name)) {
                    message.setMessage("Found");
                    return message;
                }
                message.setMessage("Not Found");
            }
        }

        return message;
    }

}
