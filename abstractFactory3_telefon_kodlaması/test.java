package abstractFactory3_telefon_kodlamas─▒;

public class test {
    public static void main(String[] args) {
        TelefonFabrikas─▒ s8=new S8_Fabrikas─▒();
       Telefon telefon= s8.createTelefon("s8","batarya",5,3);
        Telefon telefon2=s8.createTelefon("s8plus","batarya",10,6);
        System.out.println(telefon);
        System.out.println("***********************************");
        System.out.println(telefon2);

    }
}
