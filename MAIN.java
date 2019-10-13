package snake_block;
import java.io.FileInputStream;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import application.MainController;
import application.MainPage;
/*import application.MainController.Block;
import application.MainController.Magnet;
import application.MainController.Shield;
import application.MainController.Snake;
import application.MainController.Wall;*/
//import application.MainController.Ball;
import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class MAIN {
	
	StackPane[] snkarr=new StackPane[16]; //for ball upto the screen

	block blk = new block();
	snake snk = new snake();
	wall wl = new wall();

	shield sld = new shield(0);
	magnet magt = new magnet(0);
	AnimationTimer timer;
	public void start1(ActionEvent event,Stage primaryStage) {
		
			Pane root1 = new Pane();

			Button pause = new Button("Pause");
			pause.setId("pause");
			pause.setTranslateX(0);
			pause.setPrefHeight(50);
			pause.setPrefWidth(150);
			pause.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event){
					timer.stop();
					MainPage screen1 = new MainPage();
					screen1.start(primaryStage);
					//					savestate(snake,"Database.txt");
				}
			});

			Button restart = new Button("restart");
			restart.setId("restart");
			restart.setTranslateX(160);
			restart.setPrefHeight(50);
			restart.setPrefWidth(150);
			restart.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					timer.stop();
					MainController GamePlay = new MainController();
					GamePlay.start1(arg0, primaryStage);
				}

			});

			Button exit = new Button("exit");
			exit.setId("exit");
			exit.setTranslateX(320);
			exit.setPrefHeight(50);
			exit.setPrefWidth(150);
			exit.setOnAction(s ->{
				timer.stop();
				MainPage main = new MainPage();
				main.start(primaryStage);
			});

			StackPane pau = new StackPane();
			pau.getChildren().addAll(pause,restart,exit);

			snakearr[0] = snake_body.make1(140,510,1,4,true);

			snakearr[1]  = snake_body.make1(140, 530,0,2,true);	
			snakearr[2]  = snake_body.make1(140, 550,0,3,true);
			snakearr[3]  = snake_body.make1(140, 570,0,4,true);
			snakearr[4]  = snake_body.make1(140, 590,0,5,false);
			snakearr[5]  = snake_body.make1(140, 610,0,6,false);
			snakearr[6]  = snake_body.make1(140, 630,0,7,false);
			snakearr[7]  = snake_body.make1(140, 650,0,8,false);
			snakearr[8]  = snake_body.make1(140, 670,0,9,false);
			snakearr[9]  = snake_body.make1(140, 690,0,10,false);		
			snakearr[10] = snake_body.make1(140, 710,0,11,false);
			snakearr[11] = snake_body.make1(140, 730,0,12,false);
			snakearr[12] = snake_body.make1(140, 750,0,13,false);
			snakearr[13] = snake_body.make1(140, 770,0,14,false);
			snakearr[14] = snake_body.make1(140, 790,0,15,false);	
			snakearr[15] = snake_body.make1(140, 810,0,16,false);	

			StackPane blk = block.make1(100,-100,true,67);

			StackPane sp = new StackPane();
			sp.setId("sp");
			sp.setTranslateX(200);
			sp.setTranslateY(300);
			sp.setPrefWidth(95);
			sp.setPrefHeight(100);
			sp.setVisible(true);

			Image img = new Image(("magnet.png"));
			ImageView imgView = new ImageView(img);
			imgView.setPreserveRatio(true); 
			//			imgView.setX(150); 
			//			imgView.setY(200); 
			imgView.setFitHeight(50); 
			imgView.setFitWidth(50);         
			sp.getChildren().add(imgView);

			root1.getChildren().addAll(snakearr);	
			root1.getChildren().addAll(blk,pau,sp);			
			Scene scene = new Scene(root1,500,900);
		

			timer = new AnimationTimer() {
				@Override
				public void handle(long arg0) {
					update(root1,timer,primaryStage);
				}

			};
		
			timer.start();
		
}}
	
