/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author Adi Venkatesh
 */
public class Fraction {
    int num;
    int den;
    
    
    public Fraction(int n, int d){
        num = n;
        den = d;
    }
    
    public double asDecimal(){
        return (double) num/den;
    }
    
    public Fraction plus(Fraction other){
        Fraction temp = new Fraction(0,1);
        temp.num = num * other.den + other.num * den;
        temp.den = den * other.den;
        temp.reduce();
        return temp;
    }
    
    public Fraction plus(int other){
        Fraction temp = new Fraction(num, den);
        temp.num = num + den*other;
        temp.reduce();
        return temp;
    }
    
    public Fraction minus(Fraction other){
        Fraction temp = new Fraction(0,1);
        temp.num = num * other.den - other.num * den;
        temp.den = den * other.den;
        temp.reduce();
        return temp;
    }
    
    public Fraction minus(int other){
        Fraction temp = new Fraction(num, den);
        temp.num = num - den*other;
        temp.reduce();
        return temp;
    }
    
    public void reduce(){
      int biggest;
      int n1 = num;
      int d1 = den;
      
  //Finding the larger number of the numerator and the denominator
    if(num < 0){
       n1  = -num;
    }
    
    if(n1 > d1){
        biggest = num;
    } else {
        biggest = den;
    }
    
 //Finding number that can divide evenly into both num and den
    int gcf = 0;
    for(int i = biggest; i >=2; i--){
        if(num % i == 0 && den % i ==0){
            gcf = i;
            break;
        }
    }
   
    
 //Dividing the gcf out of the numerator and the denominator 
    if(gcf != 0){
        num /= gcf;
        den /= gcf;
    }
        
        
        
    }

    Fraction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String toString(){
        return num + "/" + den;
    }
    
    
    
}

