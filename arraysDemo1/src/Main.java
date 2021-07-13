public class Main {

    public static void main(String[] args) {
	    String[] students = new String[5];

	    students[0] = "Gürkan";
	    students[1] = "Engin";
	    students[2] = "Derin";
		students[3] = "Ahmet";
		students[4] = "Ali";

	    for (int i=0;i< students.length;i++){
            System.out.println(students[i]);
        }

		System.out.println("----------------------");

	    for (String student:students){
			System.out.println(student);
		}
    }
}
