public class Ruang {
    
    public static void main(String[] args) {
        int p = 35;
        int l = 14;
        int t = 10;

        int volume = volumeBalok(p, l ,t);

        // Volume Balok 
        System.out.println("Volume Balok adalah :"+volume);
    }

    // membuat fungsi luasPersegi()
    static int volumeBalok(int p, int l, int t){
        return p * l * t;
    }
    
}
