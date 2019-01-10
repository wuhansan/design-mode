package Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;

	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions : " + temperature + "F degress and  " + humidity + "f% humidity "
				+ pressure + " % pressure");

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;

		display();

	}

}
