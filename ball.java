package snake_block;
import java.util.Random;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
public class ball extends Circle implements frequency
{
	Label l;
	@Override
	public int Randomvalue()
	{
		Random ran = new Random();
		return ran.nextInt(2);
	}
	public String Randomcolor()
	{
		Random ran=new Random();
		String[] str= {"ALICEBLUE","RED","BEIGE","YELLOW","GREEN"};
		return str[ran.nextInt(5)];
	}
	private int point;
	/*public ball()
	{
		super(10);
		//setTranslateX(x);
		setTranslateY(-40);
		setVisible(true);
	}*/
	block b;
	public void get(block bl)
	{
		b=bl;
	}
	public ball(int x)
	{
		super(10);
		setTranslateX(x);
		setTranslateY(-40);
		//setVisible(true);
		int r=Randomvalue();
		
		//System.out.println(r);
		if(r==1)
		{
			setVisible(false);
		}
		else
		{
			setVisible(true);
			if(Randomcolor()=="ALICEBLUE")
			{
				setFill(Color.ALICEBLUE);
			}
			else if(Randomcolor()=="RED")
			{
				setFill(Color.RED);
			}
			else if(Randomcolor()=="BEIGE")
			{
				setFill(Color.BEIGE);
			}
			else if(Randomcolor()=="YELLOW")
			{
				setFill(Color.YELLOW);
			}
			else
			{
				setFill(Color.GREEN);
			}
		}
	}
	public void make(Pane root)
	 {
		
		 int i=40;
		 while(i<400)
		 {
			 //text = new Label(name);
			 root.getChildren().add( new ball( i ));
			 i=i+80;
		 }
	 }
	public void movedown() 
	{
	
		setTranslateY(this.getTranslateY()+7);
	}
	/*public void setter()
	{
		
	}*/
	

}
