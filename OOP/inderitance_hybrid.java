public class inderitance_hybrid {
    public static void main(String[] args) {
        b s1=new b();
        s1.showa();
        s1.showb();
        c s2=new c();
        s2.showa();
        s2.showb();
        s2.showc();
        d s3=new d();
        s3.showa();
        s3.showd();
    }
}

class a{
    void showa(){
        System.out.println("a");
    }
}

class b extends a{
    void showb(){
        System.out.println("b");
    }
}

class c extends b{
    void showc(){
        System.out.println("c");
    }
}
class d extends a{
    void showd(){
        System.out.println("d");
    }
}