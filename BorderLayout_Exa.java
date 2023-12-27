package firstproject;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("unused")
public class BorderLayout_Exa 
{
	public static void main(String args[])
	{
		Frame frame = new Frame("Border Layout");
		Panel pa = new Panel();
		Button b1 = new Button();
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		Button b5 = new Button();
		pa.setLayout(new BorderLayout());
		frame.add(pa);
		pa.add(new Button("India"), BorderLayout.NORTH);
		pa.add(new Button("Pakistan"), BorderLayout.SOUTH);
		pa.add(new Button("China"), BorderLayout.WEST);
		pa.add(new Button("Malaysia"), BorderLayout.EAST);
		pa.add(new Button("COUNTRIES"), BorderLayout.CENTER);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
}
