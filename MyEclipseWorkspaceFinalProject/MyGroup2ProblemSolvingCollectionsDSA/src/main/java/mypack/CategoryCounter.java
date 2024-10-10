package mypack;

import java.util.*;

public class CategoryCounter {
	static int counter = 0;
  
	 public static void main(String[] args) {
		Car c1 = new Car(++counter, "car1", "red");
		Car c2 = new Car(++counter, "car2", "red");
		Car c3 = new Car(++counter, "car3", "red");
		
		Car c4 = new Car(++counter, "car4", "blue");
		Car c5 = new Car(++counter, "car5", "blue");
		
		Car c6 = new Car(++counter, "car6", "green");
		
		Car c7 = new Car(++counter, "car7", "black");
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(c1); cars.add(c2); cars.add(c3); cars.add(c4); cars.add(c5); cars.add(c6); cars.add(c7);
		
		getCountOfCarsByColor(cars); //brute force
		getCountOfCarsByColorOptimized(cars);//optimized 
	 }

	private static void getCountOfCarsByColorOptimized(List<Car> cars) {//red:3,blue:1
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(Car car :cars) {
			String color = car.getColor();
			if(!map.containsKey(color)) {
				map.put(color, 1);
			}else {
				int count = map.get(color);
				map.put(color, ++count);
			}
		}
		
		System.out.println(map);
		
	}

	private static void getCountOfCarsByColor(List<Car> cars) {//red:3, blue:2, green:1
		int redCount = 0;
		int blueCount = 0;
		int greenCount = 0;
		
		for(Car car:cars) {
			if(car.getColor().equals("red")) {
				++redCount;
			}else if(car.getColor().equals("blue")) {
				++blueCount;
			}else {
				++greenCount;
			}
		}
		
		System.out.println("Red:" + redCount+ ", Blue: "+blueCount + ",Green: " + greenCount);
	}
}

class Car{
	private int id;
	private String name;
	private String color;
	
	public Car(int id, String name, String color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
