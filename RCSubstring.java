/* Generated from 'RCSubstring.nrx' 28 May 2026 22:32:32 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCSubstring{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(1);
 private static final java.lang.String $0="RCSubstring.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx n;
  netrexx.lang.Rexx m;
  s=netrexx.lang.Rexx.toRexx("abcdefghijk");
  n=new netrexx.lang.Rexx((byte)4);
  m=new netrexx.lang.Rexx((byte)3);
  
  netrexx.lang.RexxIO.Say(s);
  netrexx.lang.RexxIO.Say(s.substr(n,m));
  netrexx.lang.RexxIO.Say(s.substr(n));
  netrexx.lang.RexxIO.Say(s.substr(new netrexx.lang.Rexx((byte)1),(s.length()).OpSub(null,$01)));
  netrexx.lang.RexxIO.Say(s.substr(s.pos(netrexx.lang.Rexx.toRexx("def")),m));
  netrexx.lang.RexxIO.Say(s.substr(s.pos(new netrexx.lang.Rexx('g')),m));
  
  return;
  }
 
 
 private RCSubstring(){return;}
 }
