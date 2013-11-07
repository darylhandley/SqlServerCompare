// import org.springframework.jdbc.datasource._
// import org.springframework.jdbc.core.simple._
// import com.twitter.querulous.evaluator.QueryEvaluator
import scala.slick.driver.H2Driver.simple._
import Database.threadLocalSession

/** 
 * Compares a reference and compare db and stated the differences between them. 
 */ 
object SqlServerCompare {

 //  def createSimpleJdbcTemplate(url: String, user: String, password: String) : SimpleJdbcTemplate = {
 //  	val datasource = new DriverManagerDataSource
 //  	datasource.setDriverClassName("net.sourceforge.jtds.jdbc.Driver")
 //  	datasource.setUrl(url)
 //  	datasource.setUsername(user)
 //  	datasource.setPassword(password)

 //  	return new SimpleJdbcTemplate(datasource)

 // //  		<bean id="dataSource"
	// // 	class="org.springframework.jdbc.datasource.DriverManagerDataSource">
 
	// // 	<property name="driverClassName" value="com.mysql.jdbc.Driver" />
	// // 	<property name="url" value="jdbc:mysql://localhost:3306/mkyongjava" />
	// // 	<property name="username" value="root" />
	// // 	<property name="password" value="password" />
	// // </bean>



 //  }

  def main(args: Array[String]) = {

  	println("Starting compare.")

  	val stuff = "somestuff"
  	println("connecting to reference db stuff=${stuff}")
  	println(f"connecting to reference db stuff = $stuff, ")
  	println(s"connecting to reference db stuff = $stuff, ")

  	val db = Database.forURL(
  		"jdbc:jtds:sqlserver://192.168.1.229:1433/omega_3.2z", 
  		driver = "net.sourceforge.jtds.jdbc.Driver", 
  		user = "admin_all", 
  		password= "admin_all")


	db withSession {
  		
	}

	println("Hello")









  }
}