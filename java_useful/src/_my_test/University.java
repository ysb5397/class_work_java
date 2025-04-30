package _my_test;

public class University {

    private String name;

    public University(String name) {
        this.name = name;
    }

    Department[] departments = new Department[3];

    public void addDepartment (String departmentName) {


        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) {
                departments[i] = new Department(departmentName);
                break;
            } else {
                continue;
            }
        }

    }

    public void printDepartments() {
        System.out.println("======== 나의 " + name + " 대학교 학과 목록 ========");

        for (int i = 0; i < departments.length; i++) {
            if (departments[i].getName() != null) {
                System.out.println("학과" + (i + 1) + " : " + departments[i].getName());
                break;
            } else {
                continue;
            }
        }
    }

    public class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

class Main {
    public static void main(String[] args) {
        University myUniversity = new University("My University");

        myUniversity.addDepartment("Computer Science");
        myUniversity.addDepartment("Electrical Engineering");
        myUniversity.addDepartment("Mechanical Engineering");

        myUniversity.printDepartments();
    }
}
