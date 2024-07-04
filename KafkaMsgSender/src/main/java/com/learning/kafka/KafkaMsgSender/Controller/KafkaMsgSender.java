package com.learning.kafka.KafkaMsgSender.Controller;

import com.learning.kafka.KafkaMsgSender.Service.ProducerService;
import com.learning.kafka.KafkaMsgSender.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class KafkaMsgSender {

    @Autowired
     private  ProducerService producerService;

    @PostMapping("/send")
    public ResponseEntity<String> send(@RequestBody MessageDTO messageDTO) {
        if (messageDTO.getTopic() == null || messageDTO.getTopic() .trim().isEmpty() || messageDTO.getMsg() == null || messageDTO.getMsg().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("Topic and message cannot be null or empty");
        }
        producerService.sendMessage(messageDTO.getTopic(), messageDTO.getMsg());
        return ResponseEntity.ok("Message Sent Successfully!!!");
    }
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<String> handleMissingParams(MissingServletRequestParameterException ex) {
        String paramName = ex.getParameterName();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(paramName + " parameter is missing");
    }



}
