/* Generated from 'DateFormat.nrx' 28 May 2026 20:03:03 [v5.10] */
/* Options: Annotations Decimal Format Implicituses Java Logo Trace2 Verbose3 */
import java.text.SimpleDateFormat;


public class DateFormat{
 private static final java.lang.String $0="DateFormat.nrx";
 
 @SuppressWarnings("unchecked") 
 
 public static void main(java.lang.String $0s[]){
  netrexx.lang.RexxIO.Say((new SimpleDateFormat("yyyy-MM-dd")).format(new java.util.Date()));
  netrexx.lang.RexxIO.Say((new SimpleDateFormat("EEEE, MMMM dd, yyyy")).format(new java.util.Date()));
  return;}
 
 
 private DateFormat(){return;}
 }