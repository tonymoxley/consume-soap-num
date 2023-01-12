package org.arkham.examples.soap.config;

import org.arkham.examples.soap.client.NumbersConvClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * The objective of this class is to configure the Beans necessary to configure the client that will connect to the SOAP Service.
 * @author Ing. Antonio Hernandez
 * @version 1.0
 */
@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.arkham.examples.soap.model.gen");
        return marshaller;
    }

    @Bean
    public NumbersConvClient convClient(
            Jaxb2Marshaller marshaller, @Value("${uri.number.conversion}") String url) {
        final NumbersConvClient convClient = new NumbersConvClient(url);
        convClient.setMarshaller(marshaller);
        convClient.setUnmarshaller( marshaller() );
        return convClient;
    }

}
