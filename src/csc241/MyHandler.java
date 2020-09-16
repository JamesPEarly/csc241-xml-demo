package csc241;

import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;



class MyHandler extends DefaultHandler{

    private String currentMonth;
    public Holiday currentHoliday;

    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        //System.out.println("URI: " + uri);
        //System.out.println("LOCALNAME: " + localName);
        //System.out.println("QNAME: " + qName);
        for (int i = 0; i < attributes.getLength(); i++){
            //System.out.println("\t" + attributes.getQName(i) + "=" + attributes.getValue(i));
        }
        // Check for month
        if (qName.equals("month")){
            currentMonth = attributes.getValue("name");
            //System.out.println("NEW MONTH: " + currentMonth);
        }

        if (qName.equals("holiday")){
            currentHoliday = new Holiday(currentMonth,
                    Integer.parseInt(attributes.getValue("day")),
                    attributes.getValue("name"));
            System.out.println(currentHoliday);
        }
    }
}
