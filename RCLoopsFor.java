/* Generated from 'RCLoopsFor.nrx' 28 May 2026 21:47:24 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCLoopsFor{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx((byte)5);
 private static final java.lang.String $0="RCLoopsFor.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/For");
  
  {i_=new netrexx.lang.Rexx((byte)1);i_:for(;i_.OpLtEq(null,$01);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {int $1=i_.OpPlus(null).toint();for(;$1>0;$1--){
    netrexx.lang.RexxIO.Say("*\000");
    }
   }
   netrexx.lang.RexxIO.Say("");
   }
  }/*i_*/
  return;}
 
 
 private RCLoopsFor(){return;}
 }
