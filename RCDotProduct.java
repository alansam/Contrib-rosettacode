/* Generated from 'RCDotProduct.nrx' 28 May 2026 20:48:28 [v5.10] */
/* Options: Annotations Binary Comments Decimal Format Implicituses Java Logo Replace Symbols Trace2 Verbose3 */

/* NetRexx */




public class RCDotProduct{
 private static final java.lang.String $0="RCDotProduct.nrx";
 
 @SuppressWarnings("unchecked") 
 public static void main(java.lang.String $0s[]){
  double whatsTheVectorVictor[][];
  netrexx.lang.Rexx dotProduct;
  whatsTheVectorVictor=new double[][]{new double[]{(double)1.0D,3.0D,-5.0D},new double[]{(double)4.0D,-2.0D,-1.0D}};
  dotProduct=new netrexx.lang.Rexx(dotProduct(whatsTheVectorVictor));
  netrexx.lang.RexxIO.Say(dotProduct.format((netrexx.lang.Rexx)null,new netrexx.lang.Rexx((byte)2)));
  
  return;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final double dotProduct(double vec1[],double vec2[]) throws java.lang.IllegalArgumentException{
  double scalarProduct;
  int e_=0;
  if (vec1.length!=vec2.length) 
   throw new java.lang.IllegalArgumentException("Vectors must be the same length");
  
  scalarProduct=(double)0.0D;
  {int $1=vec1.length-1;e_=0;e_:for(;e_<=$1;e_++){
   scalarProduct=(vec1[e_]*vec2[e_])+scalarProduct;
   }
  }/*e_*/
  
  return scalarProduct;
  }
 
 
 @SuppressWarnings("unchecked") 
 public static final double dotProduct(double vecs[][]) throws java.lang.IllegalArgumentException{
  return dotProduct(vecs[0],vecs[1]);
  }
 
 
 private RCDotProduct(){return;}
 }
