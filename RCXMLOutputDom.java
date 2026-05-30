/* Generated from 'RCXMLOutputDom.nrx' 28 May 2026 22:36:54 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import javax.xml.transform.TransformerFactory;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.parsers.DocumentBuilderFactory;

/* NetRexx */


















public class RCXMLOutputDom{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCXMLOutputDom.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String names[];
  java.lang.String remarks[];
  org.w3c.dom.Document doc=null;
  org.w3c.dom.Element root=null;
  netrexx.lang.Rexx i_=null;
  org.w3c.dom.Element character=null;
  javax.xml.transform.dom.DOMSource source=null;
  java.io.StringWriter buffer=null;
  javax.xml.transform.stream.StreamResult result=null;
  javax.xml.transform.Transformer transformer=null;
  java.lang.Exception ex=null;
  names=new java.lang.String[]{"April","Tam O\'Shanter","Emily"};
  
  
  
  remarks=new java.lang.String[]{"Bubbly: I\'m > Tam and <= Emily","Burns: \"When chapman billies leave the street ...\"","Short & shrift"};
  
  
  
  
  
  {try{
   // Create a new XML document
   doc=DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
   
   // Append the root element
   root=doc.createElement("CharacterRemarks");
   doc.appendChild((org.w3c.dom.Node)root);
   
   // Read input data and create a new <Character> element for each name.
   {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(names.length).OpSub(null,$01);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
    character=doc.createElement("Character");
    root.appendChild((org.w3c.dom.Node)character);
    character.setAttribute("name",names[i_.toint()]);
    character.appendChild((org.w3c.dom.Node)(doc.createTextNode(remarks[i_.toint()])));
    }
   }/*i_*/
   
   // Serializing XML in Java is unnecessary complicated
   // Create a Source from the document.
   source=new DOMSource((org.w3c.dom.Node)doc);
   
   // This StringWriter acts as a buffer
   buffer=new StringWriter();
   
   // Create a Result as a transformer target.
   result=new StreamResult((java.io.Writer)buffer);
   
   // The Transformer is used to copy the Source to the Result object.
   transformer=TransformerFactory.newInstance().newTransformer();
   transformer.setOutputProperty("indent","yes");
   transformer.transform((javax.xml.transform.Source)source,(javax.xml.transform.Result)result);
   
   // Now the buffer is filled with the serialized XML and we can print it to the console.
   netrexx.lang.RexxIO.Say(buffer.toString());
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 
 private RCXMLOutputDom(){return;}
 }
