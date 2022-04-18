import Util.{getLinesFromFile, getTextFromFile}

object ReadingPoem extends App {

    //TODO read stopping by poem from src/resources/reason.txt
    //TODO get poem name - it is the first line
    //TODO get poet - it is in the 2nd line but we want just the poet
    //TODO Get all lines which contain "heart" somewhere in the text

  println("Let's read my poem!")

  println("*"*40)

  val relativeFilePath = "src/resources/reason.txt"

  val myPoem = getTextFromFile(relativeFilePath)
  println(myPoem)

  println("*"*40)

  val myLines = getLinesFromFile(relativeFilePath)
  val poemName = myLines(0)
  println(poemName)

  println("*"*40)

  val poetName = myLines(1).drop(3)
  println(poetName)

  println("*"*40)

  val heartLines = myLines.filter(_.contains("heart"))
  heartLines.foreach(println)
}
