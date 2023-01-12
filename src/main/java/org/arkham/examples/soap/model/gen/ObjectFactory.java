//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.01.11 a las 06:56:10 PM CST 
//


package org.arkham.examples.soap.model.gen;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.arkham.examples.soap.model.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.arkham.examples.soap.model.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NumberToWords }
     * 
     */
    public NumberToWords createNumberToWords() {
        return new NumberToWords();
    }

    /**
     * Create an instance of {@link NumberToWordsResponse }
     * 
     */
    public NumberToWordsResponse createNumberToWordsResponse() {
        return new NumberToWordsResponse();
    }

    /**
     * Create an instance of {@link NumberToDollars }
     * 
     */
    public NumberToDollars createNumberToDollars() {
        return new NumberToDollars();
    }

    /**
     * Create an instance of {@link NumberToDollarsResponse }
     * 
     */
    public NumberToDollarsResponse createNumberToDollarsResponse() {
        return new NumberToDollarsResponse();
    }

}
