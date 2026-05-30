/* Generated from 'RCFormattedNumericOutput.nrx' 28 May 2026 20:58:43 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Strictcase Symbols Trace2 Verbose3 */
import java.text.MessageFormat;

/* NetRexx */







public class RCFormattedNumericOutput{
 private static final java.lang.String $0="RCFormattedNumericOutput.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  double sevenPointOneTwoFive;
  sevenPointOneTwoFive=(double)7.125D;
  
  // using NetRexx Built-In Functions (BIFs)
  netrexx.lang.RexxIO.Say((new netrexx.lang.Rexx(sevenPointOneTwoFive)).format(new netrexx.lang.Rexx((byte)5),new netrexx.lang.Rexx((byte)3)).changestr(new netrexx.lang.Rexx(' '),new netrexx.lang.Rexx('0')));
  
  // using Java library constructs
  //System.out.printf('%09.3f\n', [Double(sevenPointOneTwoFive)]) -- TODO: Depricated
  java.lang.System.out.printf("%09.3f\n",(java.lang.Object[])(new java.lang.Double[]{java.lang.Double.valueOf(sevenPointOneTwoFive)}));
  //say MessageFormat.format('{0,number,#00000.###}', [Double(sevenPointOneTwoFive)]) -- TODO: Depricated
  netrexx.lang.RexxIO.Say(MessageFormat.format("{0,number,#00000.###}",(java.lang.Object[])(new java.lang.Double[]{java.lang.Double.valueOf(sevenPointOneTwoFive)})));
  
  return;
  }
 
 
 private RCFormattedNumericOutput(){return;}
 }
