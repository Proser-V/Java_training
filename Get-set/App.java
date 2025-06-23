import java.time.LocalDate;

public class App
{
    public static void main(String []args)
    {
        LocalDate now = LocalDate.now();

        SoftwareRegistration product1 = new SoftwareRegistration(LocalDate.of(2028, 3, 15), "No imagination Product name 1");
        if(product1.getproductNumberOfRegistration() >= 0)
        {
            if(product1.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product1.getproductName() + ": La date de validité actuelle est " + product1.getproductExpirationDate());
            }
        }

        SoftwareRegistration product2 = new SoftwareRegistration(LocalDate.of(2025, 12, 15), "No imagination Product name 2");
        if(product2.getproductNumberOfRegistration() >= 0)
        {
            if(product2.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product2.getproductName() + ": La date de validité actuelle est " + product2.getproductExpirationDate());
            }
        }

        SoftwareRegistration product3 = new SoftwareRegistration(LocalDate.of(2024, 6, 14), "No imagination Product name 3");
        if(product3.getproductNumberOfRegistration() >= 0)
        {
            if(product3.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product3.getproductName() + ": La date de validité actuelle est " + product3.getproductExpirationDate());
            }
        }

        SoftwareRegistration product4 = new SoftwareRegistration(LocalDate.of(2026, 9, 25), "No imagination Product name 4");
        if(product4.getproductNumberOfRegistration() >= 0)
        {
            if(product4.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product4.getproductName() + ": La date de validité actuelle est " + product4.getproductExpirationDate());
            }
        }

        SoftwareRegistration product5 = new SoftwareRegistration(LocalDate.of(2027, 2, 1), "No imagination Product name 5");
        if(product5.getproductNumberOfRegistration() >= 0)
        {
            if(product5.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product5.getproductName() + ": La date de validité actuelle est " + product5.getproductExpirationDate());
            }
        }

        SoftwareRegistration product6 = new SoftwareRegistration(LocalDate.of(2032, 10, 18), "No imagination Product name 6");
        if(product6.getproductNumberOfRegistration() >= 0)
        {
            if(product6.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product6.getproductName() + ": La date de validité actuelle est " + product6.getproductExpirationDate());
            }
        }

        SoftwareRegistration product7 = new SoftwareRegistration(LocalDate.of(2030, 10, 18), "No imagination Product name 7");
        if(product7.getproductNumberOfRegistration() >= 0)
        {
            if(product7.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product7.getproductName() + ": La date de validité actuelle est " + product7.getproductExpirationDate());
            }
        }

        SoftwareRegistration product8 = new SoftwareRegistration(LocalDate.of(2029, 11, 22), "No imagination Product name 8");
        if(product8.getproductNumberOfRegistration() >= 0)
        {
            if(product8.getproductExpirationDate().compareTo(now) < 0)
            {
                System.out.println("Le produit a expiré, veuillez le renouveler");
            }
            else
            {
                System.out.println(product8.getproductName() + ": La date de validité actuelle est " + product8.getproductExpirationDate());
            }
        }
    }
}