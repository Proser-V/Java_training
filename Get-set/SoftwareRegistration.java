/**
 * Apprentissage sur les accesseurs:
 *      getters : accès à un attribut (lecture)
 *      setters : modification d'un attribut
 */

import java.time.LocalDate;

public class SoftwareRegistration
{
    public SoftwareRegistration(LocalDate expiration, String name)
    {
        LocalDate now = LocalDate.now();

        if(productNumberOfRegistration > 0)
        {
            this.productExpirationDate = expiration;
            this.productName = name;
            if(this.productExpirationDate.compareTo(now) >= 0)
            {
                productNumberOfRegistration--;
            }
            System.out.println("Enregistrement(s) restant(s) : " + productNumberOfRegistration);
        }
        else
        {
            this.productExpirationDate = expiration;
            this.productName = name;
            if(this.productExpirationDate.compareTo(now) >= 0)
            {
                productNumberOfRegistration--;
            }
            System.out.println("Aucun enregistrement restant.");
        }
    }

    public LocalDate getproductExpirationDate()
    {
        return this.productExpirationDate;
    }
    public void setproductExpirationDate(LocalDate expiration)
    {
        this.productExpirationDate = expiration;
    }

    public String getproductName()
    {
        return this.productName;
    }
    public void setproductName(String newname)
    {
        return;
    }

    public static int getproductNumberOfRegistration()
    {
        return productNumberOfRegistration;
    }
    public static void setproductNumberOfRegistration(int newnumber)
    {
        return;
    }

    private static int productNumberOfRegistration = 6;
    private String productName;
    private LocalDate productExpirationDate;
}