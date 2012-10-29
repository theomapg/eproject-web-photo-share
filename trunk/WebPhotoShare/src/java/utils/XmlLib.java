/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author NghiaTa
 */
public class XmlLib {

    private String filePath;
    private DocumentBuilderFactory dbf;
    private DocumentBuilder db;
    private File file;
    private Document d;

    public XmlLib(String filePath) {
        this.filePath = filePath;
        this.dbf = DocumentBuilderFactory.newInstance();
        try {
            this.db = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(XmlLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.file = new File(filePath);
        try {
            d = db.parse(file);
        } catch (SAXException ex) {
            Logger.getLogger(XmlLib.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(XmlLib.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String readNode(String nodeName) {
        Element element = d.getDocumentElement();
        NodeList nodelist = element.getChildNodes();
        for (int i = 0; i < nodelist.getLength(); i++) {
            if (nodelist.item(i).getNodeName().equals(nodeName)) {
                return nodelist.item(i).getTextContent();
            }
        }
        return null;
    }

    public boolean rewriteFileXML(String[] nodeName, String[] value) {
        Element element = d.getDocumentElement();
        NodeList nodelist = element.getChildNodes();
        for (int j = 0; j < nodeName.length; j++) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                if (nodelist.item(i).getNodeName().equals(nodeName[j])) {
                    nodelist.item(i).setTextContent(value[j]);
                }
            }
        }

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = null;
        try {
            t = tf.newTransformer();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(XmlLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        DOMSource source = new DOMSource(d);
        StreamResult result = new StreamResult(new File(filePath));
        try {
            t.transform(source, result);
            return true;
        } catch (TransformerException ex) {
            Logger.getLogger(XmlLib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
