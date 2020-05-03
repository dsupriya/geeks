class GfG
{
    long thirdLargest(Long a[])
    {
	// Your code here
	   // java.util.Arrays.sort(a);
	    if(a.length<3)
	        return -1;
	    //return (a[a.length-3]);
	    long f=0;
	    long s = 0;
	    long t= 0;
	    for(int i=0;i<a.length;i++)
	    {
	        if(a[i]>f)
	        {
	            t=s;
	            s=f;
	            f=a[i];
	        }
	        else if(a[i]>s)
	        {
	            t=s;
	            s=a[i];
	        }
	        else if(a[i]>t)
	        {
	            t=a[i];
	        }
	    }
	    return t;
    }
}
