// import org.springframework.jdbc.datasource._
// import org.springframework.jdbc.core.simple._
// import com.twitter.querulous.evaluator.QueryEvaluator
import scala.slick.driver.H2Driver.simple._
import Database.threadLocalSession

/** 
 * Compares a reference and compare db and stated the differences between them. 
 */ 
object SqlServerCompare {

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