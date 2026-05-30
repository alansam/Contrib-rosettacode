/* Generated from 'LuhnTest.nrx' 28 May 2026 20:15:25 [v5.10] */
/* Options: Annotations Decimal Format Implicituses Java Logo Trace2 Verbose3 */


public class LuhnTest{
 private static final netrexx.lang.Rexx $01=new netrexx.lang.Rexx(0);
 private static final netrexx.lang.Rexx $02=netrexx.lang.Rexx.toRexx("passed");
 private static final netrexx.lang.Rexx $03=netrexx.lang.Rexx.toRexx("failed");
 private static final netrexx.lang.Rexx $04=new netrexx.lang.Rexx(2);
 private static final netrexx.lang.Rexx $05=new netrexx.lang.Rexx('0');
 private static final netrexx.lang.Rexx $06=new netrexx.lang.Rexx(1);
 private static final netrexx.lang.Rexx $07=new netrexx.lang.Rexx((byte)2);
 private static final netrexx.lang.Rexx $08=new netrexx.lang.Rexx(9);
 private static final netrexx.lang.Rexx $09=new netrexx.lang.Rexx(10);
 private static final java.lang.String $0="LuhnTest.nrx";
 
 @SuppressWarnings("unchecked") 
 
 public static void main(java.lang.String args[]){
  netrexx.lang.Rexx cc;
  netrexx.lang.Rexx k=null;
  netrexx.lang.Rexx r=null;
  cc=new netrexx.lang.Rexx((byte)0);
  cc.getnode(new netrexx.lang.Rexx((byte)1)).leaf=netrexx.lang.Rexx.toRexx("49927398716");
  cc.getnode(new netrexx.lang.Rexx((byte)2)).leaf=netrexx.lang.Rexx.toRexx("49927398717");
  cc.getnode(new netrexx.lang.Rexx((byte)3)).leaf=netrexx.lang.Rexx.toRexx("1234567812345678");
  cc.getnode(new netrexx.lang.Rexx((byte)4)).leaf=netrexx.lang.Rexx.toRexx("1234567812345670");
  {k=new netrexx.lang.Rexx((byte)1);k:for(;;k=k.OpAdd(null,new netrexx.lang.Rexx(1))){if(!(cc.getnode(k).leaf).OpNotEq(null,$01))break;
   r=checksum(cc.getnode(k).leaf);
   if (r.OpEqS(null,$01)) 
    netrexx.lang.RexxIO.Say((cc.getnode(k).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$02));
   else 
    netrexx.lang.RexxIO.Say((cc.getnode(k).leaf.right(new netrexx.lang.Rexx((byte)20))).OpCcblank(null,$03));
   }
  }/*k*/
  return;}
 
 
 @SuppressWarnings("unchecked") 
 
 public static netrexx.lang.Rexx checksum(netrexx.lang.Rexx t){
  netrexx.lang.Rexx s;
  netrexx.lang.Rexx j=null;
  netrexx.lang.Rexx q=null;
  if ((t.length()).OpRem(null,$04).toboolean()) 
   t=$05.OpCc(null,t);
  t=t.reverse();
  s=new netrexx.lang.Rexx((byte)0);
  {netrexx.lang.Rexx $1=(t.length()).OpSub(null,$06);netrexx.lang.Rexx $2=$07;j=new netrexx.lang.Rexx((byte)1);j:for(;j.OpLtEq(null,$1);j=j.OpAdd(null,$2)){
   q=$04.OpMult(null,t.substr(j.OpAdd(null,$06),new netrexx.lang.Rexx((byte)1)));
   if (q.OpGt(null,$08)) 
    q=(q.left(new netrexx.lang.Rexx((byte)1))).OpAdd(null,q.right(new netrexx.lang.Rexx((byte)1)));
   s=s.OpAdd(null,t.substr(j,new netrexx.lang.Rexx((byte)1))).OpAdd(null,q);
   }
  }/*j*/
  return new netrexx.lang.Rexx(s.OpRem(null,$09).OpNotEqS(null,$01));
  }
 
 
 private LuhnTest(){return;}
 }