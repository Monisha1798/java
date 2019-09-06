package comm.example.spring.form;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;
@Component("dataSource")
public class BasicDataSource extends org.apache.commons.dbcp.BasicDataSource{
  
	
	@PostConstruct
	public void create()
	{
		setUrl("jdbc:mysql://localhost:3306/mysql");
		setUsername("root");
		setPassword("pass@word1");
		setDriverClassName("com.mysql.jdbc.Driver");
	}
	
}
