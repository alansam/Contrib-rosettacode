/* Generated from 'RCPolymorphicCopy.nrx' 28 May 2026 22:07:47 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */

/* NetRexx */


// -----------------------------------------------------------------------------


public class RCPolymorphicCopy{
 private static final java.lang.String $0="RCPolymorphicCopy.nrx";

 
 
 @SuppressWarnings("unchecked") 
 public static RCPolymorphicCopy.T copier(RCPolymorphicCopy.T x){
  return x.copy();
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final void main(java.lang.String args[]){
  RCPolymorphicCopy.T obj1;
  RCPolymorphicCopy.S obj2;
  obj1=new RCPolymorphicCopy.T();
  obj2=new RCPolymorphicCopy.S();
  java.lang.System.out.println(copier(obj1).name()); // prints "T"
  java.lang.System.out.println(copier((RCPolymorphicCopy.T)obj2).name()); // prints "S"
  return;
  }
  // -----------------------------------------------------------------------------
 
 
 private RCPolymorphicCopy(){return;}
 
 
 public static class T implements java.lang.Cloneable{
  private final transient java.lang.String $0="RCPolymorphicCopy.nrx";

  
  @SuppressWarnings("unchecked") 
  public java.lang.String name(){
   return RCPolymorphicCopy.T.class.getSimpleName();
   }
  
  
  @SuppressWarnings("unchecked") 
  public RCPolymorphicCopy.T copy(){
   RCPolymorphicCopy.T dup=null;
   java.lang.CloneNotSupportedException ex=null;
  
  
   {try{
    dup=(RCPolymorphicCopy.T)(super.clone());
   }
   catch (java.lang.CloneNotSupportedException $1){ex=$1;
    ex.printStackTrace();
   }}
  
   return dup;
   }
  // -----------------------------------------------------------------------------
  
  
  public T(){return;}
  }
 
 
 public static class S extends RCPolymorphicCopy.T{
  private final transient java.lang.String $0="RCPolymorphicCopy.nrx";

  
  @SuppressWarnings("unchecked") 
  public java.lang.String name(){
   return RCPolymorphicCopy.S.class.getSimpleName();
   }
  
  
  public S(){return;}
 }}
