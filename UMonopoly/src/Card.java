public class Card 
{
    private int ID;
	private String name;
	private double buy_out;
	private double hipoteka;
	private double pay_0;
	private double pay_1;
	private double pay_2;
	private double pay_3;
	private double pay_4;
	private double pay_H;
	private double pay_All;
	private double home;
        private String owner;
	
	
	/**
	 * Tworzy obiekt karty z podanymi wartościami
	 * @param id, unikatowy identyfikator karty
	 * @param nazwa, nazwa karty
	 * @param buy_price, cena kupna karty
	 * @param zastaw_hipoteka, cena zastawienia w hipotekę
	 * @param pay0, kwota do zapłacenia po najechaniu na puste pole
	 * @param pay1, kwota do zapłacenia po najechaniu na pole
	 * 				z jednym domem.
	 * @param pay2, kwota do zapłacenia po najechaniu na pole
	 * 				z dwoma domami.
	 * @param pay3, kwota do zapłacenia po najechaniu na pole 
	 * 				z trzema domami.
	 * @param pay4, kwota do zapłacenia po najechaniu na pole
	 * 				z czterema domami.
	 * @param payH, kwota do zapłacenia po najechaniu na pole
	 * 				z hotelem.
	 * @param payAll, kwota do zapłacenia po najechaniu na pole
	 * 				gdy gracz posiada całe państwo.
	 * @param home_price, cena jednego domu.
	 */
        
        
	public Card(int ID){
		this.ID = ID;
	}

    public Card(int id, String nazwa, double buy_price, double zastaw_hipoteka, double pay0, double pay1, double pay2, double pay3, double pay4, double payH, double payAll, double home_price, String owner) {
        ID = id;
        name = nazwa;
        buy_out = buy_price;
        hipoteka = zastaw_hipoteka;
        pay_0 = pay0;
        pay_1 = pay1;
        pay_2 = pay2;
        pay_3 = pay3;
        pay_4 = pay4;
        pay_H = payH;
        pay_All = payAll;
        home = home_price;
        this.owner = owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBuy_out() {
        return buy_out;
    }

    public void setBuy_out(double buy_out) {
        this.buy_out = buy_out;
    }

    public double getHipoteka() {
        return hipoteka;
    }

    public void setHipoteka(double hipoteka) {
        this.hipoteka = hipoteka;
    }

    public double getPay_0() {
        return pay_0;
    }

    public void setPay_0(double pay_0) {
        this.pay_0 = pay_0;
    }

    public double getPay_1() {
        return pay_1;
    }

    public void setPay_1(double pay_1) {
        this.pay_1 = pay_1;
    }

    public double getPay_2() {
        return pay_2;
    }

    public void setPay_2(double pay_2) {
        this.pay_2 = pay_2;
    }

    public double getPay_3() {
        return pay_3;
    }

    public void setPay_3(double pay_3) {
        this.pay_3 = pay_3;
    }

    public double getPay_4() {
        return pay_4;
    }

    public void setPay_4(double pay_4) {
        this.pay_4 = pay_4;
    }

    public double getPay_H() {
        return pay_H;
    }

    public void setPay_H(double pay_H) {
        this.pay_H = pay_H;
    }

    public double getPay_All() {
        return pay_All;
    }

    public void setPay_All(double pay_All) {
        this.pay_All = pay_All;
    }

    public double getHome() {
        return home;
    }

    public void setHome(double home) {
        this.home = home;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
         
}