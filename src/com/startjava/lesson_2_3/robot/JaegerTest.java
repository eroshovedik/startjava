package com.startjava.lesson_2_3.robot;

public class JaegerTest extends Jaeger {
	public static void main(String[] args) {
		Jaeger robot1 = new Jaeger();
		Jaeger robot2 = new Jaeger();

		robot1.setModelName("The Shanghai Shield");
		robot1.setMark("Mark-5");
		robot1.setOrigin("Japan");
		robot1.setHeight(7.68f);
		robot1.setWeight(2.128f);
		robot1.setSpeed(2);
		robot1.setStrenght(8);
		robot1.setArmor(9);

		robot2.setModelName("Brawler Yukon");
		robot2.setMark("Mark-1");
		robot2.setOrigin("USA");
		robot2.setHeight(5.34f);
		robot2.setWeight(1.968f);
		robot2.setSpeed(5);
		robot2.setStrenght(9);
		robot2.setArmor(11);
		
		System.out.println(robot1.getModelName());
		System.out.println(robot1.getMark());

		System.out.println(robot2.getModelName());
		System.out.println(robot2.getMark());

		robot1.move();

		robot2.drift();
	}
}