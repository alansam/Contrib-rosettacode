/* Generated from 'RCZigZag.nrx' 28 May 2026 22:42:00 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCZigZag{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCZigZag.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  zigzag(new netrexx.lang.Rexx((byte)5));
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static void zigzag(netrexx.lang.Rexx msize){
  int row;
  int col;
  netrexx.lang.Rexx ziggy;
  int j_=0;
  netrexx.lang.Rexx L;
  java.lang.String rowOut=null;
  
  row=1;
  col=1;
  
  ziggy=new netrexx.lang.Rexx((byte)0);
  {int $1=msize.OpMult(null,msize).OpPlus(null).toint();j_=0;j_:for(;$1>0;$1--,j_++){
   ziggy.getnode(new netrexx.lang.Rexx(row)).leaf.getnode(new netrexx.lang.Rexx(col)).leaf=new netrexx.lang.Rexx(j_);
   if ((((row+col))%2)==0) 
    {
     if (new netrexx.lang.Rexx(col).OpLt(null,msize)) 
      col++;
     else 
      row=row+2;
     if (row!=1) 
      row--;
    }
   else 
    {
     if (new netrexx.lang.Rexx(row).OpLt(null,msize)) 
      row++;
     else 
      col=col+2;
     if (col!=1) 
      col--;
    }
   }
  }/*j_*/
  
  L=(msize.OpMult(null,msize).OpSub(null,$01)).length();/*for a constant element width.  */
  {int $2=msize.OpPlus(null).toint();row=1;row:for(;$2>0;$2--,row++){/*show all the matrix's rows.    */
   rowOut="";
   {int $3=msize.OpPlus(null).toint();col=1;col:for(;$3>0;$3--,col++){
    rowOut=netrexx.lang.Rexx.toString(netrexx.lang.Rexx.toRexx(rowOut).OpCcblank(null,ziggy.getnode(new netrexx.lang.Rexx(row)).leaf.getnode(new netrexx.lang.Rexx(col)).leaf.right(L)));
    }
   }/*col*/
   netrexx.lang.RexxIO.Say(rowOut);
   }
  }/*row*/
  
  return;
  }
 
 
 private RCZigZag(){return;}
 }
