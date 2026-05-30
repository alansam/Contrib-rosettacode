/* Generated from 'SystemTime.nrx' 28 May 2026 22:42:37 [v5.10] */
/* Options: Annotations Decimal Format Implicituses Java Logo Trace2 Verbose3 */
import java.text.SimpleDateFormat;


public class SystemTime{
 private static final java.lang.String $0="SystemTime.nrx";
 
 @SuppressWarnings("unchecked") 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say((new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS")).format(new java.util.Date()));
  return;}
 
 
 private SystemTime(){return;}
 }