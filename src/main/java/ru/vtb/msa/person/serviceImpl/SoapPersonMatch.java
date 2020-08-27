package ru.vtb.msa.person.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.vtb.msa.person.config.SoapClient;
import ru.vtb.msa.person.wsdl.dataquality.PersonMatchInput;

@Service
public class SoapPersonMatch {

    @Value("${endPoint}")
    private String endPoint;

    @Autowired
    SoapClient soapConnector;

    //@Override
    public Object SoapTransfer(PersonMatchInput request){
        Object response = soapConnector.callWebService(
                endPoint, request, "PersonMatch");
        return response;
    }

}
