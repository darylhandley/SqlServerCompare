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
		

 //  	val refSjt = createSimpleJdbcTemplate(
 //  		"jdbc:jtds:sqlserver://192.168.1.229:1433/omega_3.19", 
 //  		"username", 
 //  		"password"
	// )


	// val count = refSjt.queryForInt("select count(*) from sys.objects")
	// println("Counted " + count + " objects in sys.objects")


	// val compSjt = createSimpleJdbcTemplate(
 //  		"jdbc:jtds:sqlserver://192.168.1.229:1433/daryl_auto_test", 
 //  		"username", 
 //  		"password"
	// )


	// val count1 = compSjt.queryForInt("select count(*) from sys.objects")
	// println("Counted " + count1 + " objects in sys.objects")



	// val refObjects = refSjt.queryForList("select * from sys.objects")
	// refObjects.each { row => 
	// 	println(row.get("name"))
	// }

	// val queryEvaluator = QueryEvaluator("jdbc:jtds:sqlserver://192.168.1.229:1433/omega_3.19", "username", "password")
	// val queryEvaluator = QueryEvaluator("192.168.1.229", "username", "password")

	println("Hello")









  }
}