class CheckNumber {
    public static void main(String args[]) {
        int num = 10;
        if (num % 2 == 0)
            System.out.println(num + "la so chan");
        else
            System.out.println(num + "la so le");
    }
}

class WhileDemo {
    public static void main(String args[]) {
        int a = 5, fact = 1;
        while (a >= 1) {
            fact *= a;
            a--;
        }
        System.out.println("the factorial of 5 is " + fact);
    }
}

class ForDemo {
    public static void main(String args[]) {
        int i = 1, sum = 0;
        for (i = 1; i <= 10; i += 2)
            sum += i;
        System.out.println("sum of first five old numbers is " + sum);
    }
}

public class Sum {
    public static void main(String[] args) {
        int maxDenominator = 50000;
        double sum = 0.0;
        for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
            sum += (double) 1 / denominator;
        }
        System.out.println("the sum is :" + sum);
    }
}



class Name {
   public static void main(String[] args) {
        System.out.println("tuan anh dep trai vcl");
        System.out.println("học java khó vãi ");
    }
}

class review {
    public static void main(String[] args) {
        System.out.println("kho hieu vcl");
        System.out.println("haizzz");
    }
}


class GFG {
    static String Employee_name;
    static float Employee_salary;

    static void set(String n, float p) {
        Employee_name = n;
        Employee_salary = p;
    }

    static void get() {
        System.out.println("Employee name is:" + Employee_name);
        System.out.println("Employee CTC is:" + Employee_salary);

    }

    static void main(String args[]) {
        GFG.set("T ", 10000.0f);
        GFG.get();
    }
}
class TuGiac {
    protected Diem d1, d2, d3, d4;
    public void set (Diem _d1) {d1 = _d1;}
    public Diem getD1() {return d1;}
    public void printTuGiac() {
        System.out.println("tu giac");
    }
}







































































































































