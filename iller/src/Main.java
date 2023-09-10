import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] sehirler={"Adana",
                "Adıyaman",
                "Afyonkarahisar",
                "Ağrı",
                "Aksaray",
                "Amasya",
                "Ankara",
                "Antalya",
                "Ardahan",
                "Artvin",
                "Aydın",
                "Balıkesir",
                "Bartın",
                "Batman",
                "Bayburt",
                "Bilecik",
                "Bingöl",
                "Bitlis",
                "Bolu",
                "Burdur",
                "Bursa",
                "Çanakkale",
                "Çankırı",
                "Çorum",
                "Denizli",
                "Diyarbakır",
                "Düzce",
                "Edirne",
                "Elazığ",
                "Erzincan",
                "Erzurum",
                "Eskişehir",
                "Gaziantep",
                "Giresun",
                "Gümüşhane",
                "Hakkâri",
                "Hatay",
                "Iğdır",
                "Isparta",
                "İstanbul",
                "İzmir",
                "Kahramanmaraş",
                "Karabük",
                "Karaman",
                "Kars",
                "Kastamonu",
                "Kayseri",
                "Kırıkkale",
                "Kırklareli",
                "Kırşehir",
                "Kilis",
                "Kocaeli",
                "Konya",
                "Kütahya",
                "Malatya",
                "Manisa",
                "Mardin",
                "Mersin",
                "Muğla",
                "Muş",
                "Nevşehir",
                "Niğde",
                "Ordu",
                "Osmaniye",
                "Rize",
                "Sakarya",
                "Samsun",
                "Şanlıurfa",
                "Siirt",
                "Sinop",
                "Şırnak",
                "Sivas",
                "Tekirdağ",
                "Tokat",
                "Trabzon",
                "Tunceli",
                "Uşak",
                "Van",
                "Yalova",
                "Yozgat",
                "Zonguldak"};
        List<String> sehir=new ArrayList<>();
        for (String sehirs:sehirler){
            sehir.add(sehirs);
        }
        int s=0;
        int v=0;
        int g=0;
        int h=0;
        for(int i=0;i<sehir.size();i++){
            for(int j=0;j<sehir.get(i).length();j++)
            if(sehir.get(i).charAt(j)=='ş' || sehir.get(i).charAt(j)=='Ş' ){
                s++;
            }
            else if(sehir.get(i).charAt(j)=='v' || sehir.get(i).charAt(j)=='V'){
                v++;
            }
            else if(sehir.get(i).charAt(j)=='g' || sehir.get(i).charAt(j)=='G'){
                g++;
            }
            else if(sehir.get(i).charAt(j)=='h' || sehir.get(i).charAt(j)=='H'){
                h++;
            }
        }
        System.out.println("Ş: "+s);
        System.out.println("V: "+v);
        System.out.println("G: "+g);
        System.out.println("H: "+h);
    }
}