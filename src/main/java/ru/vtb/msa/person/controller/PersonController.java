package ru.vtb.msa.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.vtb.msa.person.serviceImpl.CustomHeader;
import ru.vtb.msa.person.serviceImpl.SoapPersonMatch;
import ru.vtb.msa.person.wsdl.dataquality.PersonMatchInput;
import ru.vtb.msa.person.wsdl.xml.swipersonmatchoutputio.SwiPersonMatchOutputIO;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

@RestController
public class PersonController {

    @Autowired
    SoapPersonMatch soapPersonMatch;

    @Autowired
    CustomHeader customHeader;

    @PostMapping(value = "/match",
            consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> match(@RequestBody PersonMatchInput request) throws JAXBException {

        Object response = soapPersonMatch.SoapTransfer(request);

        ResponseEntity<?> responseEntity;
        HttpHeaders header = customHeader.createHeader("MDM","Id");
        if(response instanceof SwiPersonMatchOutputIO)
            responseEntity = new ResponseEntity<>(response, header , HttpStatus.CREATED);
        else
            responseEntity = new ResponseEntity<>(response, header , HttpStatus.BAD_REQUEST);
        return responseEntity;
    }

}
