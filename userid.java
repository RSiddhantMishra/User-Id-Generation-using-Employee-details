import java.io.*;
import java.util.*;
class userid
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String fn=s.next();
        String ln=s.next();
        int pin=s.nextInt();
        int n=s.nextInt();
        int flen=fn.length();
        int lalen=ln.length();
        String[] mix={fn,ln};
        Arrays.sort(mix);
        String str,str1="";
        if(flen<lalen)
        {
            str=fn.substring(flen-1,flen);
            str1+=str+""+ln;
        }
        else if(lalen<flen)
        {
            str=ln.substring(lalen-1,lalen);
            str1+=str+""+fn;
        }
        else if(flen==lalen)
        {
            str=mix[0].substring(flen-1,flen);
            str1+=str+""+mix[1];
        }
        String num1=String.valueOf(pin);
        int len=num1.length();
        String num2=num1.substring(n-1,n);
        String num3=num1.substring(len-n,len-n+1);
        char a[]=str1.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>='A' && a[i]<='Z')
            {
                a[i]=(char)((int)a[i]+32);
            }
            else if(a[i]>='a' && a[i]<='z')
            {
                a[i]=(char)((int)a[i]-32);
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        System.out.print(num2+""+num3);
    }
}

