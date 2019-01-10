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
		 * ���� notify֮ǰ����Ҫָʾ״̬�Ѿ��ı�
		 */
		setChanged();
		/**
		 * û�е���notifyObservers���Ͷ��󣬱�ʶ���õ������ǡ�����
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
	 * �۲��߻�������Щ����ȡ��WeatherData�����״̬
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
