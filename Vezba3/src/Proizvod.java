public class Proizvod {

    public void izbaciSamoJedan(Proizvod p){

        if (kupljeniProizvodi.contains(p)){
            if (kupljeniProizvodi.get(kupljeniProizvodi.indexOf(p))
                    .getKolicina() == 1)
            {
                izbaciProizvod(kupljeniProizvodi.get(kupljeniProizvodi.indexOf(p)));
            }
            else{
                // Treba da umanjimo kolicinu proizvoda p za 1
                // U ArrayListi kupjeniProizvodi za proizvod p da promenim polje kolicina za 1
                // da udjem u arrayListu -> na index proizvoda p -> settujem kolicinu -> za getKolicina - 1


                int br = kupljeniProizvodi.get(kupljeniProizvodi.indexOf(p))
                        .setKolicina(kupljeniProizvodi.get(kupljeniProizvodi.indexOf(p))
                                .getKolicina() - 1);


                iznos -= p.getCenaProizvoda();
            }
        }

    }
    //0 hleb
    //1 voda
    //2 sok
    //3 kafa
    //4 kroasan

