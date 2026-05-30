/* Generated from 'ClassExample.nrx' 28 May 2026 20:00:53 [v5.10] */
/* Options: Annotations Decimal Format Implicituses Java Logo Trace2 Verbose3 */


public class ClassExample{
 private static final java.lang.String $0="ClassExample.nrx";
 /* properties private */
 private int foo;
 /* properties public */
 public boolean bar;
 /* properties indirect */
 private java.lang.String baz=new java.lang.String();
 
 @SuppressWarnings("unchecked") 
 
 public static void main(java.lang.String args[]){
  ClassExample clsex;
  clsex=new ClassExample();
  clsex.foo=42;
  clsex.baz="forty-two";
  clsex.bar=false;
  clsex.test(clsex.foo);
  clsex.test(clsex.bar);
  clsex.test(clsex.baz);
  return;}
 
 
 @SuppressWarnings("unchecked") 
 
 public void test(int s){
  netrexx.lang.Rexx aap;
  aap=new netrexx.lang.Rexx((byte)1);
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(s).OpCcblank(null,aap));
  return;}
 
 
 @SuppressWarnings("unchecked") 
 
 public void test(java.lang.String s){
  netrexx.lang.Rexx noot;
  noot=new netrexx.lang.Rexx((byte)2);
  netrexx.lang.RexxIO.Say(netrexx.lang.Rexx.toRexx(s).OpCcblank(null,noot));
  return;}
 
 
 @SuppressWarnings("unchecked") 
 
 public void test(boolean s){
  netrexx.lang.Rexx mies;
  mies=new netrexx.lang.Rexx((byte)3);
  netrexx.lang.RexxIO.Say(new netrexx.lang.Rexx(s).OpCcblank(null,mies));
  return;}
 
 
 public java.lang.String getBaz(){return baz;}
 
 public void setBaz(java.lang.String $1){baz=$1;return;}
 
 public ClassExample(){return;}
 }