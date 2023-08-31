package com.example.application.utility;

import java.util.List;

public class RangeResponse {

    private List<String> batteryNames;
    private double totalWattCapacity;
    private double averageWattCapacity;
	public RangeResponse() {
		super();
	}
	public RangeResponse(List<String> batteryNames, double totalWattCapacity, double averageWattCapacity) {
		super();
		this.batteryNames = batteryNames;
		this.totalWattCapacity = totalWattCapacity;
		this.averageWattCapacity = averageWattCapacity;
	}
	public List<String> getBatteryNames() {
		return batteryNames;
	}
	public void setBatteryNames(List<String> batteryNames) {
		this.batteryNames = batteryNames;
	}
	public double getTotalWattCapacity() {
		return totalWattCapacity;
	}
	public void setTotalWattCapacity(double totalWattCapacity) {
		this.totalWattCapacity = totalWattCapacity;
	}
	public double getAverageWattCapacity() {
		return averageWattCapacity;
	}
	public void setAverageWattCapacity(double averageWattCapacity) {
		this.averageWattCapacity = averageWattCapacity;
	}


}
