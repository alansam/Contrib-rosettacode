/* Generated from 'RCLoopsNplusHalf.nrx' 28 May 2026 21:50:08 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCLoopsNplusHalf{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(',');
 private static final java.lang.String $0="RCLoopsNplusHalf.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx rs;
  netrexx.lang.Rexx istart;
  netrexx.lang.Rexx iend;
  netrexx.lang.Rexx i_=null;
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say("Loops/N plus one half");
  
  rs=netrexx.lang.Rexx.toRexx("");
  istart=new netrexx.lang.Rexx((byte)1);
  iend=new netrexx.lang.Rexx((byte)10);
  {netrexx.lang.Rexx $1=iend;i_=istart.OpPlus(null);i_:for(;i_.OpLtEq(null,$1);i_=i_.OpAdd(null,new netrexx.lang.Rexx(1))){
   rs=rs.OpCc(null,i_.right(new netrexx.lang.Rexx((byte)3)));
   if (i_.OpLt(null,iend)) 
    {
     rs=rs.OpCc(null,$01);
    }
   }
  }/*i_*/
  netrexx.lang.RexxIO.Say(rs);
  return;}
 
 
 private RCLoopsNplusHalf(){return;}
 }
