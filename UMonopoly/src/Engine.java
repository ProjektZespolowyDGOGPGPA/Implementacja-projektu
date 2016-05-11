
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Engine 
{
    private String log;
    private List<Player> gracze;
    private int aktywny_gracz=0;
    private List<Card> pola=new ArrayList(40);
    

    public Engine(int x, String kolor1,String kolor2,String kolor3,String kolor4) 
    {
        gracze = new ArrayList(x);
        log="";
        for(int i=0;i<x;i++)
        {
            gracze.add( new Player("Gracz"+(i+1),"oskar",0,3000.0));
            log=log+"Witamy "+ gracze.get(i).getName()+"\n";
        }
        gracze.get(0).setKolor(kolor1);
        gracze.get(1).setKolor(kolor2);
        gracze.get(2).setKolor(kolor3);
        gracze.get(3).setKolor(kolor4);
        log=log+"Życzymy miłej gry\nAktywny gracz: "+gracze.get(aktywny_gracz).getName(); 
        
        pola.add(new Card(1));
        pola.add(new Card(2, "Kierunek Projektowanie mebli i wyrobów drewnianych", 120, 60, 10, 40, 120, 360, 640, 900, 20, 100, "oskar"));
        pola.add(new Card(3));
        pola.add(new Card(4, "Kierunek Inzynieria i automatyzacja w przemysle drewnianym", 120, 60, 10, 40, 120, 360, 640, 900, 20, 100, "oskar"));
        pola.add(new Card(5));
        pola.add(new Card(6, "MZK Koszalin Przystanek Poludniowy", 400, 200, 50, 100, 200, 400, 0, 0, 0, 0, "oskar"));
        pola.add(new Card(7, "Kierunek Energetyka", 200, 100, 15, 60, 180, 540, 800, 1100, 30, 100, "oskar"));
        pola.add(new Card(8));
        pola.add(new Card(9, "Kierunek Mechanika i budowa maszyn", 200, 100, 15, 60, 180, 540, 800, 1100, 30, 100, "oskar"));
        pola.add(new Card(10, "Kierunek Transport", 240, 120, 20, 80, 200, 600, 900, 1200, 40, 100, "oskar"));
        pola.add(new Card(11));
        pola.add(new Card(12, "Kierunek Budownictwo", 280, 140, 20, 100, 300, 900, 1250, 1500, 40, 200, "oskar"));
        pola.add(new Card(13, "Klub Studencki", 300, 150, 10, 0, 0, 0,0, 0, 20, 0, "oskar"));
        pola.add(new Card(14, "Kierunek Inzynieria srodowiska", 280, 140, 20, 100, 300, 900, 1250, 1500, 40, 200, "oskar"));
        pola.add(new Card(15, "Kierunek Ochrona srodowiska", 320, 160, 25, 120, 360, 1000, 1400, 1850, 50, 200, "oskar"));
        pola.add(new Card(16, "MZK Koszalin Przystanek Zachodni", 400, 200, 50, 100, 200, 400, 0, 0, 0, 0, "oskar"));
        pola.add(new Card(17, "Kierunek Dziennikarstwo i komunikacja spoleczna", 360, 180, 30, 140, 400, 1100, 1500, 1900, 60, 200, "oskar"));
        pola.add(new Card(18));
        pola.add(new Card(19, "Kierunek Polityka", 360, 180, 30, 140, 400, 1100, 1500, 1900, 60, 200, "oskar"));
        pola.add(new Card(20, "Kierunek Filologia", 400, 200, 35, 160, 440, 1200, 1600, 2000, 70, 200, "oskar"));
        pola.add(new Card(21));
        pola.add(new Card(22, "Kierunek Inżyniera Biomedyczna", 440, 220, 35, 180, 500, 1400, 1750, 2100, 70, 300, "oskar"));
        pola.add(new Card(23));
        pola.add(new Card(24, "Kierunek Pedagokia", 440, 220, 35, 180, 500, 1400, 1750, 2100, 70, 300, "oskar"));
        pola.add(new Card(25, "Kierunek Mechatronika", 480, 240, 40, 200, 600, 1500, 1850, 2200, 80, 300, "oskar"));
        pola.add(new Card(26, "MZK Koszalin Przystanek Polnocny", 400, 200, 50, 100, 200, 400, 0, 0, 0, 0, "oskar")); 
        pola.add(new Card(27, "Kierunek Ekonomia", 520, 260, 45, 220, 660, 1600, 1950, 2300, 90, 300, "oskar"));
        pola.add(new Card(28, "Kierunek Finanse i rachunkowosc", 520, 260, 45, 220, 660, 1600, 1950, 2300, 90, 300, "oskar"));
        pola.add(new Card(29, "Pizzeria", 300, 150, 10, 0, 0, 0,0, 0, 20, 0, "oskar"));
        pola.add(new Card(30, "Kierunek Zarzadzanie", 560, 280, 50, 240, 720, 1700, 2050, 2400, 100, 300, "oskar"));
        pola.add(new Card(31));
        pola.add(new Card(32, "Kierunek Wzornictwo", 600, 300, 55, 260, 780, 1900, 2200, 2550, 110, 400, "oskar"));
        pola.add(new Card(33, "Kierunek Sztuka i media", 600, 300, 55, 260, 780, 1900, 2200, 2550, 110, 400, "oskar"));
        pola.add(new Card(34));
        pola.add(new Card(35, "Kierunek Malarstwo", 640, 320, 60, 300, 900, 2000, 2400, 2800, 120, 400, "oskar"));
        pola.add(new Card(36, "MZK Koszalin Przystanek Wschodni", 400, 200, 50, 100, 200, 400, 0, 0, 0, 0, "oskar"));
        pola.add(new Card(37));
        pola.add(new Card(38, "Kierunek Elektronika i telekomunikacja", 700, 350, 70, 350, 1000, 2200, 2600, 3000, 140, 400, "oskar"));
        pola.add(new Card(39));
        pola.add(new Card(40, "Kierunek Malarstwo", 800, 400, 100, 400, 1200, 2800, 3400, 4000, 200, 400, "oskar"));
        
        
        
    }
    
    public Engine(int x, String kolor1,String kolor2,String kolor3) 
    {
        gracze = new ArrayList(x);
        log="";
        for(int i=0;i<x;i++)
        {
            gracze.add( new Player("Gracz"+(i+1),"oskar",0,3000.0));
            log=log+"Witamy "+ gracze.get(i).getName()+"\n";
        }
        gracze.get(0).setKolor(kolor1);
        gracze.get(1).setKolor(kolor2);
        gracze.get(2).setKolor(kolor3);
        log=log+"Życzymy miłej gry\nAktywny gracz: "+gracze.get(aktywny_gracz).getName(); 
        
    }
    public Engine(int x, String kolor1,String kolor2) 
    {
        gracze = new ArrayList(x);
        log="";
        for(int i=0;i<x;i++)
        {
            gracze.add( new Player("Gracz"+(i+1),"oskar",0,3000.0));
            log=log+"Witamy "+ gracze.get(i).getName()+"\n";
        }
        gracze.get(0).setKolor(kolor1);
        gracze.get(1).setKolor(kolor2);
        log=log+"Życzymy miłej gry\nAktywny gracz: "+gracze.get(aktywny_gracz).getName(); 
        
    }
   
    public Player getPlayer(int x)
    {
        return gracze.get(x);
    }
    
    public Player getAktywnyPlayer()
    {
        return gracze.get(aktywny_gracz);
    }
            
    public String getLog() 
    {
        return log;
    }

    public void setLog(String log) 
    {
        this.log = log;
    }
    
    public void koniecTury()
    {
        if(aktywny_gracz+1<gracze.size())
        {
            aktywny_gracz=aktywny_gracz+1;
            log=log+"\nAktywny gracz: "+gracze.get(aktywny_gracz).getName();
        }
        else
        {
            aktywny_gracz=0;
            log=log+"\nAktywny gracz: "+gracze.get(aktywny_gracz).getName();
        }
    }
    
    public void random2k6()
    {
        Random ran = new Random();
        int randomNum = (ran.nextInt(5) + 1) + ran.nextInt(5) + 1;
        gracze.get(aktywny_gracz).setWhere(gracze.get(aktywny_gracz).getWhere()+randomNum);
        log=log + "\n" + gracze.get(aktywny_gracz).getName()+" wyrzucił "+ randomNum + " i przesuwa sie na pole "+gracze.get(aktywny_gracz).getWhere() ;
        
    }
}
