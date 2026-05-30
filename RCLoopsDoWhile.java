/* Generated from 'RCLoopsDoWhile.nrx' 28 May 2026 21:46:25 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCLoopsDoWhile{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(6);
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCLoopsDoWhile.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx i_;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/Do-while");
  
  i_=new netrexx.lang.Rexx((byte)0);
  {boolean $1=true;for(;;){if($1){$1=false;}else{if(i_.OpRem(null,$01).OpEq(null,$02))break;}
   i_=i_.OpAdd(null,$03);
   netrexx.lang.RexxIO.Say(i_);
   }
  }
  return;}
 
 
 private RCLoopsDoWhile(){return;}
 }
