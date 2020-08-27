package ru.vtb.msa.person.serviceImpl;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class CustomHeader {

    public HttpHeaders createHeader(String systemFrom, String messageID) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("MessageID", String.valueOf(UUID.randomUUID()));
        headers.add("SystemTo", systemFrom);
        headers.add("SystemFrom", "CustomerHub");
        headers.add("MessageDate", String.valueOf(LocalDateTime.now()));
        headers.add("CorrelationId", messageID);
        return headers;
    }
}
