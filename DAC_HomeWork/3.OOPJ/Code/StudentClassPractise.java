class StudentClassPractise{
	int rollNo;
	int age;
	double marks;
	
	void printDetails(){
		System.out.println(rollNo + " " + age + " " + marks);
	}

	public static void main(String[] args){
		
		StudentClassPractise std1 = new StudentClassPractise();
		std1.rollNo = 1;
		std1.age = 25;
		std1.marks = 75.26;
		
		StudentClassPractise std2 = new StudentClassPractise();
		std2.rollNo = 2;
		std2.age = 22;
		std2.marks = 95.1;
		
		std1.printDetails();
		std2.printDetails();
	
	}


}