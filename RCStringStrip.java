/* Generated from 'RCStringStrip.nrx' 28 May 2026 22:24:19 [v5.10] */
/* Options: Annotations Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCStringStrip{
 private static final java.lang.String $0="RCStringStrip.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say(stripchars(netrexx.lang.Rexx.toRexx("She was a soul stripper. She took my heart!"),netrexx.lang.Rexx.toRexx("aei")));
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static netrexx.lang.Rexx stripchars(netrexx.lang.Rexx haystack,netrexx.lang.Rexx chs){
  netrexx.lang.Rexx c_=null;
  netrexx.lang.Rexx needle=null;
  
  {netrexx.lang.Rexx $1=chs.length();c_=new netrexx.lang.Rexx((byte)1);c_:for(;c_.OpLtEq(null,$1);c_=c_.OpAdd(null,new netrexx.lang.Rexx(1))){
   needle=chs.substr(c_,new netrexx.lang.Rexx((byte)1));
   haystack=haystack.changestr(needle,netrexx.lang.Rexx.toRexx(""));
   }
  }/*c_*/
  
  return haystack;
  }
 
 
 private RCStringStrip(){return;}
 }
