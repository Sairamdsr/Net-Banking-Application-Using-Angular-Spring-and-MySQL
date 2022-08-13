package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MessageCode {

    @Id
    @Column(name = "messagecode")
    private String messageCode;
    private String instruction;

    public MessageCode() {
        super();
    }

    public MessageCode(String messageCode, String instruction) {
        this.messageCode = messageCode;
        this.instruction = instruction;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
