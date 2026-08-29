public class inderitance_herarchical {
    public static void main(String[] args) {
        b s1=new b();
        s1.showa();
        s1.showb();
        c s2=new c();
        s2.showa();
        s2.showc();
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

class c extends a{
    void showc(){
        System.out.println("c");
    }
}
