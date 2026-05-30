/* Generated from 'RCHostIntrospection.nrx' 28 May 2026 21:33:13 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCHostIntrospection{
 private static final java.lang.String $0="RCHostIntrospection.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String wordSize;
  java.lang.String endian;
  wordSize=java.lang.System.getProperty("sun.arch.data.model");
  endian=java.lang.System.getProperty("sun.cpu.endian");
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(" word size:").OpCcblank(null,netrexx.lang.Rexx.toRexx(wordSize)));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("endianness:").OpCcblank(null,netrexx.lang.Rexx.toRexx(endian)));
  return;}
 
 
 private RCHostIntrospection(){return;}
 }
