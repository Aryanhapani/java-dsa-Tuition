public class implement_two_stack_array {
     public static int peek2(int[] stack,int top2){
        if (top2==stack.length){
            System.out.println("stack is underflow");
            return -1;
        }

        return stack[top2];
    }
    public static int peek1(int[] stack,int top1){
        if (top1==-1){
            System.out.println("stack is underflow");
            return -1;
        }

        return stack[top1];
    }
    public static int push1(int[] stack,int top1,int top2,int value1){
        if (top1==top2){
            System.out.println("stack is overflow");
            return top2;
        }


        top1++;

        stack[top1]=value1;

        return top1;
    }

    public static int pop1(int[] stack,int top1){
        return stack[top1];
    }

    public static int push2(int[] stack,int top2,int top1,int value2){
        if (top1+1==top2){
            System.out.println("stack is overflow");
             return top2;
        }




        top2--;

        stack[top2]=value2;

        return top2;
    }

    public static int pop2(int[] stack,int top2){
        return stack[top2];
    }

    public static void main(String[] args) {
         int[] stack=new int[10];
    int top1=-1;
    int top2=stack.length;
//push element into stack1
//    top1=push1(stack, top1,top2,34);
//    top1=push1(stack, top1,top2, 33);
//    top1=push1(stack, top1,top2, 66);
//    top1=push1(stack, top1,top2, 77);
//    top1=push1(stack, top1,top2, 88);
//
//push element into stack2

//    top2=push2(stack, top2,top1, 56);
//    top2=push2(stack, top2,top1, 45);
//    top2=push2(stack, top2,top1, 22);
//    top2=push2(stack, top2,top1, 11);
//    top2=push2(stack, top2,top1, 55);

//poped element from stack1

//    while (top1 >= 0){
//        System.out.println(pop1(stack, top1));
//        top1--;
//    }


//poped element from stack2

//
//    while (top2 < stack.length){
//            System.out.println(pop2(stack, top2));
//            top2++;
//        }


//peek element form stack1

        System.out.println(peek1(stack, top1));


//peek element form stack2

        System.out.println(peek2(stack, top2));





    }
}
