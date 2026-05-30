/* Generated from 'PalindromeDetection.nrx' 28 May 2026 20:15:58 [v5.10] */
/* Options: Annotations Decimal Format Implicituses Java Logo Trace2 Verbose3 */


public class PalindromeDetection{
 private static final netrexx.lang.Rexx $01=netrexx.lang.Rexx.toRexx("string = ");
 private static final netrexx.lang.Rexx $02=new netrexx.lang.Rexx(0);
 private static final java.lang.String $0="PalindromeDetection.nrx";
 
 @SuppressWarnings("unchecked") 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx y;
  netrexx.lang.Rexx pal;
  y=netrexx.lang.Rexx.toRexx("In girum imus nocte et consumimur igni");
  netrexx.lang.RexxIO.Say("");
  netrexx.lang.RexxIO.Say($01.OpCc(null,y));
  netrexx.lang.RexxIO.Say("");
  pal=isPal(y);
  if (pal.OpEqS(null,$02)) 
   netrexx.lang.RexxIO.Say("The string isn\'t palindromic.");
  else 
   netrexx.lang.RexxIO.Say("The string is palindromic.");
  return;}
 
 
 @SuppressWarnings("unchecked") 
 
 public static netrexx.lang.Rexx isPal(netrexx.lang.Rexx x){
  x=x.upper().space(new netrexx.lang.Rexx((byte)0));
  return new netrexx.lang.Rexx(x.OpEqS(null,x.reverse()));
  }
 
 
 private PalindromeDetection(){return;}
 }