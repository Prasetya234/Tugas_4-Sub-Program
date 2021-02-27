class Program {

    // ini variabel global
    static String game = "Minecraft";
    static String version = "14.90.00";

    static void help(){

        // ini variabel lokal
        String game = "Minecraft";

        // mengakses variabel global di dalam fungso help()
        System.out.println("Nama: " + game);
        System.out.println("Versi: " + version);
    }

    public static void main(String args[]){
        
        // panggil fungsi help()
        help();
        
        // System.out.println("Nama: " + nama);
        // System.out.println("Versi: " + version);

    }
}
