
/**
 * UniversityMonopoly by ITDreamTeam
 * @author Paweł Gawron
 * @version 0.1
 */

public class Card {

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
	
	/**
	 * Tworzy obiekt Karty z domyślnymi wartościami.
	 */
	public Card(){
		ID = 0;
		name = "Pole";
		buy_out = 0;
		hipoteka = 0;
		pay_0 = 0;
		pay_1 = 0;
		pay_2 = 0;
		pay_3 = 0;
		pay_4 = 0;
		pay_H = 0;
		pay_All = 0;
		home = 0;
	}
	
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
	public Card(int id, String nazwa, double buy_price, double zastaw_hipoteka,
			double pay0, double pay1, double pay2, double pay3, double pay4,
			double payH, double payAll, double home_price){
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
	}
	
	/**
	 * Zwraca numer ID karty.
	 * @return ID
	 */
	private int get_ID(){
		return ID;
	}
	
	/**
	 * Zwraca nazwę karty.
	 * @return name
	 */
	private String get_name(){
		return name;
	}
	
	/**
	 * Zwraca informację o koszcie karty.
	 * @return buy_out
	 */
	private double get_buy_out(){
		return buy_out;
	}
	
	/**
	 * Zwraca informację o koszcie wykupu hipoteki 
	 * dla danej karty.
	 * @return hipoteka
	 */
	private double get_hipoteka(){
		return hipoteka;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy to nie posiada żadnego domu.
	 * @return pay_0
	 */
	private double get_pay_0(){
		return pay_0;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy to posiada jeden dom.
	 * @return pay_1
	 */
	private double get_pay_1(){
		return pay_1;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy to posiada dwa domy.
	 * @return pay_2
	 */
	private double get_pay_2(){
		return pay_2;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy to posiada trzy domy. 
	 * @return pay_3
	 */
	private double get_pay_3(){
		return pay_3;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy to posiada cztery domy. 
	 * @return pay_4
	 */
	private double get_pay_4(){
		return pay_4;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy to posiada hotel.  
	 * @return pay_H
	 */
	private double get_pay_H(){
		return pay_H;
	}
	
	/**
	 * Zwraca wartość określającą kwotę, którą należy zapłacić
	 * po najechaniu na dane pole, gdy całe państwo jest niezabudowane.
	 * @return pay_All
	 */
	private double get_pay_All(){
		return pay_All;
	}
	
	/**
	 * Zwraca cenę jednego domu.
	 * @return
	 */
	private double get_home(){
		return home;
	}
	
	/**
	 * Ustawia wartość identyfikatora.
	 * @param ID
	 */
	private void set_ID(int ID){
		this.ID = ID;
	}
	
	/**
	 * Zmienia nazwę pola.
	 * @param name
	 */
	private void set_name(String name){
		this.name = name;
	}
	
	/**
	 * Zmienia cenę karty. 
	 * @param buy_out
	 */
	private void set_buy_out(double buy_out){
		this.buy_out = buy_out;
	}
	
	/**
	 * Zmienia cenę za jaką można zastawić kartę w hipotekę.
	 * @param hipoteka
	 */
	private void set_hipoteka(double hipoteka){
		this.hipoteka = hipoteka;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy to nie jest zabudowane. 
	 * @param pay_0
	 */
	private void set_pay_0(double pay_0){
		this.pay_0 = pay_0;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy znajduje się na nim jeden dom. 
	 * @param pay_1
	 */
	private void set_pay_1(double pay_1){
		this.pay_1 = pay_1;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy znajdują się na nim dwa domy. 
	 * @param pay_2
	 */
	private void set_pay_2(double pay_2){
		this.pay_2 = pay_2;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy znajdują się na nim trzy domy. 
	 * @param pay_3
	 */
	private void set_pay_3(double pay_3){
		this.pay_3 = pay_3;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy znajdują się na nim cztery domy. 
	 * @param pay_4
	 */
	private void set_pay_4(double pay_4){
		this.pay_4 = pay_4;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy znajduje się na nim hotel. 
	 * @param pay_H
	 */
	private void set_pay_H(double pay_H){
		this.pay_H = pay_H;
	}
	
	/**
	 * Zmienia kwotę, którą należy zapłacić po najechaniu
	 * na dane pole, gdy gracz posiada całe państwo. 
	 * @param pay_All
	 */
	private void set_pay_All(double pay_All){
		this.pay_All = pay_All;
	}
	
	/**
	 * Ustawia cenę jednego domu.
	 * @param home
	 */
	private void set_home(double home){
		this.home = home;
	}
	
}
