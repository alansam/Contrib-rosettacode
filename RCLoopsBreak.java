/* Generated from 'RCLoopsBreak.nrx' 28 May 2026 21:44:56 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCLoopsBreak{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx('\000');
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(10);
 private static final java.lang.String $0="RCLoopsBreak.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx rn=null;
  java.util.Random rnd;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Break");
  
  rnd=new java.util.Random();
  
  {lb:for(;;){
   rn=new netrexx.lang.Rexx(rnd.nextInt(19));
   netrexx.lang.RexxIO.Say((rn.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$01));
   if (rn.OpEq(null,$02)) 
    break lb;
   rn=new netrexx.lang.Rexx(rnd.nextInt(19));
   netrexx.lang.RexxIO.Say((rn.right(new netrexx.lang.Rexx((byte)3))).OpCc(null,$01));
   }
  }/*lb*/
  netrexx.lang.RexxIO.Say("");
  return;}
 
 
 private RCLoopsBreak(){return;}
 }
