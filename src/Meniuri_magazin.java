import java.util.Scanner;

public class Meniuri_magazin {
        Meniu MeniuPrincipal;
        Magazin_de_haine MagazinTotal;
        Magazin_de_haine Actualizare;





        public Meniuri_magazin(Meniu MeniuPrincipal,Magazin_de_haine MagazinTotal, Magazin_de_haine Actualizare){
            this.MeniuPrincipal=MeniuPrincipal;
            this.MagazinTotal=MagazinTotal;
            this.Actualizare=Actualizare;
        }

        public void afisare_meniu_dec1(){
            int decizie;
            Scanner sc=new Scanner(System.in);


            do {
                System.out.println(" Pentru aceasta optiune alege una din urmatoarele: ");
                System.out.println(" 1. Adauga produse. ");
                System.out.println(" 2. Sterge produse. ");
                System.out.println(" 3. Actualizeaza produse. ");
                System.out.println(" 4. Vizualizeaza toate produsele. ");
                System.out.println(" 5. Finalizare actiuni. ");


                decizie = sc.nextInt();
                sc.nextLine();


                if(decizie == 1){
                    System.out.println(" Va rugam sa introduceti numarul de produse pe care doriti sa-l adaugati: ");
                    int numar_de_adaugat=sc.nextInt();
                    sc.nextLine();
                    MagazinTotal.adaugareProduse(numar_de_adaugat);
                    System.out.println(" Numarul de produse actual dupa adaugarea a " + numar_de_adaugat + " de produse este: " +  MagazinTotal.getTotal_haine());


                }else if (decizie == 2){
                    System.out.println(" Va rugam sa introduceti numarul de produse pe care doriti sa-l stergeti: ");
                    int numar_de_sters=sc.nextInt();
                    sc.nextLine();
                    MagazinTotal.stergereProduse(numar_de_sters);
                    System.out.println(" Numarul de produse actual dupa stergerea a " + numar_de_sters + " de produse este: " +  MagazinTotal.getTotal_haine());

                }else if(decizie==3){

                            Actualizare.selecteazaProdus();

                            Actualizare.actualizareProduse();



                }else if(decizie==4){

                    System.out.println(" Produsele magazinului sunt urmatoarele: ");
                    System.out.println( MagazinTotal.pantaloni_s.getCategorie() + ", " + MagazinTotal.pantaloni_s.getMarime() + ", " + MagazinTotal.pantaloni_s.getPret() );
                    System.out.println( MagazinTotal.pantaloni_m.getCategorie() + ", " + MagazinTotal.pantaloni_m.getMarime() + ", " + MagazinTotal.pantaloni_m.getPret() );
                    System.out.println( MagazinTotal.pantaloni_l.getCategorie() + ", " + MagazinTotal.pantaloni_l.getMarime() + ", " +  MagazinTotal.pantaloni_l.getPret() );
                    System.out.println( MagazinTotal.pantaloni_xl.getCategorie() + ", " + MagazinTotal.pantaloni_xl.getMarime() + ", " + MagazinTotal.pantaloni_xl.getPret() );

                    System.out.println( MagazinTotal.bluze_s.getCategorie() + ", " + MagazinTotal.bluze_s.getMarime() + ", " + MagazinTotal.bluze_s.getPret() );
                    System.out.println( MagazinTotal.bluze_m.getCategorie() + ", " + MagazinTotal.bluze_m.getMarime() + ", " + MagazinTotal.bluze_m.getPret() );
                    System.out.println( MagazinTotal.bluze_l.getCategorie() + ", " + MagazinTotal.bluze_l.getMarime() + ", " + MagazinTotal.bluze_l.getPret() );
                    System.out.println( MagazinTotal.bluze_xl.getCategorie() + ", " + MagazinTotal.bluze_xl.getMarime() + ", " + MagazinTotal.bluze_xl.getPret() );

                    System.out.println( MagazinTotal.tricouri_s.getCategorie() + ", " + MagazinTotal.tricouri_s.getMarime() + ", " + MagazinTotal.tricouri_s.getPret() );
                    System.out.println( MagazinTotal.tricouri_m.getCategorie() + ", " + MagazinTotal.tricouri_m.getMarime() + ", " + MagazinTotal.tricouri_m.getPret() );
                    System.out.println( MagazinTotal.tricouri_l.getCategorie() + ", " + MagazinTotal.tricouri_l.getMarime() + ", " + MagazinTotal.tricouri_l.getPret() );
                    System.out.println( MagazinTotal.tricouri_xl.getCategorie() + ", " + MagazinTotal.tricouri_xl.getMarime() + ", " + MagazinTotal.tricouri_xl.getPret() );

                }

            }while(decizie != 5);

        }


            Scanner sc=new Scanner(System.in);
    public void afisare_meniu_dec2() {
        int decizie;

        do {
            System.out.println(" Pentru aceasta optiune alege una din urmatoarele: ");
            System.out.println(" 1. Verifică stocuri. ");
            System.out.println(" 2. Reaprovizionează produs. ");
            System.out.println(" 3. Caută produs după nume. ");
            System.out.println(" 4. Finalizare actiuni. ");
            decizie = sc.nextInt();
            sc.nextLine();

            if (decizie == 1) {
                MagazinTotal.afisare_tip_produs();

            } else if (decizie == 2) {
                MagazinTotal.adaugareProduseStoc();

            }else if(decizie == 3){
                MagazinTotal.prod_nume();


            }else{
                System.out.println(" Meniul principal! ");

            }

        }while(decizie != 4);

    }


    public void plaseaza_comenzi(){
        int decizie;
        do{
            System.out.println(" Pentru aceasta optiune alege una din urmatoarele: ");
            System.out.println(" 1. Adauga produse in cos. ");
            System.out.println(" 2. ");
            System.out.println(" 3. ");
            System.out.println(" 4. ");


            decizie=sc.nextInt();
            sc.nextLine();

        }while(decizie!=5);





    }

}
