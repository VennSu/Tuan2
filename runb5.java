package tuan2;

public class runb5 { private final int a; private final int b; private final int c;
public runb5(int a, int b, int c) {
    this.a=a;
    this.b=b;
    this.c=c;
}


    public String compute() {


        String kq="";
    if(this.a==0)
    {
        if(this.b==0)
        {
            if(this.c==0)
            {
                kq="Phương trình vô số nghiệm.";
            } 
            else {
                    kq="Phương trình vô nghiệm.";
                    }
        }
        else {
            kq="Phương trình có 1 nghiệm x=" +(this.c/this.b);
        }
    }
    else{
        double delta = Math.pow(this.b,2)-4*this.a*this.c;
        if (delta<0)
        kq="Phương trình vô nghiệm";
        else if (delta ==0)
            kq="Phương trình có nghiện kép x1=x2= " +(-this.b/(2*this.a));
        else {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            kq="x1 = "+((-this.b-Math.sqrt(delta))/(2*this.a));
            kq+="x2 = "+((-this.b+Math.sqrt(delta))/(2*this.a));
        }
    }
    return kq;
    }
}