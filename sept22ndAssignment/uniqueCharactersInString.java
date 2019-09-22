import java.util.*;
import java.lang.*;

class prog
{

public void unique(String ss)
{
    char[] s=ss.toCharArray();
    int n=s.length;
    
    int i,j,flag;
    
    for(i=0;i<n;i++)
    {
        flag=0;
        
        for(j=i-1;j>=0;j--)
        {
            if(s[i]==s[j])
            {
            flag++;
       
            }
        }
        if(flag==0)
        System.out.println(s[i]);
        
    }
}

}


public class uniuue
{
 public static void main (String[] args) {
        
    prog p=new prog();
    String s="erfefwewwee";
    p.unique(s);
    }
}
