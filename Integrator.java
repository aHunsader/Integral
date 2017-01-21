

public class Integrator
{
    
    private double x;
    private String eq;
    private double y;
    private double dx;
    public Integrator(String eq11, double xval1, double yval1, double dxval)
    {
        
       eq = eq11;
       x = xval1;
       y = yval1;
       dx = dxval;
       
       
    }
    
       

    public double integrate(Integrator integral)
    {
        int baseten = 0;
       int baseEnd=0;
       boolean answer = true;
        
            if (eq == null || eq.isEmpty()) {
        answer = false;
    }
    int i = 0;
    if (eq.charAt(0) == '-') {
        if (eq.length() > 1) {
            i++;
        } else {
            answer = false;
        }
    }
    for (; i < eq.length(); i++) {
        if (!Character.isDigit(eq.charAt(i))) {
             answer = false;
        }
    }
    
       if(answer == true)
       {
           float k = ((float)y-(float)x)*(float)Double.parseDouble(eq);
           return k;
        }
       else if (eq.contains(")^"))
       {
       if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
    else 
    {
        baseEnd =1;
    }

    double k = 0;
    double total= 0;
       while (x<=y)
       {
           double ab = integral.getValue(x);
           x +=dx;
           double a = (int)eq.charAt(eq.length()-1)-48;
           k = Math.pow(ab, a)*dx;
           total += k;
        }
            return total;
        }
     else if (eq.contains("x^("))
       {
       if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
    else 
    {
        baseEnd =1;
    }

    double k = 0;
    double total= 0;
       while (x<=y)
       {
           double ab = integral.getValue(x);
           x +=dx;
           
           k = Math.pow(x, ab)*dx;
           total += k;
        }
            return total;
        }
        
        else if (eq.contains("sin("))
        {
            if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
        else
        {
            baseEnd = 1;
        }
         double k = 0;
        double total = 0;
       while (x<y)
       {
           double ab = integral.getValue(x);
           k = (double)baseEnd*Math.sin(ab)*dx;
           x+=dx;
           total += k;
        
        }
        return total;
      
    }
     else if (eq.contains("tan("))
        {
            if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
        else
        {
            baseEnd = 1;
        }
         double k = 0;
        double total = 0;
       while (x<y)
       {
           double ab = integral.getValue(x);
           k = (double)baseEnd*Math.tan(ab)*dx;
           x+=dx;
           total += k;
        
        }
        return total;
      
    }
     else if (eq.contains("cos("))
        {
            
            if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
        else
        {
            baseEnd = 1;
        }
        double k = 0;
        double total = 0;
       while (x<y)
       {
           double ab = integral.getValue(x);
           k = (double)baseEnd*Math.cos(ab)*dx;
           x+=dx;
           total += k;
        
        }
        return total;
      
    }
    else if (eq.contains("ln"))
        {
            if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
        else
        {
            baseEnd = 1;
        }
         double k = 0;
        double total = 0;
       while (x<y)
       {
           double ab = integral.getValue(x);
           k = (double)baseEnd*Math.log(ab)*dx;
           x+=dx;
           total += k;
        
        }
        return total;
      
    }
    else if (eq.contains("log"))
        {
            if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
    
        else
        {
            baseEnd = 1;
        }
         double k = 0;
        double total = 0;
       while (x<y)
       {
           double ab = integral.getValue(x);
           k = (double)baseEnd*((Math.log(ab))/(Math.log(10)))*dx;
           x+=dx;
           total += k;
        
        }
        return total;
    }
    
    else if(eq.contains("^("))
    {
        if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
    
        else
        {
            baseEnd = 1;
        }
        double k = 0;
        double total = 0;
       while (x<y)
       {
           double ab = integral.getValue(x); 
           x +=dx;
           k = Math.pow(baseEnd, ab)*dx;
           total += k;
        }
        return total;
    }
        else if(eq.substring(eq.length()-1, eq.length()).contains("x"))
        
    {
        if (Character.isDigit(eq.charAt(0)))
       {
       for (int n = 0; n<eq.length(); n++)
       {
           char c = eq.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(eq.charAt(n+1)))
           {
               n = n;
            
            
            }
            else
            {
                baseEnd = baseten;
                break;
            }   
        }
    }
    
        else
        {
            baseEnd = 1;
        }
        float k = (float)baseEnd*((float)y+(float)x)*(float).5;
       
        return k;
    }
        else
        {
            return 0;
        }

     
}
public double getValue(double val)
{
    int baseten = 0;
    int baseEnd = 0;
    double value = 0;
    String substring = eq.substring(eq.indexOf("(")+1, eq.indexOf(")"));
    
    if (substring.contains("tan"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        value = (double)baseten*Math.tan(val);
}
else if (substring.contains("sin"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        value = (double)baseten*Math.sin(val);
}
else if (substring.contains("cos"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        value = (double)baseten*Math.cos(val);
}
else if (substring.contains("log"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        value = (double)baseten*((Math.log(val))/(Math.log(10)));
}
else if (substring.contains("ln"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        value = (double)baseten*Math.log(val);
}

else if (substring.equals("x"))
{
    value =x;
}
else if (substring.contains("x^"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        double a = (double)substring.charAt(substring.length()-1)-48;
        if( a == 72)
        {
            a = x;
        }
        value = (double)baseten*Math.pow(x, a);
}
else if (substring.contains("^"))
        {
            if (Character.isDigit(substring.charAt(0)))
       {
       for (int n = 0; n<substring.length(); n++)
       {
           char c = substring.charAt(n);
              baseten = ((int)(c)-48) + baseten *10;
               // System.out.println(baseten);
           if (Character.isDigit(substring.charAt(n+1)))
           {
               n = n;
            }
            else
            {
            baseEnd = baseten;
            break;
            }
        }
    }
        else
        {
            baseten = 1;
        }
        
        value = Math.pow(baseten, x);
       
}
return value;
}
}
