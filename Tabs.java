import java.awt.*;
import javax.swing.*;

public class Tabs extends JFrame{

	public Tabs()
	{
		super();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,600);
		JTabbedPane jtp=new JTabbedPane();
		JPanel pan1=new JPanel();
		pan1.setLayout(new BorderLayout());
		JButton btn1=new JButton("North");
		pan1.add(btn1,BorderLayout.NORTH);
		JButton btn2=new JButton("South");
		pan1.add(btn2,BorderLayout.SOUTH);
		JButton btn3=new JButton("East");
		pan1.add(btn3,BorderLayout.EAST);
		JButton btn4=new JButton("West");
		pan1.add(btn4,BorderLayout.WEST);
		JPanel pan2=new JPanel();
		JPanel pan3=new JPanel();
		pan1.setBackground(Color.green);
		pan2.setBackground(Color.blue);
		pan3.setBackground(Color.red);
		jtp.addTab("Information", pan1);
		jtp.addTab("Address", pan2);
		jtp.addTab("Name", pan3);
		this.add(jtp);
	}
	public static void main(String[] args) {
			Tabs t=new Tabs();
			t.setVisible(true);
	}

}
