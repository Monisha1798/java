package comm.example.spring.form;

import javax.sql.DataSource;
import org.springframework.stereotype.Component;


import org.springframework.jdbc.core.JdbcTemplate;

@Component(value="sDao")
public class StudentDAO {
	
private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}


	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void createStudent(Student student)
	{
		try {
			
			String query="insert into student(firstname,lastname,country,favlang,os) values(?,?,?,?,?)";
			Object obj[]= {student.getFirstName(),student.getLastName(),student.getCountry(),student.getFavLang(),student.getOperatingSystems()};
			jdbcTemplate.update(query,obj);
			System.out.println("done");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
