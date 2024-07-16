package com.sai.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	private Tyre tyre;

	@Override
	public String toString() {
		return "Car [tyre=" + tyre + "]";
	}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public void drive() {
		System.out.println("car");
	}

}
