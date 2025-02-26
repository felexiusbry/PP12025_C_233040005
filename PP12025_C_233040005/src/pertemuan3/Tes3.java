package pertemuan3;

public class Tes3 {
    public static void main(String[] args) {
        StrukturList List1 = new StrukturList();
        List1.addHead(1);
        List1.addHead(2);
        List1.addHead(3);

        System.out.print("a : ");
        List1.displayElement();
        System.out.println();

        StrukturList List2 = new StrukturList();
        List2.addHead(7);
        List2.addHead(5);
        List2.addHead(4);
        List2.addHead(1);

        System.out.print("b : ");
        List2.displayElement();
        System.out.println();
    }
}
