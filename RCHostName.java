/* Generated from 'RCHostName.nrx' 28 May 2026 21:33:43 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCHostName{
 private static final java.lang.String $0="RCHostName.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]) throws java.net.UnknownHostException{
  netrexx.lang.RexxIO.Say(java.net.InetAddress.getLocalHost().getHostName());
  return;}
 
 
 private RCHostName(){return;}
 }
