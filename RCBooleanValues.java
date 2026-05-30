/* Generated from 'RCBooleanValues.nrx' 28 May 2026 20:28:57 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCBooleanValues{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("is true");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("is false");
 private static final java.lang.String $0="RCBooleanValues.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx bval[];
  netrexx.lang.Rexx b_=null;
  bval=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)0),new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx('a'),new netrexx.lang.Rexx(1==1),new netrexx.lang.Rexx($01.OpNotEq(null,$01)),new netrexx.lang.Rexx(isTrue()),new netrexx.lang.Rexx(isFalse())};
  
  {int $1=new netrexx.lang.Rexx(bval.length).OpPlus(null).toint();b_=new netrexx.lang.Rexx((byte)0);b_:for(;$1>0;$1--,b_=b_.OpAdd(null,new netrexx.lang.Rexx(1))){
   {/*select*/
   if ((bval[b_.toint()]).OpEqS(null,new netrexx.lang.Rexx(isTrue())))
    netrexx.lang.RexxIO.Say((bval[b_.toint()]).OpCcblank(null,$02));
   else if ((bval[b_.toint()]).OpEqS(null,new netrexx.lang.Rexx(isFalse())))
    netrexx.lang.RexxIO.Say((bval[b_.toint()]).OpCcblank(null,$03));
   else{
    netrexx.lang.RexxIO.Say((bval[b_.toint()]).OpCcblank(null,netrexx.lang.Rexx.toRexx("is not boolean")));
   }
   }
   }
  }/*b_*/
  return;}
 
 
 @SuppressWarnings("unchecked") 
 public static boolean isTrue(){
  return (1==1);
  }
 
 
 @SuppressWarnings("unchecked") 
 public static boolean isFalse(){
  return new netrexx.lang.Rexx(isTrue()).OpNot(null);
  }
 
 
 private RCBooleanValues(){return;}
 }
