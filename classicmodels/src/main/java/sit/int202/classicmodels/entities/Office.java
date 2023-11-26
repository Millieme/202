package sit.int202.classicmodels.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "Offices")
@NamedQueries({
        @NamedQuery(name = "OFFICE.FIND_ALL", query = "SELECT o FROM Office o"),
        @NamedQuery(name = "OFFICE.FIND_BY_COUNTRY",
                query = "SELECT o FROM Office o WHERE o.country like :countryParam"),
        @NamedQuery(name = "Office.FIND_BY_CITY_OR_COUNTRY",
                query = "select o from Office o where lower(o.city) like :city or lower(o.country) like :country")
})
@Getter
@Setter
@ToString(exclude = {"territory", "addressLine2", "postalCode"})
public class Office {
    @Id
    private String officeCode;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phone;
    private String territory;

    @OneToMany(mappedBy = "officeCode")
    private List<Employee> employeeList;

}
