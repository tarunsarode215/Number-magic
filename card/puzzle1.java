import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class puzzle1 extends JPanel implements ActionListener
{   int res=0;
    JButton b1=new JButton("Yes");
    JButton b2=new JButton("No");
    JTextField box[][]=new JTextField[4][4];
    Container cp;
	private int[][] puzzle1 =
	{{16,17,18,19},
	 {20,21,22,23},
	 {24,25,26,27},
	 {28,29,30,31}	
	};
	
	puzzle1(Card a)
	{
	    // setLaout(GridLayout(5,4));
		for (int row = 0; row < 4; ++row) {
         for (int col = 0; col < 4; ++col) {
			res=puzzle1[0][0];
            box[row][col] = new JTextField(); 
		    add(box[row][col]);
			box[row][col].setBackground(Color.GRAY);
		    box[row][col].setText(""+puzzle1[row][col]);
            box[row][col].setEditable(false);
			box[row][col].setHorizontalAlignment(JTextField.CENTER);
            box[row][col].setFont(new Font("", Font.BOLD, 30));
			
		}}
		
		
        
    b1.setFont(new Font("", Font.BOLD, 30));
    b2.setFont(new Font("", Font.BOLD, 30));
	b1.setBackground(Color.GREEN);
	b2.setBackground(Color.GREEN);
    add(b1);
    add(b2);
    b1.addActionListener(this);	
    b2.addActionListener(this);	
	}
   public void actionPerformed(ActionEvent e)
    { 
     if(e.getSource()==b1)
     {
		 Card.sum+=res;
        Card.mob.show(Card.cp,"P2");
	 }
     if(e.getSource()==b2)
     {
        Card.mob.show(Card.cp,"P2");

	 }		 	 
  
		
   }
 
  
}
