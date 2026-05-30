/* Generated from 'RCLoopsForEach.nrx' 28 May 2026 21:47:49 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCLoopsForEach{
 private static final java.lang.String $0="RCLoopsForEach.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx days[];
  java.util.List daysl;
  java.util.Iterator daysi;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Foreach");
  
  days=new netrexx.lang.Rexx[]{netrexx.lang.Rexx.toRexx("Sunday"),netrexx.lang.Rexx.toRexx("Monday"),netrexx.lang.Rexx.toRexx("Tuesday"),netrexx.lang.Rexx.toRexx("Wednesday"),netrexx.lang.Rexx.toRexx("Thursday"),netrexx.lang.Rexx.toRexx("Friday"),netrexx.lang.Rexx.toRexx("Saturday")};
  daysl=java.util.Arrays.asList((java.lang.Object[])days);
  daysi=daysl.iterator();
  
  {for(;;){if(!(daysi.hasNext()))break;
   netrexx.lang.RexxIO.Say(daysi.next());
   }
  }
  return;}
 
 
 private RCLoopsForEach(){return;}
 }
