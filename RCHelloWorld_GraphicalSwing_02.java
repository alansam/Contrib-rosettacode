/* Generated from 'RCHelloWorld_GraphicalSwing_02.nrx' 28 May 2026 21:30:15 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */






public class RCHelloWorld_GraphicalSwing_02{
 private static final java.lang.String $0="RCHelloWorld_GraphicalSwing_02.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  java.lang.String msgText;
  javax.swing.JFrame window;
  javax.swing.JTextArea text;
  java.awt.Dimension minSize;
  msgText="Goodbye, World!";
  
  window=new javax.swing.JFrame(msgText);
  text=new javax.swing.JTextArea();
  minSize=new java.awt.Dimension(200,100);
  
  text.setText(msgText);
  
  window.setLayout((java.awt.LayoutManager)(new java.awt.FlowLayout()));
  window.add((java.awt.Component)text);
  window.setMinimumSize(minSize);
  window.pack();
  window.setVisible(isTrue());
  window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static boolean isTrue(){
  return 1==1;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static boolean isFalse(){
  return (!(isTrue()));
  }
 
 
 private RCHelloWorld_GraphicalSwing_02(){return;}
 }
