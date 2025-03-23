import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class Zohaib35Panel extends JPanel{
    public Zohaib35Panel(){
        setBackground(Color.black);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        g2.setStroke(new BasicStroke(8));
        g2.setColor(Color.MAGENTA);
        g2.drawRect(5, 5, 1343, 650);
        g2.setColor(Color.GREEN);
        g2.setStroke(new BasicStroke(10));
        g2.drawArc(1150,45,100,150,230,190);
        g2.drawLine(1200,40,1200,40);
        g2.drawArc(1050,45,100,150,230,190);
        g2.drawArc(1087,53,70,80,95,245);
        g2.drawArc(980,53,80,100,180,180);
        g2.drawArc(900,60,80,100,205,190);
        g2.drawArc(550,60,350,120,190,205);
        g2.drawLine(950,180,950,180);
        g2.drawLine(930,180,930,180);
        g2.drawArc(980,160,60,100,110,220);
        g2.drawLine(740,200,740,200);
        g2.drawLine(400,100,500,105);
        //khan
        g2.drawLine(400,100,400,140);
        g2.drawArc(340,70,165,100,248,123);
        g2.drawLine(383,20,383,165);
        g2.drawLine(435,80,435,80);
        g2.drawArc(240,40,120,150,180,180);
        g2.drawLine(300,80,300,80);
        g2.setColor(Color.YELLOW);
        g2.drawLine(1250,250,1250,410);
        g2.drawArc(1171,350,80,100,180,180);
        g2.drawArc(1091,360,80,100,180,190);
        g2.drawLine(1091,250,1091,410);
        g2.drawArc(960,290,100,150,230,190);
        g2.drawArc(1010,295,45,80,95,245);
        g2.drawArc(630,345,350,120,190,205);
        g2.drawLine(1140,480,1140,480);
        g2.drawLine(1120,480,1120,480);
        g2.drawLine(1020,280,1020,280);
        g2.drawLine(1000,280,1000,280);
        g2.drawLine(820,380,820,380);
        g2.drawLine(800,380,800,380);
        //Khan
        g2.drawLine(450,380,450,420);
        g2.drawArc(380,350,165,100,248,123);
        g2.drawLine(430,330,430,440);
        g2.drawLine(450,380,542,385);
        g2.drawArc(290,320,120,150,180,180);
        g2.drawLine(350,380,350,380);
        g2.drawLine(490,360,490,360);
        g2.setColor(Color.CYAN);
        //roll number
        //2
        g2.drawLine(30, 500, 100, 500);
        g2.drawLine(30, 550, 100, 550);
        g2.drawLine(30, 600, 100, 600);
        g2.drawLine(100, 500, 100, 550);
        g2.drawLine(30, 550, 30, 600);
        //2
        g2.drawLine(120, 500, 190, 500);
        g2.drawLine(120, 550, 190, 550);
        g2.drawLine(120, 600, 190, 600);
        g2.drawLine(190, 500, 190, 550);
        g2.drawLine(120, 550, 120, 600);
        //1
        g2.drawLine(210, 500, 210, 600);
        //3
        g2.drawLine(230, 500, 310, 500);
        g2.drawLine(310, 500, 310, 600);
        g2.drawLine(230, 550, 310, 550);
        g2.drawLine(230, 600, 310, 600);
        //3
        g2.drawLine(330, 500, 410, 500);
        g2.drawLine(330, 550, 410, 550);
        g2.drawLine(330, 600, 410, 600);
        g2.drawLine(410, 500, 410, 600);
        //5
        g2.drawLine(430,500, 510, 500);
        g2.drawLine(430,550, 510, 550);
        g2.drawLine(430,600, 510, 600);
        g2.drawLine(430,500, 430, 550);
        g2.drawLine(510,550, 510, 600);
    }
}