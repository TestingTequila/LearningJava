package day4;

public class IncrementAndDecrementOperators
{
    public static void main(String[] args) {
        //1. post increment [First Assignment and then Increment]

        int a =1;
        System.out.println("Before Increment Value of a: "+a); //1

        int b = a++;
        System.out.println("After  Increment Value of a: " + a); //2
        System.out.println(b); //1

        int c = 100;
        int d = c++;
        System.out.println(c); // 101
        System.out.println(d); // 100

        int c1 = -99;
        int d1 = c++;
        System.out.println(c1); //-98
        System.out.println(d1); //-99

        int x =10;
        int y = x++;
        System.out.println(x); //11
        System.out.println(y); //10

        //2. pre-increment: [increment first and then Assign]
        int t =1;
        int u =++t;
        System.out.println(t);
        System.out.println(u);

        int k =-99;
        int p=++k;
        System.out.println(k);
        System.out.println(p);

        int g =-1001;
        int h = ++g;
        System.out.println(g);//-1000
        System.out.println(h);//-1000

        //3. post decrement
        int s =2;
        int v = s--;
        System.out.println(s); //1
        System.out.println(v); //2

        int i1=-999;
        int i2= i1--;
        System.out.println(i1); //-1000
        System.out.println(i2); //-999

        //4. pre-Decrement
        int r1= 2;
        int r2=--r1;
        System.out.println(r1);
        System.out.println(r2);

        float f= 2.5f;
        float j = f++;
        System.out.println(f);//3.5
        System.out.println(j);//2.5

        //=========================Miscellaneous Cases======================//

        int num=10;
        System.out.println(num++);
        System.out.println(num);

        int total =10;
        System.out.println(++total);
        System.out.println(total);

        char ch = 'a'; //97
        System.out.println(++ch);
        System.out.println(ch);

// Complex Examples

         int m =200;
         int n=m++;
        System.out.println(--m);//200
        System.out.println(m); //200
        System.out.println(m++);//200
        System.out.println(m--);//201
        System.out.println(--m);//199
        System.out.println(m);//199

        //Statement and loops


    }
}
