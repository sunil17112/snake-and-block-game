package snake_block;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class magnet extends Rectangle {
	private  int time;
	private int distance;
	public void timer()
	{
		
	}
	public magnet(int x)
	{
		super(70,70);
		setTranslateX(x);
		setTranslateY(-80);
		setArcHeight(20);
		setArcWidth(20);
	}
	public void make(Pane root)
	 {
		
		 int i=0;
		 while(i<400)
		 {
			/*l=new Label("Cuthiya");
			 l.setTranslateY(-80);
			 l.setTranslateX(i);
			 l.setMaxHeight(100);
			 l.setMaxWidth(100);*/
			 //label.setTranslateX(arg0);
			 root.getChildren().addAll(new magnet(i));
			 i=i+80;
		 }
	 }
	public void movedown() 
	{
	
		
		/*if(l==null)
		{
			setTranslateY(this.getTranslateY()+7);
		}*/
		//else
		//{
			setTranslateY(this.getTranslateY()+7);
			//l.setTranslateY(l.getTranslateY()+7);
		//}
		//System.out.println(l.getTranslateY());
		//p.setTranslateY(p.getTranslateY()+7);
	}
}
