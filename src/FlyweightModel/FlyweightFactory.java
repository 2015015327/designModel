package FlyweightModel;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String,Flyweight> map = new HashMap<String,Flyweight>();

	FlyweightFactory() {
		this.map.put("A", new ConcreateFlyweight());
		this.map.put("B", new ConcreateFlyweight());
		this.map.put("C", new ConcreateFlyweight());
		this.map.put("D", new UnsharedConcreateFlyweight());
	}
	public Flyweight GetFlyWeight(String key){
		if(this.map.get(key)==null){
			this.map.put(key, new ConcreateFlyweight());
		}
		return this.map.get(key);
	}
	public Flyweight GetUnShareFlyWeight(String key){
		if(this.map.get(key)==null){
			this.map.put(key, new UnsharedConcreateFlyweight());
		}
		return this.map.get(key);
	}
}
