import java.util.Scanner;

public class Magazin_de_haine {


        Tip_produs cerinta;
       private int total_haine;

    Tip_produs pantaloni_s=new Tip_produs("Pantaloni",120.29,"S",26 );
    Tip_produs pantaloni_m=new Tip_produs("Pantaloni",95.50,"M",13 );
    Tip_produs pantaloni_l=new Tip_produs("Pantaloni",139.99,"L",26 );
    Tip_produs pantaloni_xl=new Tip_produs("Pantaloni",155.70,"XL",10 );
    Tip_produs bluze_s=new Tip_produs("Bluze",55.00,"S",43 );
    Tip_produs bluze_m=new Tip_produs("Bluze",59.50,"M",38 );
    Tip_produs bluze_l=new Tip_produs("Bluze",58.99,"L",22 );
    Tip_produs bluze_xl=new Tip_produs("Bluze",61.00,"XL",39 );
    Tip_produs tricouri_s=new Tip_produs("Tricouri",30.50,"S",67 );
    Tip_produs tricouri_m=new Tip_produs("Tricouri",31.50,"M",55 );
    Tip_produs tricouri_l=new Tip_produs("Tricouri",33.99,"L",39 );
    Tip_produs tricouri_xl=new Tip_produs("Tricouri",28.50,"XL",21 );



    public Magazin_de_haine(){
        total_haine= pantaloni_s.getCantitate() + pantaloni_m.getCantitate() + pantaloni_l.getCantitate() + pantaloni_xl.getCantitate() + bluze_s.getCantitate() + bluze_m.getCantitate() + bluze_l.getCantitate() + bluze_xl.getCantitate() + tricouri_s.getCantitate() + tricouri_m.getCantitate() + tricouri_l.getCantitate() + tricouri_l.getCantitate() + tricouri_xl.getCantitate();
    }

    public void adaugareProduse(int total_haine){
        this.total_haine+=total_haine;

    }

    public void stergereProduse(int total_haine){
        this.total_haine-=total_haine;

    }




    public void selecteazaProdus() {
        Scanner sc = new Scanner(System.in);
            cerinta=null;
        System.out.println("Selectati categoria de produs (Pantaloni, Bluze, Tricouri): ");
        String categorie = sc.nextLine();

        System.out.println("Selectati marimea produsului (S, M, L, XL): ");
        String marime = sc.nextLine();

        if (categorie.equals("Pantaloni") || categorie.equals("pantaloni") || categorie.equals("PANTALONI")) {
            if (marime.equals("S") || marime.equals("s")) cerinta = pantaloni_s;
            else if (marime.equals("M") || marime.equals("m")) cerinta = pantaloni_m;
            else if (marime.equals("L") || marime.equals("l")) cerinta = pantaloni_l;
            else if (marime.equals("XL") || marime.equals("xl")) cerinta = pantaloni_xl;
        } else if (categorie.equals("Bluze") || categorie.equals("bluze") || categorie.equals("BLUZE")) {
            if (marime.equals("S") || marime.equals("s")) cerinta = bluze_s;
            else if (marime.equals("M") || marime.equals("m")) cerinta = bluze_m;
            else if (marime.equals("L") || marime.equals("l")) cerinta = bluze_l;
            else if (marime.equals("XL") || marime.equals("xl")) cerinta = bluze_xl;
        } else if (categorie.equals("Tricouri") || categorie.equals("tricouri") || categorie.equals("TRICOURI")) {
            if (marime.equals("S") || marime.equals("s")) cerinta = tricouri_s;
            else if (marime.equals("M") || marime.equals("m")) cerinta = tricouri_m;
            else if (marime.equals("L") || marime.equals("l")) cerinta = tricouri_l;
            else if (marime.equals("XL") || marime.equals("xl")) cerinta = tricouri_xl;
        }

        if (cerinta != null) {
            System.out.println("Produsul selectat este: " + cerinta.getCategorie() + ", mărimea: " + cerinta.getMarime());
        } else {
            System.out.println("Produsul introdus nu a fost găsit.");
        }
    }






    public void actualizareProduse() {
        if (cerinta == null) {
            System.out.println("Nu ați selectat niciun produs. Vă rugăm să selectați unul mai întâi.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti ce anume doriți să modificați (pret, cantitate): ");
        String ce_sa_se_modifice = sc.nextLine();

        if (ce_sa_se_modifice.equals("pret") || ce_sa_se_modifice.equals("Pret") || ce_sa_se_modifice.equals("PRET")) {
            System.out.println("Introduceti noul pret: ");
            double nou_pret = sc.nextDouble();
            sc.nextLine();

            cerinta.setPret(nou_pret);



            System.out.println("Pretul pentru " + cerinta.getCategorie() + " mărimea " + cerinta.getMarime() + " a fost actualizat la: " + nou_pret);
        }else if(ce_sa_se_modifice.equals("cantitate") || ce_sa_se_modifice.equals("CANTITATE") || ce_sa_se_modifice.equals("Cantitate")){
            System.out.println(" Introduceti noua cantitate: ");
            int nou_cantitate=sc.nextInt();
            sc.nextLine();

            cerinta.setCantitate(nou_cantitate);


            System.out.println("Cantitatea pentru " + cerinta.getCategorie() + " mărimea " + cerinta.getMarime() +" la pretul de " +cerinta.getPret() + " a fost actualizat la: " + nou_cantitate);

        }
    }

        public void afisare_tip_produs(){
                Scanner sc = new Scanner(System.in);
                System.out.println(" Va rugam sa introduceti categoria de produs pentru care doriti sa aflati informatii despre stocuri (pantaloni, tricorui, bluze): ");
                    String produs=sc.nextLine();
            if(produs.equals("pantaloni") || produs.equals("Pantaloni") || produs.equals("PANTALONI")) {
                System.out.println(" Stocurile acestor produse sunt urmatoarele: ");
                System.out.println(pantaloni_s.getCategorie() + " marimea " + pantaloni_s.getMarime() + ", Stoc: " + pantaloni_s.getCantitate());
                System.out.println(pantaloni_m.getCategorie() + " marimea " + pantaloni_m.getMarime() + ", Stoc: " + pantaloni_m.getCantitate());
                System.out.println(pantaloni_l.getCategorie() + " marimea " + pantaloni_l.getMarime() + ", Stoc: " + pantaloni_l.getCantitate());
                System.out.println(pantaloni_xl.getCategorie() + " marimea " + pantaloni_xl.getMarime() + ", Stoc: " + pantaloni_xl.getCantitate());

            }else if(produs.equals("tricouri") || produs.equals("Tricouri") || produs.equals("TRICOURI")){
                System.out.println(" Stocurile acestor produse sunt urmatoarele: ");
                System.out.println(tricouri_s.getCategorie() + " marimea " + tricouri_s.getMarime() + ", Stoc: " + tricouri_s.getCantitate());
                System.out.println(tricouri_m.getCategorie() + " marimea " + tricouri_m.getMarime() + ", Stoc: " + tricouri_m.getCantitate());
                System.out.println(tricouri_l.getCategorie() + " marimea " + tricouri_l.getMarime() + ", Stoc: " + tricouri_l.getCantitate());
                System.out.println(tricouri_xl.getCategorie() + " marimea " + tricouri_xl.getMarime() + ", Stoc: " + tricouri_xl.getCantitate());

            }else if(produs.equals("bluze") || produs.equals("Bluze") || produs.equals("BLUZE")){
                System.out.println(" Stocurile acestor produse sunt urmatoarele: ");
                System.out.println(bluze_s.getCategorie() + " marimea " + bluze_s.getMarime() + ", Stoc: " + bluze_s.getCantitate());
                System.out.println(bluze_m.getCategorie() + " marimea " + bluze_m.getMarime() + ", Stoc: " + bluze_m.getCantitate());
                System.out.println(bluze_l.getCategorie() + " marimea " + bluze_l.getMarime() + ", Stoc: " + bluze_l.getCantitate());
                System.out.println(bluze_xl.getCategorie() + " marimea " + bluze_xl.getMarime() + ", Stoc: " + bluze_xl.getCantitate());


            }else{
                System.out.println(" Produsul pe care l-ati selectat nu este disponibil in magazinul nostru! ");

            }


        }

        public void adaugareProduseStoc(){
        selecteazaProdus();
                Scanner sc=new Scanner(System.in);
                System.out.println("Sunteti sigur ca pentru acest produs doriti sa adaugati stoc? Atentie, adaugati din nou categoria si marimea.Puteti adauga stoc doar acelor produse care au mai putin de 30 bucati disponibile! ");
                    String produs=sc.nextLine();
                    String marime=sc.nextLine();
                    if(cerinta != null){
                        if(cerinta.getCantitate() < 30){
                            System.out.println(" Produsul " + cerinta.getCategorie() + " cu marimea " + cerinta.getMarime() + ", " + " la pretul de " + cerinta.getPret() + ",are un stoc de: " + cerinta.getCantitate() + " bucati." );
                            System.out.println("Introduceti cantitatea pe care doriti sa o adaugati: ");
                            int cantitate_noua=sc.nextInt();

                            cerinta.setCantitate(cerinta.getCantitate() + cantitate_noua);

                            System.out.println("Stocul actualizat pentru aceasta selectie este: " + cerinta.getCantitate());


                        }else{
                            System.out.println("Produsul are mai mult de 30 de bucati pe stoc!");

                        }


                    }else {
                        System.out.println("Produsul sau marimea selectata nu exista.");
                    }


        }

                public void prod_nume(){

                    selecteazaProdus();

                    if(cerinta != null){

                        System.out.println("Detaliile produsului selectat sunt: ");
                        System.out.println("Pret: " + cerinta.getPret() + " LEI.");
                        System.out.println("Cantitate: " + cerinta.getCantitate() + " buc.");
                    }else{
                        System.out.println("Produsul selectat nu exista in stoc!");
                    }

                }




    public int getTotal_haine() {
        return total_haine;
    }
}
