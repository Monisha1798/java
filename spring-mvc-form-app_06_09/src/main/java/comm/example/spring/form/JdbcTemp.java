package comm.example.spring.form;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import comm.example.spring.form.BasicDataSource;
@Component(value="jTemplate")
public class JdbcTemp extends JdbcTemplate{

	@Autowired
	BasicDataSource dSource;
	@PostConstruct
	public void init()
	{
		setDataSource(dSource);
	}
	
	/*public Connection getConnection()throws SQLException
	{
		return dSource.getConnection(dSource.getUsername(),dSource.getPassword());
	}*/
}