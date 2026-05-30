/* Generated from 'RCBinaryDigits.nrx' 28 May 2026 18:00:30 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCBinaryDigits{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCBinaryDigits.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx nums[];
  netrexx.lang.Rexx n_=null;
  netrexx.lang.Rexx v_=null;
  nums=new netrexx.lang.Rexx[]{new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)50),new netrexx.lang.Rexx((short)9000)};
  
  {netrexx.lang.Rexx $1=new netrexx.lang.Rexx(nums.length).OpSub(null,$01);n_=new netrexx.lang.Rexx((byte)0);n_:for(;n_.OpLtEq(null,$1);n_=n_.OpAdd(null,new netrexx.lang.Rexx(1))){
   v_=nums[n_.toint()];
   netrexx.lang.RexxIO.Say(v_.d2x().x2b().strip(new netrexx.lang.Rexx('L'),new netrexx.lang.Rexx((byte)0)));
   }
  }/*n_*/
  
  return;
  }
 
 
 private RCBinaryDigits(){return;}
 }
