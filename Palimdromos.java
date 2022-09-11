package palimdromos;
import java.util.Formatter;
public class Palimdromos {
public static void main(String[] args) {
        int i;
        int j;
        int cont = 0;
        Formatter fmt = new Formatter();
        Formatter fmtt = new Formatter();
        Formatter ftm = new Formatter();
        Formatter fm = new Formatter();
        Formatter ft = new Formatter();
        Formatter f = new Formatter();
        Formatter t = new Formatter();
        Formatter m = new Formatter();
         for(i=0;i<24;i++)
        {
            for(j=00;j<60;j++)
            {
                fmt.format("%02d",i,j);
                if(i==00&&j==00)
               {
                    System.out.println(fmt+":"+fmt);
                    cont ++;
               }
               if(i==01&&j==10)
               {
                   fmtt.format("%02d",i);
                   System.out.println(fmtt+":"+j);
                   cont ++;
               }
               if(i==02&&j==20)
               {
                   ftm.format("%02d",i);
                   System.out.println(ftm+":"+j);
                   cont ++;
               }
                if(i==03&&j==30)
               {
                   fm.format("%02d",i);
                   System.out.println(fm+":"+j);
                   cont ++;
               }
                 if(i==04&&j==40)
               {
                    ft.format("%02d",i);
                   System.out.println(ft+":"+j);
                   cont ++;
               }
                  if(i==05&&j==50)
               {
                    f.format("%02d",i);
                   System.out.println(f+":"+j);
                   cont ++;
               }
                   if(i==06&&j==60)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }            
                    if(i==10&&j==01)
               {
                    t.format("%02d",j);
                   System.out.println(i+":"+t);
                   cont ++;
               }
                     if(i==11&&j==11)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                      if(i==12&&j==21)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                       if(i==13&&j==31)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                        if(i==14&&j==41)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                         if(i==15&&j==51)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                          if(i==20&&j==02)
               {
                   m.format("%02d",j);
                   System.out.println(i+":"+m);
                   cont ++;
               }
                           if(i==21&&j==12)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                            if(i==22&&j==22)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
                             if(i==23&&j==32)
               {
                   System.out.println(i+":"+j);
                   cont ++;
               }
            }
        }
        System.out.println("El número total de palindromos es: " + cont);
    }
    
}
