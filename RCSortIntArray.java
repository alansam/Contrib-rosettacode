/* Generated from 'RCSortIntArray.nrx' 28 May 2026 22:12:06 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCSortIntArray{
 private static final java.lang.String $0="RCSortIntArray.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  int ia[]=null;
  ia=new int[]{2,4,3,1,2,-1,0,-2};
  
  display(ia);
  java.util.Arrays.sort(ia);
  display(ia);
  return;}
  // Display results
 
 
 @SuppressWarnings("unchecked") 
 public static void display(int in[]){
  netrexx.lang.Rexx sorted;
  int ix=0;
  
  sorted=new netrexx.lang.Rexx("");
  
  {int $1=in.length;ix=0;ix:for(;$1>0;$1--,ix++){
   sorted=sorted.OpCc(null,(new netrexx.lang.Rexx(in[ix])).right(new netrexx.lang.Rexx((byte)4)));
   }
  }/*ix*/
  
  netrexx.lang.RexxIO.Say(sorted.strip(new netrexx.lang.Rexx('t')));
  
  return;
  }
 
 
 private RCSortIntArray(){return;}
 }
