package snake_block;  		
import java.util.Random; 
import javafx.scene.text.Font;
import javafx.scene.layout.Pane; 
import javafx.scene.paint.Color;     
import javafx.scene.control.Label;      
import javafx.scene.shape.Rectangle;

public class block extends Rectangle implements frequency
{
	int point;
	int temp=0;
	//Label[] l=new Label[5];
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

	//private int point;
	/*public void STOP()
	{
		
	}*/
	block()
	{
		
	}
	
	block (int x)
	{
		
		super(70,70);
		setTranslateX(x);
		setTranslateY(-80);
		setArcHeight(20);
	
		setArcWidth(20);
		Label l;
		
		
		
		
		
		int r=Randomvalue();
		
		
		//System.out.println(r);
		if(r==1)
		{
			setVisible(false);
			temp=1;
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
		Label[] arr=new Label[5];
		 int i=0;
		 int j=0;
		 while(i<400)
		 {
			 //String s="<b>1</b>";
			/* l=new Label("1");
			
			 l.setFont(new Font("Cambria", 20));
			 l.setTranslateY(-80);
			 l.setTranslateX(i+40);
			 l.setMaxHeight(20);
			 l.setMaxWidth(20);
			 //label.setTranslateX(arg0);*/
			 root.getChildren().addAll( new block ( i) );
			 i=i+80;
			 j++;
		 }
	 }
	public void movedown() 
	{
	
		
		/*if(l[0]==null)
		{
			setTranslateY(this.getTranslateY()+7);
		}
		else
		{*/
			setTranslateY(this.getTranslateY()+7);
			
			/*l[0].setTranslateY(l[0].getTranslateY()+7);
			l[1].setTranslateY(l[1].getTranslateY()+7);
			l[2].setTranslateY(l[2].getTranslateY()+7);
			l[3].setTranslateY(l[3].getTranslateY()+7);
			l[4].setTranslateY(l[4].getTranslateY()+7);
			
			
		}*/
		//System.out.println(l.getTranslateY());
		//p.setTranslateY(p.getTranslateY()+7);
	}
	
}
