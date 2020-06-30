package observerModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	List<Observer> observers = new ArrayList<Observer>();
	public void addObserver(Observer newObserver){
		observers.add(newObserver);
	}
	public void removeObserver(Observer newObserver){
		observers.remove(newObserver);
	}
	public void notifyObserver(){
		for(Observer observer:observers){
			observer.update();
		}
	}
}
