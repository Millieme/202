package sit.int202.classicmodels;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import sit.int202.classicmodels.entities.Employee;
import sit.int202.classicmodels.entities.Environment;

import java.util.List;
import java.util.Scanner;

public class TestQueryPagination {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory(Environment.PU_NAME);
//        EntityManager em = emf.createEntityManager();
//        Query query = em.createNamedQuery("E.FIND_ALL");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Please enter number of item per page: ");
//        int pageSize = sc.nextInt();
//        int startAt = 0;
//        query.setMaxResults(pageSize);
//        while (true){
//            query.setFirstResult(startAt);
//            List<Employee> employeeList = query.getResultList();
//            if (employeeList.isEmpty()){
//                break;
//            }
////            displayEmployee(employeeList);
//            System.out.println("Enter any key than enter to view next page...");
//            sc.next();
//            startAt = startAt + pageSize;
//        }
    }

//    private static void displayEmployee(List<Employee> employeeList) {
//        for (Employee e : employeeList){
//            System.out.printf("%4d %-12s %-12s %s\n",
//                    e.getEmployeeNumber(), e.getFirstName(), e.getLastName(), e.getJobTitle());
//        }
//        System.out.println("---------------------------------");
//    }
}
