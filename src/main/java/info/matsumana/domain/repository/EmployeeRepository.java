package info.matsumana.domain.repository;

import info.matsumana.RepositoryConfig;
import info.matsumana.domain.model.Employee;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;

@Dao
@RepositoryConfig
public interface EmployeeRepository {
    @Select
    Employee findById(Integer employeeId);
}
