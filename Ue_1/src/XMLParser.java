import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class XMLParser {
	
  @SuppressWarnings({ "unchecked", "rawtypes" })
public String countFrequency(String str) {
	// TODO Auto-generated method stub
	  String tokens[] = str.split(" ");
	  
	  HashMap<String, Integer> hmap = new HashMap<String , Integer>();
	  for (String st : tokens) {
		  if (!st.isEmpty()) {
		        Integer frequency = hmap.get(st);

		        if (frequency == null) {
		            frequency = 0;
		        }

		        ++frequency;
		        hmap.put(st, frequency);
		    }
		}
	
	 String result = "";
	 
	 
	
	/* for ( String name: hmap.keySet()){

         String key =name.toString();
         String value = hmap.get(name).toString();  
         //System.out.println(key + " " + value);  
         result = result +key + " : " + value +"\r"; 

} */
	 
		 Object[] a = hmap.entrySet().toArray();
		 Arrays.sort(a, new Comparator() {
		     public int compare(Object o1, Object o2) {
		         return ((Map.Entry<String, Integer>) o2).getValue()
		                    .compareTo(((Map.Entry<String, Integer>) o1).getValue());
		     }
		 });
		 int limit = 0 ; 
		 for (Object e : a) {
			 limit++;
		     //System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
		             //+ ((Map.Entry<String, Integer>) e).getValue());
			 if(limit<30) {
			 result+=     ((Map.Entry<String, Integer>) e).getKey() + " : "
	             + ((Map.Entry<String, Integer>) e).getValue()+"\r";
			 }
		 }
	 
	 
	  
	  return result;
}
  
  public static void main(String argv[]) {
	  String txt = "";
	  XMLParser xmlp = new XMLParser();
	  
	  
	  
    try {
    
    File dir = new File("src/XmlFolder");
    	// Create a FileFilter that matches ".xml" files
    FileFilter filter = new FileFilter() {
    	   @Override
    public boolean accept(File file) {
    	   return file.isFile() && file.getName().endsWith(".xml");
    	    }
    	};

    	// Get pathnames of matching files.
    File[] paths = dir.listFiles(filter);
    //System.out.println(paths.length);
    	
	//File fXmlFile = new File("C:\\Users\\BILL\\eclipse-workspace\\HelloWorld\\src\\XmlFolder\\reut2-000.xml");
	for(int j = 0 ; j<paths.length ; j++) {
	File fXmlFile = paths[j];
    
	System.out.println("reut2-00" + j );
	
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
	
	//System.out.println("--"+doc);

	doc.getDocumentElement().normalize();
	//System.out.println("Root element :" + doc.getDocumentElement().getNodeName());


	NodeList nList = doc.getElementsByTagName("REUTERS");
	
	//System.out.println(nList.getLength());
	
	System.out.println("----------------------------");
	for (int i = 0; i < nList.getLength(); i++) {
		
		

		Node nNode = nList.item(i);
		
		
		//System.out.println("\nCurrent Element :" + nNode.getNodeName());
		
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;
			
			
			//System.out.println("Document id : " + eElement.getAttribute("NEWID"));
			/*if(eElement.getElementsByTagName("TITLE").item(0)!=null) {
				String str = (eElement.getElementsByTagName("TITLE").item(0).getTextContent()).toLowerCase();
				//int frequency = new StringTokenizer(str, "/s").countTokens();
				 
				
				//System.out.println("Number of Tockens in Title : "+frequency);
				
				System.out.println("------------------------------------------------");
				System.out.println("Frequency of Tokens : " +  xmlp.countFrequency(str));
				System.out.println("-------------------------------------------------");
			}*/
			
				
			
			if(eElement.getElementsByTagName("TEXT").item(0)!=null) {
				txt+= (eElement.getElementsByTagName("TEXT").item(0).getTextContent()).toLowerCase()+"\r";
				//int frequency = new StringTokenizer(txt, "/s").countTokens();
				//System.out.println("Number of Tockens in Text : "+frequency);
				}
			
			/*if(eElement.getElementsByTagName("TOPICS").item(0)!=null) {
				String str = (eElement.getElementsByTagName("TOPICS").item(0).getTextContent()).toLowerCase();
				System.out.println("TOPICS : "+str+ " ---> " +eElement.getElementsByTagName("TOPICS").getLength());}
			
			if(eElement.getElementsByTagName("PLACES").item(0)!=null) {
				String str = (eElement.getElementsByTagName("PLACES").item(0).getTextContent()).toLowerCase();
				System.out.println("PLACES : "+str + " ---> " +eElement.getElementsByTagName("PLACES").getLength());}
			
			
			if(eElement.getElementsByTagName("POEPLE").item(0)!=null) {
				String str = (eElement.getElementsByTagName("POEPLE").item(0).getTextContent()).toLowerCase();
				System.out.println("POEPLE : "+str + eElement.getElementsByTagName("POEPLE").getLength());}
			
			//System.out.println("Title : " + eElement.getElementsByTagName("TITLE").item(0).getTextContent());
			//System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
			//System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
			//System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());*/

		}
		
	}
	}
    } catch (Exception e) {
	e.printStackTrace();
    }
    System.out.println("------------------------------------------------");
	//System.out.println(txt);
	//System.out.println(xmlp.countFrequency("bilal bilal aa aaa bb a a n Anja"));
	System.out.println("Frequency of Tokens : " +  xmlp.countFrequency(txt));
	System.out.println("-------------------------------------------------");
  }

}