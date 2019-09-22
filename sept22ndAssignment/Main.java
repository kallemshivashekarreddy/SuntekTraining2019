
public class Main
{
	public static void main(String[] args) {
	int n,a[]={1,2,-2,-4,4,6,-9,53,-110,42,25};
	n=a.length;
	albert l=new albert();
System.out.println(l.geton(a,n));
	}
}
class albert
{
    
static  int  geton(int a[],int n)
    {
        int prev=0,aft=0;
        for(int i=0;i<n;i++)
        {
            
        aft=aft+a[i];
        if(prev<aft)
        {
            prev=aft;
            
        }
        if(aft<0)
        {
            aft=0;
        }
        
       }
       return prev;
    
}

}
