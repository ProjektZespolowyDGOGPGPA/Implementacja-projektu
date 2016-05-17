
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oskar
 */
public class Card_View extends javax.swing.JComponent {

    private int ID=0;
    public int getID()
    {
        return ID;
    }
             
    public void setID(int ID)
    {
            int oldID=this.ID;
            this.ID=ID;
            firePropertyChange("ID karty", oldID, ID);  
            switch(ID)
        {
                case 0:
                jLabel1.setText("czemu");
                jLabel2.setText("nie dizala");
           
            case 2:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Projektowanie mebli i wyrobów drewnianych");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 4:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Inzynieria i automatyzacja w przemysle drewnianym");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 6:
                jLabel1.setText(ID+"");
                jLabel2.setText("MZK Koszalin Przystanek Poludniowy");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 7:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Energetyka");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 9:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Mechanika i budowa maszyn");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 10:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Transport");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 12:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Budownictwo");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 13:
                jLabel1.setText(ID+"");
                jLabel2.setText("Klub Studencki");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 14:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Inzynieria srodowiska");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 15:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Ochrona srodowiska");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 16:
                jLabel1.setText(ID+"");
                jLabel2.setText("MZK Koszalin Przystanek Zachodni");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 17:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Dziennikarstwo i komunikacja spoleczna");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 19:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Polityka");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 20:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Filologia");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 22:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Inżyniera Biomedyczna");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 24:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Pedagokia");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 25:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Mechatronika");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 26:
                jLabel1.setText(ID+"");
                jLabel2.setText("MZK Koszalin Przystanek Polnocny");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 27:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Ekonomia");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 28:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Finanse i rachunkowosc");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 29:
                jLabel1.setText(ID+"");
                jLabel2.setText("Pizzeria");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 30:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Zarzadzanie");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 32:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Wzornictwo");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 33:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Sztuka i media");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 35:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Malarstwo");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 36:
                jLabel1.setText(ID+"");
                jLabel2.setText("MZK Koszalin Przystanek Wschodni");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 38:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Elektronika i telekomunikacja");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
            case 40:
                jLabel1.setText(ID+"");
                jLabel2.setText("Kierunek Informatyka");
                jLabel2.setToolTipText("<html><img src=\"" +Card_View.class.getResource(ID+".png")+"\">");
                break;
           
        }
         
    }
     
    public Card_View() 
    {
        initComponents();
        jLabel2.setHorizontalAlignment(JLabel.CENTER);
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setMaximumSize(new java.awt.Dimension(24, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(24, 24));
        jLabel1.setPreferredSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration                   
}
