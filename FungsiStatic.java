class FungsiStatic {
    
    // Fungsi non-static
    void kamu(String kamuan){
        System.out.println("Dan ");
        System.out.println("Nama kamu adalah : " + kamuan);
    }
    
    // fungsi static
    static void aku(String akuan){
        System.out.println("Nama aku adalah : " + akuan);
    }
    
    // fungsi main
    public static void main(String[] args) {
        
        // pemanggilan fungsi static
        aku("Danny Van Dutcman");
        
        // mambuat instansiasi objek saya dari class FungsiStatic
        FungsiStatic jika = new FungsiStatic();
        // pemanggilan fungsi non-static
        jika.kamu("Jonsen Alberd");
        
    }
    
}