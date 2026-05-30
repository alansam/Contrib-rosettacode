/* Generated from 'RCReverseString.nrx' 28 May 2026 22:11:07 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCReverseString{
 private static final java.lang.String $0="RCReverseString.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx reverseThis;
  netrexx.lang.Rexx sihTesrever;
  reverseThis=netrexx.lang.Rexx.toRexx("asdf");
  sihTesrever=reverseThis.reverse();
  
  netrexx.lang.RexxIO.Say(reverseThis);
  netrexx.lang.RexxIO.Say(sihTesrever);
  
  return;
  }
 
 
 private RCReverseString(){return;}
 }
