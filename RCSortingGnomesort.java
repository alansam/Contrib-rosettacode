/* Generated from 'RCSortingGnomesort.nrx' 28 May 2026 22:16:49 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */
import java.util.List;

/* NetRexx */






public class RCSortingGnomesort{
 private static final java.lang.String $0="RCSortingGnomesort.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.util.ArrayList i1;
  i1=new java.util.ArrayList((java.util.Collection)(java.util.Arrays.asList((java.lang.Object[])(new java.lang.Integer[]{new java.lang.Integer(3),new java.lang.Integer(3),new java.lang.Integer(1),new java.lang.Integer(2),new java.lang.Integer(4),new java.lang.Integer(3),new java.lang.Integer(5),new java.lang.Integer(6)}))));
  netrexx.lang.RexxIO.Say(i1.toString());
  netrexx.lang.RexxIO.Say(gnomeSort((java.util.List)i1).toString());
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final boolean isTrue(){
  return 1==1;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final boolean isFalse(){
  return (!(isTrue()));
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.lang.String[] gnomeSort(java.lang.String a[]){
  return gnomeSort(a,isTrue());
  }
 public static final java.lang.String[] gnomeSort(java.lang.String a[],boolean sAsc){
  java.lang.String rl[];
  java.util.List al;
  
  rl=new java.lang.String[a.length];
  al=(java.util.List)(gnomeSort(java.util.Arrays.asList((java.lang.Object[])a),sAsc));
  al.toArray((java.lang.Object[])rl);
  
  return rl;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final java.util.ArrayList gnomeSort(java.util.List a){
  return gnomeSort(a,isTrue());
  }
 public static final java.util.ArrayList gnomeSort(java.util.List a,boolean sAsc){
  boolean sDsc;
  java.util.ArrayList ra;
  int i_;
  int j_;
  int ctx=0;
  java.lang.Object swap=null;
  
  sDsc=(!sAsc); // Ascending/descending switches
  ra=new java.util.ArrayList((java.util.Collection)a);
  i_=1;
  j_=2;
  {i_:for(;;){if(!(i_<(ra.size())))break;
   ctx=((java.lang.Comparable)(ra.get(i_-1))).compareTo((java.lang.Object)((java.lang.Comparable)(ra.get(i_))));
   if (((sAsc&(ctx<=0)))|((sDsc&(ctx>=0)))) 
    {
     i_=j_;
     j_++;
    }
   else 
    {
     swap=ra.get(i_);
     ra.set(i_,ra.get(i_-1));
     ra.set(i_-1,swap);
     i_--;
     if (i_==0) 
      {
       i_=j_;
       j_++;
      }
    }
   }
  }/*i_*/
  
  return ra;
  }
 
 
 private RCSortingGnomesort(){return;}
 }
