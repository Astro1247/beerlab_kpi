package kpi.ua;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
//import kpi.ua.generated.Brewery;
import kpi.brewery.Brewery;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.InputStream;

public class DomRunner {
    public static void main(String[] args) throws Exception {
        InputStream in = DomRunner.class.getResourceAsStream("/beer.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse( in );
        Element root = document.getDocumentElement();

        NodeList rootChilds =  root.getChildNodes();
        for( int i = 0 ; i<rootChilds.getLength() ; i++){
            Node node = rootChilds.item(i);
            //System.out.println(node);
            if( node.getNodeType() == Node.ELEMENT_NODE ){
                Element el = (Element) node;
                String name = el.getNodeName();
                if("chars".equals(name)){
                    parseChars(el);
                }
                if("ingridients".equals(name)){
                    parseIngridients(el);
                }
            }
        }
        System.out.println("===========JAXB=====================");
        JAXBContext context = JAXBContext.newInstance( Brewery.class );
        Unmarshaller unm = context.createUnmarshaller();
        Brewery Brewery = (Brewery) unm.unmarshal(DomRunner.class.getResourceAsStream("/beer.xml") );
        System.out.println( Brewery );

        System.out.println("===========XPATH===================");
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();

        XPathExpression expr = xpath.compile("/brewery/beer[0]/ingridients[1]/ingridient");
        String result = (String) expr.evaluate(document , XPathConstants.STRING);
        System.out.println(result);
        System.out.println("==============JSON===============");
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println( objectMapper.writeValueAsString(Brewery));
        String json = objectMapper.writeValueAsString(Brewery);
        Brewery BreweryReaded = objectMapper.readValue(json, Brewery.class);
        System.out.println(BreweryReaded);

    }

    private static void parseIngridients(Element ingridients) {
        NodeList ingridientsChildren = ingridients.getChildNodes();
        for( int i=0; i<ingridientsChildren.getLength(); i++){
            Node node = ingridientsChildren.item(i);
            if( node.getNodeType() == Node.ELEMENT_NODE ){
                Element ingridientElement = (Element) node;
                System.out.println(ingridientElement);
            }
        }
    }

    private static void parseChars(Element chars) {
        NodeList charsChilds = chars.getChildNodes();
        for(int i=0; i<charsChilds.getLength();i++){
            Node node = charsChilds.item(i);
            if( node.getNodeType() == Node.ELEMENT_NODE){
                Element exam = (Element) node;
                String charName = exam.getAttribute("name");
                System.out.println(charName);
            }
        }

    }
}
