/* Generated from 'RCStringCase.nrx' 28 May 2026 22:23:16 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCStringCase{
 private static final java.lang.String $0="RCStringCase.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx abc;
  abc=netrexx.lang.Rexx.toRexx("alphaBETA");
  
  netrexx.lang.RexxIO.Say(abc.upper());
  netrexx.lang.RexxIO.Say(abc.lower());
  netrexx.lang.RexxIO.Say(abc.upper(new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)1))); // capitalize 1st character
  return;}
 
 
 private RCStringCase(){return;}
 }
