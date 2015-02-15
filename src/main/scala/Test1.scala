/**
 * Created by bigbully on 15/2/5.
 */
object Test1 extends App{
  def makeWordMap(sentences: List[String]):
  Map[String, List[String]] = {

    val initMap = Map.empty[String, List[String]]

    sentences.foldLeft(initMap) { (map1, sentence) =>
      words(sentence).foldLeft(map1) { (map2, word) =>
        map2 +
          (word -> (sentence :: map2.getOrElse(word, Nil)))
      }
    }
  }

  def words(sentence:String):List[String] = sentence.split(" ").toList

  val sentences = List(
    "This is the first sentence.",
    "This is the second sentence.",
    "This is the third sentence.")

  val wordMap = makeWordMap(sentences)
  println(wordMap)
}
