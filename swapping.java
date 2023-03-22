class TwoGenerics<1>
{
    T a;
    T b;
    TwoGenerics(T a1, T b1) {
        a=a1;
        b=b1;
    }
    void swap()
    {
        T c=a;
        a=b;
        b=c;
    }
    void print(){
        System.out.println(a);
        System.out.println(b);
    }
}
class GDemo
{
    public static void main(string args[]);
    {
        TwoGenerics<Integer>obj = new TwoGenerics<Integer>(45,50);
        System.out.print("Before Swapping");
        obj.print();
        System.out.print("After Swapping"); 
        obj.swap();
        obj.print();
     TwoGenerics<String>obj = new TwoGenerics<String>("sse","vit");
        System.out.print("Before Swapping");
        obj.print();
        System.out.print("After Swapping"); 
        obj.swap();
        obj.print();
    }
}
