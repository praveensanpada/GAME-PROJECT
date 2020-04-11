
package com.play.game;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainGame {
 public static void main(String[] args) {
 
@SuppressWarnings("resource")
 ApplicationContext context = new ClassPathXmlApplicationContext("Play.xml");
GamePlay Obj = (GamePlay) context.getBean("game");
 
Obj.play();
 }
}