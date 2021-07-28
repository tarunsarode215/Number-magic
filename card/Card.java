import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Card extends JFrame 
{   
    static CardLayout mob;
    static Container cp;
	static int sum=0;
	int res=0;
	puzzle1 p1;
	puzzle2 p2;
	puzzle3 p3;
	puzzle4 p4;
	puzzle5 p5;
    
    
   
	
	Card()
	{
		mob=new CardLayout();	
	    setLayout(mob);
		cp = getContentPane();
		
		p1=new puzzle1(this);
		p2=new puzzle2(this);
		p3=new puzzle3(this);
		p4=new puzzle4(this);
		p5=new puzzle5(this);
		add("P1",p1);
		add("P2",p2);
		add("P3",p3);
		add("P4",p4);
		add("P5",p5);
        	
	}
   
   public static void main(String[] args) {
	   Card c1=new Card();
	   c1.setVisible(true);
	   c1.setBounds(100,100,800,800);
	   c1.setDefaultCloseOperation(Card.EXIT_ON_CLOSE);
   }
}
