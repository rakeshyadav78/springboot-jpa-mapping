package com.rakesh.jpamap.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakesh.jpamap.entity.Employee;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from empployee where id_emp=?1", nativeQuery = true)
	Optional<Employee> getById(int id);

	@Query(value = "select * from empployee", nativeQuery = true)
	List<Employee> getAllEmployee();

	@Query(value = "select * from empployee where id_emp=:id", nativeQuery = true)
	Employee getEmpById(@Param("id") Integer id);

	@Modifying(clearAutomatically = true)
	@Query(value = "update empployee set address=?1, age=?2, email=?3, fname=?4, gender=?5, lname=?6, mob_num=?7 where id_emp=?8", nativeQuery = true)
	int updateEmpById(String address, String age, String email, String fname, String gender, String lname,
			String mobNum, Integer id_emp);

	@Modifying(clearAutomatically = true)
	@Query(value = "delete from empployee where id_emp=?1", nativeQuery = true)
	int deletById(Integer idEmp);
}
