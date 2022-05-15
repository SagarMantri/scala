import scala.io.Source

object demoread {
	def main(args: Array[String]): Unit= {
		val filename = "Scala_test.csv"
		Source.fromFile(filename).foreach{
		print
		}
	}
}