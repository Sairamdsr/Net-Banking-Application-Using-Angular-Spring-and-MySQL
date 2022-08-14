package com.user.validate.user.service;

import com.user.validate.user.exception.InvalidMessageCodeException;
import com.user.validate.user.model.MessageCode;
import com.user.validate.user.repository.MessageCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class MessageCodeService {

    @Autowired
    MessageCodeRepository messageCodeRepository;

    public MessageCode getMessageCodeDetails(String messageCode) throws InvalidMessageCodeException {

        Optional<MessageCode> messageCode1 = messageCodeRepository.findById(messageCode);
        if (messageCode1.isEmpty()) throw new InvalidMessageCodeException("Invalid Message Code");
        return messageCode1.get();

    }

}
