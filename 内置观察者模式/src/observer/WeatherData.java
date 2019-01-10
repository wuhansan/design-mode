package observer;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
	}
	
	public void measurementsChange() {
		/**
		 * 调用 notify之前，需要指示状态已经改变
		 */
		setChanged();
		/**
		 * 没有调用notifyObservers传送对象，标识采用的做法是“拉”
		 */
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure) {
		this.temperature=temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChange();
	}
	/**
	 * 观察者会利用这些方法取得WeatherData对象的状态
	 * @return
	 */
	
	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
