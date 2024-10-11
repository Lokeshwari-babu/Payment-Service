class Testservice {
    public static void main (String[]args) {
        paymentservice  ps = new paymentservice();
        ps.setstatus("Yes");


        String acc_status = ps.getstatus();
        System.out.println(acc_status);
    }
}