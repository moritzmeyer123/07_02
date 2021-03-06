public class Konto {
    private String inhaber;
    protected float kontostand;
    private final float ZINSSATZ = 3.0f;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getInhaber() {
        return inhaber;
    }

    public float getKontostand() {
        return kontostand;
    }

    public void einzahlen (float betrag) {
        kontostand += betrag;
    }

    public float abheben (float betrag) {
        if (kontostand > betrag) {
            kontostand -= betrag;
            System.out.println(
                        inhaber + "hat " + betrag + " € abgehoben und verfuegt nun ueber " + kontostand + " €");
        } else {
            betrag = kontostand;
            kontostand -= betrag;
            System.out.println(
                        inhaber + "verfuegt nicht über ausreichend Guthaben, deshalb wurde der max. Betrag von " + betrag
                                + " € abgehoben und " + inhaber + " verfuegt nun ueber " + kontostand + " €");
        }
        return betrag;
    }

    public String toSring() {
        return inhaber + ": " + kontostand;
    }

    public float verzinsen() {
        kontostand = kontostand * (1 + ZINSSATZ / 12 / 100);
        return kontostand;
    }

    //Dummy-Methode
    public boolean pruefePin(int pin) {
        return false;
    }

    //Dummy-Methode
    public String getIBAN() {
        return null;
    }


}
