package sit.int202.classicmodels;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sit.int202.classicmodels.entities.Office;

import java.util.Scanner;

public class TestJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        System.out.print("Find Office by office-code: ");
        String X = new Scanner(System.in).next();
        Office office = em.find(Office.class, X);
        if (office==null) {
            System.out.println("Office no "+ X + "does not exists!");
            Office newOffice = new Office();
            newOffice.setOfficeCode(X);
            newOffice.setAddressLine1("126 Pracha-Utit");
            newOffice.setCity("Bangkok");
            newOffice.setCountry("Thailand");
            newOffice.setPhone("02-470-9872");
            newOffice.setPostalCode("10140");
            newOffice.setTerritory("XX");
            em.getTransaction().begin();
            em.persist(newOffice);
            em.getTransaction().commit();
        } else {
            System.out.println(office);
            System.out.println("Do you want to delete office no "+ X + "? (Y/N) ?");
            String answer = new Scanner(System.in).next();
            if (answer.equalsIgnoreCase("y")){
                em.getTransaction().begin();
                em.persist(office);
                em.getTransaction().commit();
                System.out.println("Office no "+ X + "has been removed !");
            }
        }
        em.close();
        emf.close();
    }
}
