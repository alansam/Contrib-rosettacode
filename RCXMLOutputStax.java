/* Generated from 'RCXMLOutputStax.nrx' 28 May 2026 22:37:03 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.XMLOutputFactory;
import java.io.StringWriter;

/* NetRexx */










public class RCXMLOutputStax{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCXMLOutputStax.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String names[];
  java.lang.String remarks[];
  java.io.StringWriter buffer=null;
  javax.xml.stream.XMLStreamWriter out=null;
  netrexx.lang.Rexx i_=null;
  java.lang.Exception ex=null;
  names=new java.lang.String[]{"April","Tam O\'Shanter","Emily"};
  
  
  
  remarks=new java.lang.String[]{"Bubbly: I\'m > Tam and <= Emily","Burns: \"When chapman billies leave the street ...\"","Short & shrift"};
  
  
  
  
  
  {try{
   buffer=new StringWriter();
   
   out=XMLOutputFactory.newInstance().createXMLStreamWriter((java.io.Writer)buffer);
   
   out.writeStartDocument("UTF-8","1.0");
   out.writeCharacters("\n");
   
   out.writeStartElement("CharacterRemarks");
   out.writeCharacters("\n");
   
   {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(names.length).OpSub(null,$01);i_=new netrexx.lang.Rexx((byte)0);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
    out.writeStartElement("Character");
    out.writeAttribute("name",names[i_.toint()]);
    out.writeCharacters(remarks[i_.toint()]);
    out.writeEndElement();
    out.writeCharacters("\n");
    }
   }/*i_*/
   
   out.writeEndElement();
   out.writeEndDocument();
   out.writeCharacters("\n");
   
   netrexx.lang.RexxIO.Say(buffer.toString());
  }
  catch (java.lang.Exception $2){ex=$2;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 
 private RCXMLOutputStax(){return;}
 }
