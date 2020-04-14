package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//single line comment
/*
 * This 
 * is 
 * a 
 * multiline
 * comment
 * JVM Java virtual machine, converts Java code into machine code that your processor can understand; provides portability
 * 
 * JRE Java Runtime Environment; JVM and libraries; everything we need to run javva
 * JDK Java development kit, contains jvm and jre
 * contains everything we need to write Java
 * 
 * OOP 
 * Java unit of programmability is the object
 * Objects have states and behavior
 * States aka fields, attributes, variables etc
 * Behavior- methods
 * Classes- the blueprint or template of an object
 */
public static void main(String[] args) {//<-method signature
	/*
	 * public -access modifier; can be accessed by everything
	 * static - method can be used directly from a class; doesn't need to be instantiated to be used; do not need to belong to the class
	 * void- doesnt return anything
	 * String[] args parameter(s) used for this method
	 * 
	 */
	Human h = new Human();
System.out.println("Roll Tide");
h.setName("Melissa");
h.setAge(34);
h.setWeight(157);

System.out.println(h.getName());
}
}
