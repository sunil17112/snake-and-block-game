package snake_block;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public	class prac	extends	Application	{	
	Scene	scene1;
	block b;
	
	
	public	static	void	main(String[]	args)	{	
					launch(args);	
	}	
	private Rectangle Rect(int x)
	{
		Rectangle rect=new Rectangle();
		rect.setTranslateX(x);
		rect.setTranslateY(-80);
		rect.setWidth(80);
		rect.setHeight(80);
		rect.setArcHeight(20);
		rect.setArcWidth(20);
		return rect;
	}
	void play(Rectangle[] as)
	{
		TranslateTransition sual1=new TranslateTransition();
		sual1.setNode(as[0]);
		sual1.setToY(680);
		sual1.setDuration(Duration.seconds(4));
		sual1.play();
		as[0].setTranslateY(-80);
		TranslateTransition sual2=new TranslateTransition();
		sual2.setNode(as[1]);
		sual2.setToY(680);
		sual2.setDuration(Duration.seconds(4));
		sual2.play();
		as[1].setTranslateY(-80);
		TranslateTransition sual3=new TranslateTransition();
		sual3.setNode(as[2]);
		sual3.setToY(680);
		sual3.setDuration(Duration.seconds(4));
		sual3.play();
		as[2].setTranslateY(-80);
		TranslateTransition sual4=new TranslateTransition();
		sual4.setNode(as[3]);
		sual4.setToY(680);
		sual4.setDuration(Duration.seconds(4));
		sual4.play();
		as[3].setTranslateY(-80);
		TranslateTransition sual5=new TranslateTransition();
		sual5.setNode(as[4]);
		sual5.setToY(680);
		sual5.setDuration(Duration.seconds(4));
		sual5.play();
		as[4].setTranslateY(-80);
	}
	
	@Override	
	public	void	start(Stage	primaryStage)	{	
		
					//	Set	the	stage	title	
					primaryStage.setTitle("Main_Page");		
					//	Create	a	button	and	place	it	in	the	scene	
					Button	btn1	=	new	Button("Start Game");
					Button	btn2	=	new	Button("Score Board");
					Button	btn3	=	new	Button("Exit");
				//	Create	a	scene	and	place	a	button	in	the	scene	
					VBox pane=new VBox();
					pane.setId("Sunil");
					btn1.setTranslateX(150);
					btn1.setTranslateY(175);
					btn2.setTranslateX(150);
					btn2.setTranslateY(370);
					btn3.setTranslateX(170);
					btn3.setTranslateY(390);
					pane.getChildren().add(btn1);	
					btn1.setOnAction(e -> {
						Stage secondaryStage = new Stage();
						Pane root1 = new Pane();
						//b=new block();
						
						
						
						Scene scene2 = new	Scene(root1,400,600);
						secondaryStage.setScene(scene2);
							int i=0;
							int j = 0;
							Rectangle[] as = new Rectangle[5];
							while(i<400)
							{
								as[j]=Rect(i);
								
								root1.getChildren().add(as[j]);
								//System.out.println("yes");
								i=i+80;
								j++;
							}
						
							
						secondaryStage.show();
							play(as);
						
							
						
						primaryStage.close();
					}
					
					);
					pane.getChildren().add(btn2);
					pane.getChildren().add(btn3);
					scene1	=	new	Scene(pane,400,600);
//					scene2	=	new	Scene(pane,400,600);
					scene1.getStylesheets().addAll(this.getClass().getResource("application.css").toExternalForm());
					//	Place	the	scene	in	the	stage	
					primaryStage.setScene(scene1);	
					
					//	Display	the	stage	
					primaryStage.show();		
	}	
}
