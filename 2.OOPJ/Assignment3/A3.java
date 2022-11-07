/*
* Write a class to represent complex numbers with necessary constructors. 
* Write member functions to add, multiply two complex numbers. 
* There should be three constructors: 
* (i) to initialize real and imaginary parts to 0; 
* (ii) to initialize imaginary part to 0 but to initialize the real part to user defined value; 
* (iii) to initialize the real part and the imaginary part to user defined values. 
* Also, write a main() function to 
* (i) create two complex numbers 3+2i and 4-2i; 
* (ii) to print the sum and product of those numbers. 
*/

class A3{
	
	public static void main(String[] args){
		ComplexNumber c1 = new ComplexNumber(3,2);
		ComplexNumber c2 = new ComplexNumber(4,-2);
	
		ComplexNumber sum = c1.add(c2); 
		// add(c1,c2);
		ComplexNumber product = c1.multiply(c2);
		
		ComplexNumber.printSumProduct(sum, product);
	
	}
}


class ComplexNumber{

	int real;
	int imag;
	
	ComplexNumber(){
		real = 0;
		imag = 0;
	}
	
	ComplexNumber(int real){
		this();
		this.real = real;
	}
	
	ComplexNumber(int real, int imag){
		this(real);
		this.imag = imag;
	}
	// (a+bi)(c+di) = (a*c) + (a * d)i + (b*c)i - (b*d) ==> (ac - bd) + (ad + bc);
	ComplexNumber add(ComplexNumber c){
		
		ComplexNumber sum = new ComplexNumber();
		sum.real = this.real + c.real;
		sum.imag = this.imag + c.imag;
		
		return sum;	
	}
	
	ComplexNumber multiply(ComplexNumber c){
		
		ComplexNumber product = new ComplexNumber();
		
		product.real = (this.real * c.real) - (this.imag * c.imag);
		product.imag =  (this.real * c.imag) + (this.imag * c.real);
		
		return product;
	}
	
	static void printSumProduct(ComplexNumber sum, ComplexNumber product){
		
		if(sum.imag<0){
			System.out.println("Sum is : " + sum.real + sum.imag + "i");
			System.out.println("Product is : " + product.real + product.imag + "i");
		}
			
		else{
			System.out.println("Sum is : " + sum.real + "+" + sum.imag + "i");
			System.out.println("Product is : " + product.real + "+" + product.imag + "i");	
		}
	}
}