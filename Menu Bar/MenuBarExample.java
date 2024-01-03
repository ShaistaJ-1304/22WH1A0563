package mypack;
import java.awt.*;
import java.awt.event.*;
public class MenuBarExample extends Frame implements ActionListener
{
	  Label l;
      MenuBarExample()
      {
    	  super("Menu Bar");
    	  l=new Label();
    	  setLayout(new FlowLayout());
    	  MenuBar mb=new MenuBar();
    	  setMenuBar(mb);
    	  add(l);
    	  setSize(300,300);
    	  setVisible(true);
    	  String menus[]= {"CSE","AIML","ECE","EEE","IT"};
    	  String submenus[]= {"I","II","III","IV"};
    	  String items[]= {"A","B","C"};
    	  for(int i=0;i<5;i++)
    	  {
    		  Menu m=new Menu(menus[i]);
    		  for(int j=0;j<4;j++)
    		  {
    			  Menu s=new Menu(submenus[j]);
    			  for(int k=0;k<3;k++)
    			  {
    				  MenuItem item=new MenuItem(items[k]);
    				  item.addActionListener(this);
    				  s.add(item);
    			  }
        		  m.add(s);
    		  }
    		  mb.add(m);
    	  }
    	  this.addWindowListener(new WindowAdapter() 
    	  {
    		  public void windowClosing(WindowEvent e)
    		  {
    			  System.exit(0);
    		  }
    	  });
      }
      public void actionPerformed(ActionEvent e)
      {
    	  MenuItem s1=(MenuItem)e.getSource();
    	  Menu s2=(Menu)s1.getParent();
    	  Menu s3=(Menu)s2.getParent();
    	  String str=s3.getLabel()+" "+s2.getLabel()+" "+s1.getLabel();
    	  l.setText(str);
    	  l.setSize(300,300);
      }
      public static void main(String...ar)
      {
    	  new MenuBarExample();
      }

}