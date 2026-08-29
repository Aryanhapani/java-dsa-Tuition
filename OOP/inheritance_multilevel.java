public class inheritance_multilevel {
    public static void main(String[] args) {
        b s1=new b();
        s1.showa();
        s1.showb();
        c s2=new c();
        s2.showb();
        s2.showc();
    }
}

//multilevel inheritance
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

