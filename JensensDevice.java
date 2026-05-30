/* Generated from 'JensensDevice.nrx' 28 May 2026 20:05:32 [v5.10] */
/* Options: Annotations Decimal Format Implicituses Java Logo Trace2 Verbose3 */


public class JensensDevice{
 private static final java.lang.String $0="JensensDevice.nrx";
 /* properties static */
 protected static org.netrexx.process.NetRexxA interpreter;
 protected static netrexx.lang.Rexx exp=netrexx.lang.Rexx.toRexx("");
 protected static java.lang.reflect.Method termMethod;
 
 @SuppressWarnings("unchecked") 
 
 public static void main(java.lang.String x[]) throws java.io.IOException,java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
  netrexx.lang.RexxIO.Say(sum(new netrexx.lang.Rexx('i'),new netrexx.lang.Rexx((byte)1),new netrexx.lang.Rexx((byte)100),netrexx.lang.Rexx.toRexx("1/i")));
  return;}
 
 
 @SuppressWarnings("unchecked") 
 
 public static netrexx.lang.Rexx sum(netrexx.lang.Rexx i,netrexx.lang.Rexx lo,netrexx.lang.Rexx hi,netrexx.lang.Rexx term) throws java.io.IOException,java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
  netrexx.lang.Rexx sum;
  netrexx.lang.Rexx iv=null;
  sum=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $1=hi;iv=lo.OpPlus(null);iv:for(;iv.OpLtEq(null,$1);iv=iv.OpAdd(null,new netrexx.lang.Rexx(1))){
   sum=sum.OpAdd(null,termeval(i,iv,term));
   }
  }/*iv*/
  return sum;
  }
 
 
 @SuppressWarnings("unchecked") 
 
 public static netrexx.lang.Rexx termeval(netrexx.lang.Rexx i,netrexx.lang.Rexx iv,netrexx.lang.Rexx e) throws java.io.IOException,java.lang.NoSuchMethodException,java.lang.IllegalAccessException,java.lang.reflect.InvocationTargetException{
  netrexx.lang.Rexx termpgm=null;
  java.io.FileWriter fw=null;
  java.lang.Class termClass=null;
  java.lang.Class classes[]=null;
  if (e.OpNotEq(null,exp)) 
   interpreter=(org.netrexx.process.NetRexxA)null;
  exp=e;
  if (interpreter==null) 
   {
    termpgm=((netrexx.lang.Rexx.toRexx("method term(").OpCc(null,i)).OpCc(null,netrexx.lang.Rexx.toRexx("=Rexx) static returns rexx;return"))).OpCcblank(null,e);
    fw=new java.io.FileWriter("termpgm.nrx");
    fw.write(netrexx.lang.Rexx.tochararray(termpgm),0,(termpgm.length()).toint());
    fw.close();
    interpreter=new org.netrexx.process.NetRexxA();
    interpreter.parse(new java.lang.String[]{"termpgm.nrx"},new java.lang.String[]{"nocrossref"});
    termClass=interpreter.getClassObject((java.lang.String)null,"termpgm");
    classes=new java.lang.Class[]{interpreter.getClassObject("netrexx.lang","Rexx",0)};
    termMethod=termClass.getMethod("term",classes);
   }
  return (netrexx.lang.Rexx)(termMethod.invoke((java.lang.Object)null,(java.lang.Object[])(new netrexx.lang.Rexx[]{iv})));
  }
 
 
 private JensensDevice(){return;}
 }