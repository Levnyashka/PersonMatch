package ru.vtb.msa.person.config;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessageCreationException;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    public Object callWebService(String url, Object request, String Action) {
        Object object;
        try {
            object = getWebServiceTemplate()
                    .marshalSendAndReceive(url, request, new SoapActionCallback(Action));

        }
        catch (SoapMessageCreationException ex) {
            throw ex;
        }

        return object;
    }

}
