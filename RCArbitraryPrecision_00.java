/* Generated from 'RCArbitraryPrecision_00.nrx' 28 May 2026 20:19:22 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */
import java.math.BigInteger;

/* NetRexx */





// needed to report the run-time



public class RCArbitraryPrecision_00{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)30);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(10);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("...");
 private static final java.lang.String $0="RCArbitraryPrecision_00.nrx";
 private static final netrexx.lang.RexxSet $1=new netrexx.lang.RexxSet();
 static{$1.setDigits($01);}
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nanoFactor;
  long t1;
  java.math.BigInteger x;
  netrexx.lang.Rexx n;
  long t2;
  netrexx.lang.Rexx td;
  netrexx.lang.Rexx check;
  netrexx.lang.Rexx sample;
  nanoFactor=$02.OpPow($1,$03);
  
  t1=java.lang.System.nanoTime();
  x=BigInteger.valueOf(5);
  x=x.pow(BigInteger.valueOf(4).pow(BigInteger.valueOf(3).pow(2).intValue()).intValue());
  n=new netrexx.lang.Rexx(x.toString());
  t2=java.lang.System.nanoTime();
  td=new netrexx.lang.Rexx(t2).OpSub($1,new netrexx.lang.Rexx(t1));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Run time in seconds:").OpCcblank($1,td.OpDiv($1,nanoFactor)));
  netrexx.lang.RexxIO.Say("");
  
  check=netrexx.lang.Rexx.toRexx("62060698786608744707...92256259918212890625");
  sample=((n.left(new netrexx.lang.Rexx((byte)20))).OpCc($1,$04)).OpCc($1,n.right(new netrexx.lang.Rexx((byte)20)));
  
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("Expected result:").OpCcblank($1,check));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("  Actual result:").OpCcblank($1,sample));
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx("         digits:").OpCcblank($1,n.length()));
  netrexx.lang.RexxIO.Say("");
  
  if (check.OpEq($1,sample)) 
   
   netrexx.lang.RexxIO.Say("Result confirmed");
  else 
   netrexx.lang.RexxIO.Say("Result does not satisfy test");
  
  return;
  }
 
 
 private RCArbitraryPrecision_00(){return;}
 }
