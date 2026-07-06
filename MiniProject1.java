public class MiniProject1 {

    public static void main(String[] args) {
        // Check if an employee ID was provided via command line
        if (args.length == 0) {
            System.out.println("Please provide an Employee ID as a command line argument.");
            return;
        }

        // Target Employee ID from the command prompt
        String searchEmpNo = args[0];

        // 1. Initialize arrays with the provided data from image 24e659bf-49e5-4a4a-8b5e-85e5d1a93b46
        String[] empNo = {"1001", "1002", "1003", "1004", "1005", "1006", "1007"};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {0, 0, 0, 0, 0, 0, 0}; // Initialized to 0 as IT is not explicitly provided in the table

        // Find the index of the requested Employee ID
        int empIndex = -1;
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i].equals(searchEmpNo)) {
                empIndex = i;
                break;
            }
        }

        // If employee is not found, display the error message as shown in image e3580b32-13b9-4ad4-b823-62e8261b44ba
        if (empIndex == -1) {
            System.out.println("There is no employee with empid : " + searchEmpNo);
            return;
        }

        // 2. Fetch specific Designation and DA using switch-case as requested in Note 2
        String designation = "";
        int da = 0;

        switch (designationCode[empIndex]) {
            case 'e':
                designation = "Engineer";
                da = 20000;
                break;
            case 'c':
                designation = "Consultant";
                da = 32000;
                break;
            case 'k':
                designation = "Clerk";
                da = 12000;
                break;
            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;
            case 'm':
                designation = "Manager";
                da = 40000;
                break;
            default:
                designation = "Unknown";
                da = 0;
                break;
        }

        // 3. Calculate salary based on Note 1: (Basic + HRA + DA - IT)
        int salary = basic[empIndex] + hra[empIndex] + da - it[empIndex];

        // 4. Print the output exactly formatted as per the instructions
        System.out.printf("%-10s %-12s %-12s %-15s %-10s%n", "Emp No.", "Emp Name", "Department", "Designation", "Salary");
        System.out.printf("%-10s %-12s %-12s %-15s %-10d%n", 
                empNo[empIndex], empName[empIndex], department[empIndex], designation, salary);
    }
}