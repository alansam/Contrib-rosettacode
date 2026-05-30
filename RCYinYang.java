/* Generated from 'RCYinYang.nrx' 28 May 2026 22:40:04 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */





public class RCYinYang{
 private static final java.lang.String $0="RCYinYang.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say("<?xml version=\'1.0\' encoding=\'UTF-8\' standalone=\'no\'?>");
  netrexx.lang.RexxIO.Say("<!DOCTYPE svg PUBLIC \'-//W3C//DTD SVG 1.1//EN\'");
  netrexx.lang.RexxIO.Say("  \'http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\'>");
  netrexx.lang.RexxIO.Say("<svg xmlns=\'http://www.w3.org/2000/svg\' version=\'1.1\'");
  netrexx.lang.RexxIO.Say("  xmlns:xlink=\'http://www.w3.org/1999/xlink\'");
  netrexx.lang.RexxIO.Say("  width=\'30\' height=\'30\'>");
  netrexx.lang.RexxIO.Say("  <defs><g id=\'y\'>");
  netrexx.lang.RexxIO.Say("    <circle cx=\'0\' cy=\'0\' r=\'200\' stroke=\'black\'");
  netrexx.lang.RexxIO.Say("      fill=\'white\' stroke-width=\'1\'/>");
  netrexx.lang.RexxIO.Say("    <path d=\'M0 -200 A 200 200 0 0 0 0 200");
  netrexx.lang.RexxIO.Say("      100 100 0 0 0 0 0 100 100 0 0 1 0 -200");
  netrexx.lang.RexxIO.Say("      z\' fill=\'black\'/>");
  netrexx.lang.RexxIO.Say("    <circle cx=\'0\' cy=\'100\' r=\'33\' fill=\'white\'/>");
  netrexx.lang.RexxIO.Say("    <circle cx=\'0\' cy=\'-100\' r=\'33\' fill=\'black\'/>");
  netrexx.lang.RexxIO.Say("  </g></defs>");
  
  netrexx.lang.RexxIO.Say(draw_yinyang(20,0.05D));
  netrexx.lang.RexxIO.Say(draw_yinyang(8,0.02D));
  
  netrexx.lang.RexxIO.Say("</svg>");
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 protected static java.lang.String draw_yinyang(int trans,double scale){
  java.lang.String yy;
  yy=java.lang.String.format("  <use xlink:href=\'#y\' transform=\'translate(%d,%d) scale(%g)\'/>",new java.lang.Object[]{(java.lang.Object)(java.lang.Integer.valueOf(trans)),(java.lang.Object)(java.lang.Integer.valueOf(trans)),(java.lang.Object)(java.lang.Double.valueOf(scale))});
  
  //       [Object Integer(trans), Integer(trans), Double(scale)]) -- TODO: Depricated
  return yy;
  }
 
 
 private RCYinYang(){return;}
 }
