import java.util.Scanner;
public class testTroll {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        boolean flag;
        boolean tmp;
        Troll t1 = null;

        int puntiSalute = 0;
        String nome;
        System.out.println("Inserisci il nome: ");
        nome = input.nextLine();
        do{//ciclo input selezione con eccezzioni
            try{
                input = new Scanner(System.in);
                System.out.print("Inserisci i punti salutre: ");
                puntiSalute = input.nextInt();
                flag = true;
            }catch(Exception e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while(!flag);

        try {
             t1 = new Troll(nome, puntiSalute);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Attacco del troll"+t1.attaccaConTroll());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            t1.curaTroll(10);
            System.out.println("Il troll ora ha: "+t1.getPuntiFerita()+" puntiFerita");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            tmp = t1.danneggiaTroll(10);
            System.out.println("Il troll ora ha: "+t1.getPuntiFerita()+" puntiFerita");
            System.out.println("Il troll è vivo ?"+ tmp);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(t1.toString());



    }
}
