import java.util.Scanner;

public class Student {
    private int id; 
	private String first;     // first name
    private String last;      // last name
    private int date;
    private String faculty;
    private int course;
    private int group;

    // construct a new student with given fields
    public Student(int id, String first, String last, int date, String faculty, int course, int group) {
        this.id = id;
    	this.first = first;
        this.last = last;
        this.date = date;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
    
    public boolean less(Student b) {
        Student a = this;
        return a.id < b.id;
    }
    
    public boolean iaFaculty(Student b) {
    	Student a = this;
        return a.faculty == b.faculty;
    }

    // return a string representation of the invoking object
    public String toString() {
        return id + ") им€: " + first + ", фамили€: " + last + ", год рождени€: " + date +", факультет: "+ faculty +", курс: "+ course +", группа: "+ group;
    }

    // sample client
    public static void main(String[] args) {

        // number of students
    	System.out.print("¬ведите количество студентов: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // initialize an array that holds n objects of type Student
        Student[] students = new Student[n];

        // read in the data
        for (int i = 0; i < n; i++) {
        	System.out.print("¬ведите номер студента: ");
            Scanner scan1 = new Scanner(System.in);
            int id = scan1.nextInt();
        	
        	System.out.print("¬ведите им€: ");
            Scanner scan2 = new Scanner(System.in);
            String first = scan2.nextLine();
            
            System.out.print("¬ведите фамилию: ");
            Scanner scan3 = new Scanner(System.in);
            String last = scan3.nextLine();
           
            System.out.print("¬ведите год рождени€: ");
            Scanner scan4 = new Scanner(System.in);
            int date = scan4.nextInt();
            
            System.out.print("¬ведите факультет: ");
            Scanner scan5 = new Scanner(System.in);
            String faculty = scan5.nextLine();
            
            System.out.print("¬ведите курс: ");
            Scanner scan6 = new Scanner(System.in);
            int course = scan6.nextInt();
            
            System.out.print("¬ведите группу: ");
            Scanner scan7 = new Scanner(System.in);
            int group = scan7.nextInt();
            
            students[i] = new Student(id, first, last, date, faculty, course, group);
        }

        System.out.print("¬ведите факультет: ");
        Scanner scan8 = new Scanner(System.in);
        String f = scan8.nextLine();
        for (int i = 0; i < n; i++) {
           // if(student[i]==f) {
            	
            //}
        }
        
        // insertion sort students in ascending order of section
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (students[j].less(students[j-1])) {
                    Student swap  = students[j];
                    students[j]   = students[j-1];
                    students[j-1] = swap;
                }
            }
        }

        // print results
        for (int i = 0; i < n; i++) {
        	System.out.println(students[i]);
        }
    }

}
