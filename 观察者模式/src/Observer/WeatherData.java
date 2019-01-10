package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observerList;
	private float humidity;
	private float pressure;
	private float temp;;

	public WeatherData() {
		// TODO Auto-generated constructor stub
		observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub

		int i = observerList.indexOf(observer);

		if (i > 0) {
			observerList.remove(i);
		}

	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observerList.size(); i++) {
			Observer observer = (Observer) observerList.get(i);
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChange() {
		notifyObserver();

	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		
		measurementsChange();
	}
}
