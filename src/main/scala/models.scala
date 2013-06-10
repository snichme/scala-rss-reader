import java.net.URL
import java.util.{Locale, Date}

case class RssUrl(url:URL) {
  override def toString = "RSS: " + url.toString
}

trait RssFeed {
  val link:String
  val title:String
  val desc:String
  val items:Seq[RssItem]
  override def toString = title + "\n" + desc + "\n**"

  def latest = items sortWith ((a, b) => a.date.compareTo(b.date) > 0) head
}

case class AtomRssFeed(title:String, link:String, desc:String, items:Seq[RssItem]) extends RssFeed
case class XmlRssFeed(title:String, link:String, desc:String, language:String, items:Seq[RssItem]) extends RssFeed

case class RssItem(title:String, link:String, desc:String, date:Date, guid:String) {
  override def toString = date + " " + title
}
