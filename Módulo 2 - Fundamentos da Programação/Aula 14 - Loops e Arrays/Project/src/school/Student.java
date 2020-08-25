package school;

public class Student {
	@SuppressWarnings("unused")
	private String name;
	private double grades[];
	
	public Student(String name, double grades[]) {
		this.name = name;
		this.grades = grades;
	}
	
	public double getFinalGrade() {
		double finalGrade = 0;
		
		for(double grade : grades) {
			finalGrade += grade;
		}
		
		return finalGrade;
	}
	
	private double missingGrade() {
		return 60 - getFinalGrade();
	}
	
	@Override
	public String toString() {
		return String.format("FINAL GRADE = %.2f%n%s",
				getFinalGrade(), getFinalGrade() >= 60? "PASS" : 
					String.format("FAILED%nMISSING %.2f POINTS%n", missingGrade()));
	}
	
}
