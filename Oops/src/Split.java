public class Split
{  
public static void main(String args[])
{  
String s1="where is the good in goodbye";  
String[] words=s1.split("\\s");  
for(String w:words)
{  
System.out.println(w);  
}  
}
}  
