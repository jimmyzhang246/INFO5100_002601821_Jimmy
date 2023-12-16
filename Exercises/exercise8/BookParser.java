package exercise8;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;

public class BookParser {

    public static void main(String[] args) {
        String xmlContent = "<BookShelf> ... </BookShelf>";
        String jsonContent = "{ \"BookShelf\": [ ... ] }";

        Document xmlDocument = parseXML(xmlContent);
        printXML(xmlDocument);

        addBookToXML(xmlDocument, "西游记", "1592", "2000", "吴承恩");
        System.out.println("\nUpdated XML:");
        printXML(xmlDocument);

        JSONObject jsonObject = new JSONObject(jsonContent);
        printJSON(jsonObject);
        addBookToJSON(jsonObject, "西游记", 1592, 2000, new String[]{"吴承恩"});
        System.out.println("\nUpdated JSON:");
        printJSON(jsonObject);
    }

    private static Document parseXML(String xmlContent) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            return builder.parse(new InputSource(new StringReader(xmlContent)));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void printXML(Document xmlDocument) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(xmlDocument);
            transformer.transform(source, result);
            System.out.println(result.getWriter().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addBookToXML(Document xmlDocument, String title, String year, String pages, String author) {
        Element newBook = xmlDocument.createElement("Book");
        newBook.appendChild(createElementWithText(xmlDocument, "title", title));
        newBook.appendChild(createElementWithText(xmlDocument, "publishedYear", year));
        newBook.appendChild(createElementWithText(xmlDocument, "numberOfPages", pages));
        Element authors = xmlDocument.createElement("authors");
        authors.appendChild(createElementWithText(xmlDocument, "author", author));
        newBook.appendChild(authors);
        xmlDocument.getDocumentElement().appendChild(newBook);
    }

    private static Element createElementWithText(Document xmlDocument, String name, String text) {
        Element element = xmlDocument.createElement(name);
        element.setTextContent(text);
        return element;
    }

    private static void printJSON(JSONObject jsonObject) {
        System.out.println(jsonObject.toString(4));
    }

    private static void addBookToJSON(JSONObject jsonObject, String title, int year, int pages, String[] authors) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("publishedYear", year);
        newBook.put("numberOfPages", pages);
        newBook.put("authors", new JSONArray(authors));
        jsonObject.getJSONArray("BookShelf").put(newBook);
    }
}
