import java.io.Console;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int mat,fizik,türkce,kimya,müzik;
        int toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if(0<=mat && mat<=100)
            toplam +=mat;
        else
            mat=0;
        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();
        if(0<=fizik && fizik<=100)
            toplam +=fizik;
        else
            fizik=0;
        System.out.print("Türkçe Notunuz:");
        türkce = input.nextInt();
        if(0<=türkce && türkce<=100)
            toplam +=türkce;
        else
            türkce=0;

        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();
        if(0<=kimya && kimya<=100)
            toplam +=kimya;
        else
            kimya=0;
        System.out.print("Müzik Notunuz:");
        müzik = input.nextInt();
        if(0<=müzik && müzik<=100)
            toplam +=müzik;
        else
            müzik=0;

        double ortalama = toplam/5;
        System.out.println("Ortalama: "+ortalama);







    }


}
