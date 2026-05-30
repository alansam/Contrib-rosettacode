/* Generated from 'RCSortingHeapsort.nrx' 28 May 2026 22:17:59 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */
import java.util.List;

/* NetRexx */






public class RCSortingHeapsort{
 private static final java.lang.String $0="RCSortingHeapsort.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String placesList[];
  java.lang.String lists[][];
  int ln=0;
  java.lang.String cl[]=null;
  int ct=0;
  placesList=new java.lang.String[]{"UK  London","US  New York","US  Boston","US  Washington","UK  Washington","US  Birmingham","UK  Birmingham","UK  Boston"};
  
  
  
  
  lists=new java.lang.String[][]{placesList,heapSort((java.lang.String[])(java.util.Arrays.copyOf((java.lang.Object[])placesList,placesList.length)))};
  
  
  
  
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
 public static final java.lang.String[] heapSort(java.lang.String a[]){
  return heapSort(a,a.length);
  }
 public static final java.lang.String[] heapSort(java.lang.String a[],int count){
  java.lang.String rl[];
  java.util.List al;
  
  
  rl=new java.lang.String[a.length];
  al=(java.util.List)(heapSort(java.util.Arrays.asList((java.lang.Object[])a),count));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.util.ArrayList heapSort(java.util.List a){
  return heapSort(a,a.size());
  }
 public static final java.util.ArrayList heapSort(java.util.List a,int count){
  int iend;
  java.lang.Object swap=null;
  
  a=heapify(a,count);
  
  iend=count-1;
  {iend:for(;;){if(!(iend>0))break;
   swap=a.get(0);
   a.set(0,a.get(iend));
   a.set(iend,swap);
   a=siftDown(a,0,iend-1);
   iend--;
   }
  }/*iend*/
  
  return new java.util.ArrayList((java.util.Collection)a);
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.util.List heapify(java.util.List a,int count){
  int start;
  
  start=((count-2))/2;
  
  {strt:for(;;){if(!(start>=0))break;
   a=siftDown(a,start,count-1);
   start--;
   }
  }/*strt*/
  
  return a;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.util.List siftDown(java.util.List a,int istart,int iend){
  int root;
  int child=0;
  java.lang.Object swap=null;
  
  root=istart;
  
  {root:for(;;){if(!(((root*2)+1)<=iend))break;
   child=(root*2)+1;
   if ((child+1)<=iend) 
    {
     if ((((java.lang.Comparable)(a.get(child))).compareTo((java.lang.Object)((java.lang.Comparable)(a.get(child+1)))))<0) 
      {
       child++;
      }
    }
   if ((((java.lang.Comparable)(a.get(root))).compareTo((java.lang.Object)((java.lang.Comparable)(a.get(child)))))<0) 
    {
     swap=a.get(root);
     a.set(root,a.get(child));
     a.set(child,swap);
     root=child;
    }
   else 
    {
     break root;
    }
   }
  }/*root*/
  
  return a;
  }
 
 
 private RCSortingHeapsort(){return;}
 }
