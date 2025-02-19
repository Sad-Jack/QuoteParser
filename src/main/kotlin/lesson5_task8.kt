import org.jsoup.Jsoup
import org.jsoup.nodes.Document

const val URL = "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
const val QUOTES_SELECTOR = "article"

fun main() {

    val doc: Document = Jsoup.connect(URL).get()
    doc.select(QUOTES_SELECTOR).forEach {
        println(it.text())
    }
}