class Payment{
    public void Pay(){
        System.out.println("pay process");
    } 
}
class Upi extends Payment{
    public void scanQr(){
        System.out.println("scanning qr");
    }    
}
class MainPayment{
    public static void main(String[] args) {
        Payment p = new Payment();
        // Upi u = new Upi();
        Upi u = (Upi)p; // downcasting parent se child class ka access nahi hota hai wo access krne ke liye hum downcasting krte hai 
        p.Pay();
        u.scanQr();   

        Upi u1 = new Upi();
        u1.Pay();
        u1.scanQr();
    }
}