package observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondtionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentCondtionsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			
			display();
		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condtions: " + temperature + " F degress and " + humidity + " % humidity");

	}

}
