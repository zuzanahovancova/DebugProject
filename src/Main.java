public class Main {
    public static void main(String[] args) {
        double stranaA = 1;
        double stranaB = 2.5;

        double obvodObdlznika = Obdlznik.obvod(stranaA,stranaB);
        double obsahObdlznika = Obdlznik.obsah(stranaA,stranaB);

        System.out.println("Obvod obdĺžnika " + obvodObdlznika);
        System.out.println("Obsah obdĺžnika " + obsahObdlznika);
    }
}
