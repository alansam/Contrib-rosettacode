/* Generated from 'RCFunctionDefinition.nrx' 28 May 2026 21:01:47 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCFunctionDefinition{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("sq. yds");
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("metres");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("m radius:");
 private static final netrexx.lang.Rexx $04=netrexx.lang.Rexx.toRexx("m**2");
 private static final java.lang.String $0="RCFunctionDefinition.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx pi;
  int radiusY;
  int in2ft;
  int ft2yds;
  float in2mm;
  float mm2m;
  netrexx.lang.Rexx radiusM;
  pi=new netrexx.lang.Rexx("3.14159265358979323846264338327950");
  radiusY=10;
  in2ft=12;
  ft2yds=3;
  in2mm=25.4F;
  mm2m=((float)1)/((float)1000);
  radiusM=multiply(multiply(new netrexx.lang.Rexx(radiusY),multiply(multiply(new netrexx.lang.Rexx(ft2yds),new netrexx.lang.Rexx(in2ft)),new netrexx.lang.Rexx(in2mm))),new netrexx.lang.Rexx(mm2m));
  
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx("Area of a circle"+" "+radiusY+" "+"yds radius: ").OpCcblank(null,multiply(multiply(new netrexx.lang.Rexx(radiusY),new netrexx.lang.Rexx(radiusY)),pi).format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCcblank(null,$01));
  netrexx.lang.RexxIO.Say((netrexx.lang.Rexx.toRexx(java.lang.String.valueOf(radiusY)+" "+"yds =").OpCcblank(null,radiusM.format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCcblank(null,$02));
  netrexx.lang.RexxIO.Say((((netrexx.lang.Rexx.toRexx("Area of a circle").OpCcblank(null,radiusM.format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$03)).OpCcblank(null,multiply(multiply(radiusM,radiusM),pi).format(new netrexx.lang.Rexx((byte)3),new netrexx.lang.Rexx((byte)3)))).OpCc(null,$04));
  return;}
  
  /**
   * Multiplication function
   */
 
 
 @SuppressWarnings("unchecked") 
 public static netrexx.lang.Rexx multiply(netrexx.lang.Rexx multiplicand,netrexx.lang.Rexx multiplier){
  netrexx.lang.Rexx product;
  
  product=multiplicand.OpMult(null,multiplier);
  return product;
  }
 
 
 private RCFunctionDefinition(){return;}
 }
