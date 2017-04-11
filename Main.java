import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener{
private JDesktopPane desk;
	public Main()
	{
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,600);
		desk=new JDesktopPane();
		JMenuBar bar=new JMenuBar();
		JMenu add=new JMenu("File");
		JMenuItem new_Item=new JMenuItem("New Frame");
	    add.add(new_Item);
	    new_Item.addActionListener(this);
	    bar.add(add);
	    this.setJMenuBar(bar);
		this.add(desk);
	}
	public static void main(String[] args) {
	
		/*
		 * JDesktopPane is the big pane
		 * JInternalFrame is the smalls frames in the bigger pane
		 * 
		 */
		Main f=new Main();
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JInternalFrame fr=new JInternalFrame("Internal",true,true,true,true);
		fr.pack();//makes frame fit
		desk.add(fr);
		fr.setVisible(true);
		
	}

}
