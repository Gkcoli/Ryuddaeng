import java.lang.Math.*;
class App
{
	public static void main(String arg[])	
	{
            int x1,x2,y1,y2;
	    double dis;
	    x1=1;y1=7;x2=5;y2=9;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}

 
