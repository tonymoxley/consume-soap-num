package org.arkham.examples.soap.client;

import org.arkham.examples.soap.model.gen.NumberToWords;
import org.arkham.examples.soap.model.gen.NumberToWordsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigInteger;

/**
 * The objective of this class is to create the methods to be used by the SOAP client to perform the HTTP requests specified in the WSDL.
 * @author Ing. Antonio Hernandez
 * @version 1.0
 */
public class NumbersConvClient extends WebServiceGatewaySupport {

    private final String endpoint;

    public NumbersConvClient(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * This method executes a SOAP request to get the word of a number.
     * @param number value to convert.
     * @return the word of a number.
     */
    public String convertNumberToWord(final Long number) {
        //create request soap
        final NumberToWords request = new NumberToWords();
        request.setUbiNum(BigInteger.valueOf(number));
        //send request
        NumberToWordsResponse response =
                (NumberToWordsResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response.getNumberToWordsResult();
    }

}
