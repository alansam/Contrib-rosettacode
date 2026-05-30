/* Generated from 'RCSortingStrandsort.nrx' 28 May 2026 22:21:35 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */
import java.util.List;

/* NetRexx */






public class RCSortingStrandsort{
 private static final java.lang.String $0="RCSortingStrandsort.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  
  lists=new java.lang.String[][]{placesList,strandSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)))};
  
  
  
  
  {int $1=lists.length-1;ln=0;ln:for(;ln<=$1;ln++){
   cl=lists[ln];
   {int $2=cl.length-1;ct=0;ct:for(;ct<=$2;ct++){
    netrexx.lang.RexxIO.Say(cl[ct]);
    }
   }/*ct*/
   netrexx.lang.RexxIO.Say("");
   }
  }/*ln*/
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.lang.String[] strandSort(java.lang.String A[]){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[A.length];
  al=(java.util.List)(strandSort(java.util.Arrays.asList((java.lang.Object[])A)));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.util.ArrayList strandSort(java.util.List Alst){
  java.util.ArrayList A;
  java.util.ArrayList result;
  java.util.ArrayList sublist=null;
  int i_=0;
  
  A=new java.util.ArrayList((java.util.Collection)Alst);
  result=new java.util.ArrayList();
  {A_:for(;;){if(!((A.size())>0))break;
   sublist=new java.util.ArrayList();
   sublist.add(A.get(0));
   A.remove(0);
   {i_=0;i_:for(;;i_++){if(!(i_<((A.size())-1)))break;
    if ((((java.lang.Comparable)(A.get(i_))).compareTo((java.lang.Object)((java.lang.Comparable)(sublist.get((sublist.size())-1)))))>0) 
     {
      sublist.add(A.get(i_));
      A.remove(i_);
     }
    }
   }/*i_*/
   result=merge((java.util.List)result,(java.util.List)sublist);
   }
  }/*A_*/
  
  return result;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.util.ArrayList merge(java.util.List left,java.util.List right){
  java.util.ArrayList result;
  
  result=new java.util.ArrayList();
  {mx:for(;;){if(!(((left.size())>0)&((right.size())>0)))break;
   if ((((java.lang.Comparable)(left.get(0))).compareTo((java.lang.Object)((java.lang.Comparable)(right.get(0)))))<=0) 
    {
     result.add(left.get(0));
     left.remove(0);
    }
   else 
    {
     result.add(right.get(0));
     right.remove(0);
    }
   }
  }/*mx*/
  if ((left.size())>0) 
   {
    result.addAll((java.util.Collection)left);
   }
  if ((right.size())>0) 
   {
    result.addAll((java.util.Collection)right);
   }
  
  return result;
  }
 
 
 private RCSortingStrandsort(){return;}
 }
