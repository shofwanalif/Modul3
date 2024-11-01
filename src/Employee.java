public class Employee {
    // Atribut (property) dari kelas Employee
    public String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private double salary;
    private String department;


    private static final double BONUS_RATE = 0.1; // Konstanta bonus

    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    // Metode untuk menampilkan detail karyawan
    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
    public void applyBonus() {
        salary += calculateBonus();
        System.out.println("Bonus applied! New salary: " + salary);
    }

    private double calculateBonus() {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void updateDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department updated to: " + department);
    }
}

class Project {
    // Atribut (properti) dari kelas Project
    private String projectName;
    private String projectDeadline;
    private Employee projectLeader;
    private double budget;

    // Konstruktor untuk menginisialisasi objek Project
    public Project(String projectName, String projectDeadline, Employee projectLeader, double budget) {
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
        this.projectLeader = projectLeader;
        this.budget = budget;
    }

    // Metode untuk menampilkan detail proyek
    public void printProjectDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Deadline: " + projectDeadline);
        System.out.println("Project Leader: " + projectLeader.name); // Asumsikan Employee memiliki atribut name
        System.out.println("Budget: " + budget);
    }

    // Metode untuk memperbarui anggaran proyek
    public void updateBudget(double newBudget) {
        budget = newBudget;
        System.out.println("Budget updated to: " + budget);
    }
}

class Client {
    // Atribut (properti) dari kelas Client
    private String clientName;
    private String clientEmail;
    private Project project;

    // Konstruktor untuk menginisialisasi objek Client
    public Client(String clientName, String clientEmail, Project project) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.project = project;
    }

    // Metode untuk menampilkan detail klien
    public void printClientDetails() {
        System.out.println("Client Name: " + clientName);
        System.out.println("Client Email: " + clientEmail);
        project.printProjectDetails(); // Memanggil metode printProjectDetails dari objek Project
    }
}

