package com.retangulo.java;

public class RetanguloMath {
	public float width;
	public float height;

	public float area() {
		return width * height;
	}

	public float perimeter() {
		return 2 * (width + height);
	}

	public float diagonal() {
		return (float) Math.sqrt(width * width + height * height);
	}

}
