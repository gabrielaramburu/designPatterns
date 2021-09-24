package observerPattern;

import java.util.*;

public class ObserverPattern {
	public static void main(String[] args) {
		MySubject observer = new MySubject();
		observer.setSomeState(5);

		MyObserver observer1 = new MyObserver("Observer1");
		MyObserver observer2 = new MyObserver("Observer2");
		MyObserver observer3 = new MyObserver("Observer3");

		observer.addListener(observer1);
		observer.addListener(observer2);
		observer.addListener(observer3);

		//using a new thread here it s little bit overdesing.
		// A while whould be enought :)
		Thread t1 = new Thread(()-> {
			while(true) {
				Random ran = new Random();
				observer.setSomeState(ran.nextInt());
				observer.notifyListeners();
				pause(3000);
				observer.removeListener(observer1);
			}
		});

		t1.setDaemon(true);
		t1.start();

		pause(10000);
		System.out.println("End");
		
	}

	static void pause(long l) {
		try {
			Thread.sleep(l);
		} catch(InterruptedException e) {

		}
	}
}


class MySubject implements Subject {
	private int someState;
	private List<Observer> observers;

	MySubject(){
		this.observers = new ArrayList<Observer>(); 
	}

	@Override
	public void addListener(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeListener(Observer observer) {
		this.observers.remove(observer);	
	}

	@Override
	public void notifyListeners() {
		for (Observer obs: observers) {
			obs.update(this.someState);
		}
	} 

	public void setSomeState(int newValue) {
		this.someState = newValue;
	}
}

class MyObserver implements Observer {
	private String name;

	MyObserver(String name) {
		this.name = name;
	}

	public void update(int value) {
		System.out.format("%10s -> a new value has arrive. %d \n", this.name, value);
	}
}


interface Observer {
	/* Used for push style */
	public void update(int value);//this could be an object


	/*  This could be used for pull style. 
		By pull style I mean tha the client get the specific data from de Observer.
	*/
	//public void update(Observable obs);
}

interface Subject {
	public void addListener(Observer observer);
	public void removeListener(Observer observer);
	public void notifyListeners();
}