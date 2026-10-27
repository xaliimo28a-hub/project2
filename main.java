//package ch2;
//    class Employee{
//        String EmployeeId;
//        String name;
//        String Department;
//        Double basicSalary;
//
//        Employee(String EmployeeId, String name, String Department, double basicSalary){
//            this.EmployeeId=EmployeeId;
//            this.name=name;
//            this.Department=Department;
//        }
//
//        double calculateSalary(){
//            return basicSalary;
//
//        }
//    }
//
//    String getCategory() {
//
//        return "Employee";
//
//    }
//
//    void displayInfo() {
//
//        System.out.println("Employee ID: " + EmployeeId);
//
//        System.out.println("Name: " + name);
//
//        System.out.println("Category: " + getCategory());
//
//        System.out.printf("Monthly Salary: $%.2f%n",
//
//                calculateSalary());
//
//        System.out.println();
//
//    }
//
//}
//
//    class FullTimeEmployee extends Employee {
//
//        double allowance;
//
//        FullTimeEmployee(String id, String name, String dept,
//
//                         double salary, double allowance) {
//
//            super(id, name, dept, salary);
//
//            this.allowance = allowance;
//
//        }
//
//        @Override
//
//        double calculateSalary() {
//
//            return basicSalary + allowance;
//
//        }
//
//        @Override
//
//        String getCategory() {
//
//            return "Full-Time Employee";
//
//        }
//
//    }
//
//    class PartTimeEmployee extends Employee {
//
//        double hoursWorked;
//
//        double hourlyRate;
//
//        PartTimeEmployee(String id, String name, String dept,
//
//                         double salary, double hours, double rate) {
//
//            super(id, name, dept, salary);
//
//            hoursWorked = hours;
//
//            hourlyRate = rate;
//
//        }
//
//        @Override
//
//        double calculateSalary() {
//
//            return hoursWorked * hourlyRate;
//
//        }
//
//        @Override
//
//        String getCategory() {
//
//            return "Part-Time Employee";
//
//        }
//
//    }
//
//    class Manager extends Employee {
//
//        double bonus;
//
//        Manager(String id, String name, String dept,
//
//                double salary, double bonus) {
//
//            super(id, name, dept, salary);
//
//            this.bonus = bonus;
//
//        }
//
//        @Override
//
//        double calculateSalary() {
//
//            return basicSalary + bonus;
//
//        }
//
//        @Override
//
//        String getCategory() {
//
//            return "Manager";
//
//        }
//
//    }
//
//    public class Main {
//
//        public static void main(String[] args) {
//
//            Employee[] employees = {
//
//                    new FullTimeEmployee(
//
//                            "EMP001", "Ahmed Ali", "IT", 500, 150),
//
//                    new PartTimeEmployee(
//
//                            "EMP002", "Fatima Hassan", "HR", 0, 30, 8),
//
//                    new Manager(
//
//                            "EMP003", "Mohamed Omar", "Management",
//
//                            1000, 200)
//
//            };
//
//            System.out.println(" EMPLOYEE SALARY REPORT ");
//
//            System.out.println();
//
//            for (Employee e : employees) {
//
//                e.displayInfo();
//
//            }
//
//        }
//
//    }
//
//    }
//
//public class main {
//}
