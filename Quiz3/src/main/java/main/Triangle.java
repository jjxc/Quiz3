package main;

	public class Triangle extends GeometricObject{
		public double side1 = 1.0;
		public double side2 = 1.0;
		public double side3 = 1.0;
		
		public Triangle(){
		}
		
		public Triangle(double side1, double side2, double side3){
			
			this.side1=side1;
			this.side2=side2;
			this.side3=side3;
		}
		
		//Getters and Setters
		public double getSide1() {
			return side1;
		}
		
		public void setSide1(double side1) {
			this.side1 = side1;
		}
		
		public double getSide2() {
			return side2;
		}
		
		public void setSide2(double side2) {
			this.side2 = side2;
		}
		
		public double getSide3() {
			return side3;
		}
		
		public void setSide3(double side3) {
			this.side3 = side3;
		}
		
		//Calculations
		public double getArea(){
			double s;
			double a;
			s = (this.side1 + this.side2 + this.side3) / 2;
			a = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
			return a;	
		}
		
		public double getPerimeter(){
			double p;
			p = this.side1 + this.side2 + this.side3;
			return p;
		}
		
		//String Conversion
		public String toString(){
			return "The Triangle's side 1 is " + this.side1 + ", side 2 is " + this.side2 + ", and side 3 is " 
					+ this.side3 + ", area is " + getArea() + ", and perimeter is " + getPerimeter();
			}
			
		
	}


