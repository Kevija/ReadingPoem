import scala.io.Source

object Util {

  def getTextFromFile(src: String):String = {
    val bufferedSource = Source.fromFile(src) //think of bufferedSource as a stream of bytes
    val text = bufferedSource.mkString //we convert this stream into actual string
    bufferedSource.close() //important to close the file
    text
  }


  def getLinesFromFile(src: String):Array[String] = {
    val bufferedSource = Source.fromFile(src)
    val lines = bufferedSource.getLines().toArray
    bufferedSource.close()
    lines
  }
}
