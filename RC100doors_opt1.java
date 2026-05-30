/* Generated from 'RC100doors_opt1.nrx' 28 May 2026 20:16:55 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RC100doors_opt1{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("Door Nr.");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("is");
 private static final java.lang.String $0="RC100doors_opt1.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  boolean True;
  boolean False;
  boolean doors[];
  int i_=0;
  java.lang.String state=null;
  True=(1==1);
  False=(!True);
  
  doors=new boolean[100];
  
  {i_=0;i_:for(;i_<=9;i_++){
   doors[(((i_+1))*((i_+1)))-1]=True;
   }
  }/*i_*/
  
  {i_=0;i_:for(;i_<=99;i_++){
   if (doors[i_]) 
    state="open";
   else 
    state="closed";
   
   netrexx.lang.RexxIO.Say((($01.OpCcblank(null,(new netrexx.lang.Rexx(i_+1)).right(new netrexx.lang.Rexx((byte)4)))).OpCcblank(null,$02)).OpCcblank(null,netrexx.lang.Rexx.toRexx(state)));
   }
  }/*i_*/
  return;}
 
 
 private RC100doors_opt1(){return;}
 }
