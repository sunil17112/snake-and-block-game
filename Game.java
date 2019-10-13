package snake_block;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.animation.TranslateTransition;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.animation.AnimationTimer;
import javafx.scene.*;

import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.*;
import java.util.ArrayList;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.collections.*;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
public	class Game	extends	Application	{	
	ArrayList<StackPane> arr=new ArrayList();

	//private static final KeyCode KP_LEFT = null;

	Scene	scene1;
	
	//ball c=new ball();
	static int time1 = 0;
	static int time2 = 0;
	static int time3 = 0;
	static int time4 = 0;
	public	static	void	main(String[]	args)	
	{	
		
		launch(args);	
	
	}	
	
	@Override	
	public	void start(Stage	primaryStage)	{	
		
					//	Set	the	stage	title	
					primaryStage.setTitle("Main_Page");		
					
					//	Create	a	button	and	place	it	in	the	scene	
					Button	btn1	=	new	Button("Start Game");
					Button	btn2	=	new	Button("Score Board");
					Button	btn3	=	new	Button("Exit");
					Button	btn4	=	new	Button("Resume");
				//	Create	a	scene	and	place	a	button	in	the	scene	
					VBox pane=new VBox();
					pane.setId("Sunil");
					btn1.setTranslateX(150);
					btn1.setTranslateY(160);
					btn2.setTranslateX(150);
					btn2.setTranslateY(370);
					btn3.setTranslateX(170);
					btn3.setTranslateY(390);
					btn4.setTranslateX(160);
					btn4.setTranslateY(130);
					pane.getChildren().add(btn1);	
					
					btn1.setOnAction(e -> 
					{
						Stage secondaryStage = new Stage();
						Pane root1 = new Pane();
														//block
						block b=new block(0);
						root1.getChildren().addAll(b);
														//shield
						shield sld=new shield(0);
						root1.getChildren().addAll(sld);
														//magnet
						magnet mag=new magnet(0);
						root1.getChildren().addAll(mag);
														//snake
						snake snk=new snake(root1);
						root1.getChildren().add(snk);
						
														//ball
						ball bl=new ball(40);
						root1.getChildren().addAll(bl);
						
						Scene scene2 = new	Scene(root1,400,600,Color.BLACK);
						
						AnimationTimer ass = new AnimationTimer() {
							
							public void handle(long timer) {
								
								time1();
								time2();
								//System.out.println(time);
								
								for (Node a : root1.getChildren().stream().map(s ->(Node)s).collect(Collectors.toList())) 
								{
									if (a instanceof block) {
										
										((block)a).movedown();
										if (time1>80) 
										{
											b.make(root1);
											time1 = 0;
										}
									}
									if(a instanceof ball)
									{
										
										((ball)a).movedown();
										if (time2>18) 
										{
											bl.make(root1);
											time2 = 0;
										}
									}
									if(a instanceof shield)
									{
										((shield)a).movedown();
										if(time3>18)
										{
											sld.make(root1);
											time3=0;
										}
									}
									if(a instanceof magnet)
									{
										((magnet)a).movedown();
										if(time4>18)
										{
											mag.make(root1);
										}
									}
									
								}
							}
						};
						ass.start();
						/*scene2.setOnKeyPressed(e1 -> {
							if(e1.getCode().toString()=="LEFT")
							{
								snk.left(root1);
							}
							else
							{
								snk.right(root1);
							}
							
						});*/
						secondaryStage.setScene(scene2);
						secondaryStage.show();
						//primaryStage.close();
					}
					
					);
					btn2.setOnAction(e -> 
					{
						Stage thirdStage = new Stage();
						StackPane pan=new StackPane();
						Scene leader=new Scene(pan,400,600);
						thirdStage.setScene(leader);  
						thirdStage.show();
					}
					);
					btn3.setOnAction(e -> 
					{
						primaryStage.close();
					}
					);
					pane.getChildren().add(btn2);
					pane.getChildren().add(btn3);
					pane.getChildren().add(btn4);
					scene1	=	new	Scene(pane,400,600);
//					scene2	=	new	Scene(pane,400,600);
					scene1.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
					//	Place	the	scene	in	the	stage	
					primaryStage.setScene(scene1);	
					
					//	Display	the	stage	
					primaryStage.show();		
	}
	void time1()
	{
		time1++;
	}
	void time2()
	{
		time2++;
	}
	void time3()
	{
		time3++;
	}
	void time4()
	{
		time4++;
	}
}
