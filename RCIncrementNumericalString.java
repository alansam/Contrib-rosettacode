/* Generated from 'RCIncrementNumericalString.nrx' 28 May 2026 21:34:08 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCIncrementNumericalString{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCIncrementNumericalString.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx numbers;
  numbers=netrexx.lang.Rexx.toRexx("12345");
  netrexx.lang.RexxIO.Say(numbers);
  numbers=numbers.OpAdd(null,$01);
  netrexx.lang.RexxIO.Say(numbers);
  
  return;
  }
 
 
 private RCIncrementNumericalString(){return;}
 }
