package edu.c2c.module4.problem4;

public class MainDriver {

	public static void main(String[] args) {

		//instance computer with adding parameters
		Electronics computer = new Computer(2.25, 2000.00, 15.00, "Lenovo");

		//instance cell phone with adding parameters
		Electronics cellphone = new Cellphone(0.25, 1260.00, 12.00, "Iphone");

		//instance pager with adding parameters
		Electronics pager = new Pager(0.5, 300.00, 12.00, "Apollo");

		//instance camera with adding parameters
		Electronics camera = new Camera(1.0, 800.00, 12.00, "Canon");

		//print out added Computers information
		System.out.println("Computers");
		System.out.println(computer.toString());

		//print out added cell phone information
		System.out.println("-------------------------------");
		System.out.println("Cellphones");
		System.out.println(cellphone.toString());

		//print out added pager information
		System.out.println("-------------------------------");
		System.out.println("Pagers");
		System.out.println(pager.toString());

		//print out added cameras information
		System.out.println("-------------------------------");
		System.out.println("Cameras");
		System.out.println(camera.toString());

	}
}
