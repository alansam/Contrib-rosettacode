/* Generated from 'RCHTTP.nrx' 28 May 2026 21:27:00 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */
import java.net.URL;
import java.net.URI;
import java.util.Scanner;

/* NetRexx */








public class RCHTTP{
 private static final java.lang.String $0="RCHTTP.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String rosettaUrl=null;
  java.net.URI rosettaUri=null;
  java.util.Scanner sc=null;
  java.lang.Exception ex=null;
  {try{
   rosettaUrl="https://www.rosettacode.org";
   rosettaUri=new URI(rosettaUrl);
   //sc = Scanner(URL(rosettaUrl).openStream) -- TODO: Depricated
   sc=new Scanner(rosettaUri.toURL().openStream());
   {for(;;){if(!(sc.hasNext()))break;
    netrexx.lang.RexxIO.Say(sc.nextLine());
    }
   }
  }
  catch (java.lang.Exception $1){ex=$1;
   ex.printStackTrace();
  }}
  
  return;
  }
 
 
 private RCHTTP(){return;}
 }
