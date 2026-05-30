/* Generated from 'RCStringInterp.nrx' 28 May 2026 22:31:42 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */
import java.text.MessageFormat;
import java.text.FieldPosition;

/* NetRexx */








public class RCStringInterp{
 private static final java.lang.String $0="RCStringInterp.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  useBif();
  useMessageFormat();
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static void useBif(){
  netrexx.lang.Rexx st;
  netrexx.lang.Rexx si;
  
  st=netrexx.lang.Rexx.toRexx("Mary had a %1$ lamb.");
  si=netrexx.lang.Rexx.toRexx("little");
  
  netrexx.lang.RexxIO.Say(st.changestr(netrexx.lang.Rexx.toRexx("%1$"),si));
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static void useMessageFormat(){
  java.lang.StringBuffer result;
  java.lang.Object args;
  java.text.MessageFormat msgfmt;
  
  result=new java.lang.StringBuffer("");
  
  args=(java.lang.Object)(new java.lang.Object[]{(java.lang.Object)(java.lang.Integer.valueOf(7)),(java.lang.Object)(new java.util.Date()),(java.lang.Object)netrexx.lang.Rexx.toRexx("a disturbance in the Force")});
  
  
  
  
  msgfmt=new MessageFormat("At {1, time} on {1, date}, there was {2} on planet {0, number, integer}.");
  result=msgfmt.format(args,result,new FieldPosition(0));
  netrexx.lang.RexxIO.Say(result);
  
  return;
  }
 
 
 private RCStringInterp(){return;}
 }
