package info.matsumana.domain.model;

import lombok.ToString;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Version;
import org.seasar.doma.jdbc.entity.NamingType;

import java.math.BigDecimal;
import java.util.Date;

@Entity(naming = NamingType.SNAKE_UPPER_CASE)
@ToString
public class Employee {
    @Id
    public Integer employeeId;
    public String employeeName;
    public Date hiredate;
    public BigDecimal salary;
    @Version
    public Integer versionNo;
}
