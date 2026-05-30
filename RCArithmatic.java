/* Generated from 'RCArithmatic.nrx' 28 May 2026 18:02:43 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCArithmatic{
 private static final char[] $01={1,10,2,0,1,0};
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx('+');
 private static final netrexx.lang.Rexx $03=new netrexx.lang.Rexx('=');
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx('-');
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('*');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx('/');
 private static final netrexx.lang.Rexx $07=netrexx.lang.Rexx.toRexx("remaining");
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx('^');
 private static final java.lang.String $0="RCArithmatic.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx a=null;
  netrexx.lang.Rexx b=null;
  netrexx.lang.RexxIO.Say("enter 2 integer values separated by blanks");
  {netrexx.lang.Rexx $1[]=new netrexx.lang.Rexx[2];
  netrexx.lang.RexxParse.parse(netrexx.lang.RexxIO.Ask(),$01,$1);
  a=$1[0];b=$1[1];}
  netrexx.lang.RexxIO.Say((((a.OpCcblank(null,$02)).OpCcblank(null,b)).OpCcblank(null,$03)).OpCcblank(null,a.OpAdd(null,b)));
  netrexx.lang.RexxIO.Say((((a.OpCcblank(null,$04)).OpCcblank(null,b)).OpCcblank(null,$03)).OpCcblank(null,a.OpSub(null,b)));
  netrexx.lang.RexxIO.Say((((a.OpCcblank(null,$05)).OpCcblank(null,b)).OpCcblank(null,$03)).OpCcblank(null,a.OpMult(null,b)));
  netrexx.lang.RexxIO.Say(((((((a.OpCcblank(null,$06)).OpCcblank(null,b)).OpCcblank(null,$03)).OpCcblank(null,a.OpDivI(null,b))).OpCcblank(null,$07)).OpCcblank(null,a.OpRem(null,b))).OpCcblank(null,netrexx.lang.Rexx.toRexx("(sign from first operand)")));
  netrexx.lang.RexxIO.Say((((a.OpCcblank(null,$08)).OpCcblank(null,b)).OpCcblank(null,$03)).OpCcblank(null,a.OpPow(null,b)));
  
  return;
  }
 
 
 private RCArithmatic(){return;}
 }
