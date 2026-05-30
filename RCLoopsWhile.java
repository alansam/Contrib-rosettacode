/* Generated from 'RCLoopsWhile.nrx' 28 May 2026 21:50:37 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCLoopsWhile{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(2);
 private static final java.lang.String $0="RCLoopsWhile.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx x_;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/While");
  
  x_=new netrexx.lang.Rexx((short)1024);
  {for(;;){if(!x_.OpGt(null,$01))break;
   netrexx.lang.RexxIO.Say(x_.right(new netrexx.lang.Rexx((byte)6)));
   x_=x_.OpDivI(null,$02); // integer division
   }
  }
  return;}
 
 
 private RCLoopsWhile(){return;}
 }
