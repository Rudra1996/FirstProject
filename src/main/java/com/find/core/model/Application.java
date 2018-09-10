package com.find.core.model;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	ChartContainer ChartContainerObject;

	// Getter Methods

	public ChartContainer getChartContainer() {
		return ChartContainerObject;
	}

	// Setter Methods

	public void setChartContainer(ChartContainer chartContainerObject) {
		this.ChartContainerObject = chartContainerObject;
	}
}
