package snake_block;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
class token
{
	
	private int x;
	private int y;
	public token(int _x,int _y)
	{
		this.x=_x;
		this.y=_y;
	}
	protected int getx()
	{
		
		return this.x;
	}
	protected int gety()
	{
		
		return this.y;
	}
	/*protected void setter()
	{
		
	}*/
	
}
class array{
	ArrayList<snake> arr=new ArrayList();
	
}
public class snake extends Circle {
	//ArrayList<snake> arr=new ArrayList();
	array a=new array();
	
	private static int length=4;
	private int speed;
	public snake()
	{
		
	}
	public snake(Pane root)
	{
		makeSnake(root);
	}
	public snake(int y)
	{
		super(10);
		setTranslateX(200);
		setTranslateY(y);

	
	}
	public void makeSnake(Pane root)
	{
		for(int i=300;i<380;i+=20)
		{
			snake obj=new snake(i);
			a.arr.add(obj);
			 root.getChildren().add( obj);
		}
	}
	/*public void left(Pane root)
	{
		for(int i=0;i<length;i++)
		{
			if(instanceof snake)
			{
				
			}
		}
	}*/
	public void right(Pane root)
	{
		
	}
	private void inc()
	{
		
	}
	private void dcr()
	{
		
	}
	public void eat_ball()
	{
		
	}
	public void eat_block()
	{
		
	}
	public void take_shield()
	{
		
	}
	public void take_magnet()
	{
		
	}
}

