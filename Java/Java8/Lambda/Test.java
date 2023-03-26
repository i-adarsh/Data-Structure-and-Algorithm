interface Interf{
    public int squareIt(int n);
}
public class Test {
    public static void main(String[] args) {
        Interf i = n->n*n;
        System.out.println(i.squareIt(4));
        System.out.println(i.squareIt(5));
    }
}
