class Pyramid{
public static void pyramidstar(int n)
{
int a,b;
for(a=0;a<n;a++){
for(b=0;b<=a;b++){
System.out.print("*");
}
System.out.println();
}
}
public static void main(String args[])
{
int n=5;
pyramidstar(n);
}
}
