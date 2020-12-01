package cw3;
public class cw3 {
    public static void main(String[] args){

        int[] tab = {2,2,3,4,5,6,2,8,9,10};
        int[] wynik = new int[tab.length];

        int a = 0;
        for  (int  i = 0; i < 10; i++) {

            a = a + tab[i];
            System.out.println(i+"Liczba ="+tab[i]);

        }
        System.out.println("suma liczb  ="+" "+" "+a);
    }
}
