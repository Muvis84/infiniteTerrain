package com.qa.assessment;

import java.util.Scanner;
import java.util.Random;

public class GreySwamp {
	public static void main(String[] args) {
		
		String direction = Area.area();
	
	// game variable
	String [] greyswampMonsters = {"Zombie","Monster"};
	 int hp= 90;
	int attackdamage = 15;
	
	// player variable
	 int playerHealth = 100;
	 int playerAttacked = 50;
	 int  healthpotion = 30;
	  int playersurvivingchance=50;
	  boolean going = true;
	  System.out.println("Welcome");
	int maxenemy;
	 
	  
	  while(going) {
		  System.out.println("--------------------");
	  }
	  Scanner rand = null;
	int enemyAttacked = rand.nextInt();
	  String greyswampMonster = greyswampMonsters(rand.nextInt(greyswampMonsters.length));
	  
	  System.out.println("\t#" + greyswampMonster + "is in front of you #\n");
	  while (enemyAttacked > 0) {
		System.out.println("\t you still in " + playerHealth);
		  System.out.println("\t" + enemyAttacked +" " + hp);
		  
		  System.out.println("what do you like to do?");
		  System.out.println("\t1.attack");
		  System.out.println("\t2.run");
		  System.out.println("\t3.change direction");
		 
	  }
	  Scanner scan = null;
	String  input = scan.nextLine();
	  if (input.equals("1")) {
		  int damagedealt = rand.nextInt();
		  int playerdamage = rand.nextInt();
	  }else if (input.equals("2")) {
		  System.out.println("you ran way game is over " );
		  
	  }else if (input.equals("3")) {
		 double north = 5;
		 double south= 3;
		 double east =1;
		 double west;
		 if (north>=5) {
		  System.out.println("\t you are reaching your destination " + north);
		 }else if (south==3) {
			 System.out.println("you are in south");
			 
		 }
		 else {
			 System.out.println("Game Over, Good Bye");
		 }
	  }
	//String greyswampMonsters(int nextInt) {
		// TODO Auto-generated method stub
		//return null;
	}
public static Double calculateTheArea() {
	Scanner s1 = new Scanner(System.in);
	return s1.nextDouble();
	
	int b;
	int a;
	int c;
	if((a+b)>c && (a+c) >b && (b+c) > a ){
		int s =(a+b+c)/2;
		
		double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("your distance to the next adventure is :" + area);
		 
	 }else {
		 System.out.println("Return to your base");
	 }
	
	
	
}
	

	private static String greyswampMonsters(int nextInt) {
		// TODO Auto-generated method stub
		return null;
	}
	//private String greyswampMonsters(int nextInt) {
		// TODO Auto-generated method stub
		//return null;
	}


