
package kpi.brewery;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kpi.brewery package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kpi.brewery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Brewery }
     * 
     */
    public Brewery createBrewery() {
        return new Brewery();
    }

    /**
     * Create an instance of {@link Brewery.Beer }
     * 
     */
    public Brewery.Beer createBreweryBeer() {
        return new Brewery.Beer();
    }

    /**
     * Create an instance of {@link Brewery.Beer.Chars }
     * 
     */
    public Brewery.Beer.Chars createBreweryBeerChars() {
        return new Brewery.Beer.Chars();
    }

    /**
     * Create an instance of {@link Brewery.Beer.Ingridients }
     * 
     */
    public Brewery.Beer.Ingridients createBreweryBeerIngridients() {
        return new Brewery.Beer.Ingridients();
    }

    /**
     * Create an instance of {@link Brewery.Beer.Chars.Char }
     * 
     */
    public Brewery.Beer.Chars.Char createBreweryBeerCharsChar() {
        return new Brewery.Beer.Chars.Char();
    }

}
