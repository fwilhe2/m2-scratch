import com.github.fwilhe.inzell.*

fun main() {

    val startInvestment = 10_000
    val anticipatedYearlyValueGain = 0.035

    val sheet = spreadsheet {
        caption("Savings")
        column("Year") { year -> year }
       column("zinseszins") {year -> startInvestment * Math.pow((1+anticipatedYearlyValueGain/100), year.toDouble())}

    }
    // CsvPrinter(sheet).printToStandardOut()
    MarkdownPrinter(sheet).printToStandardOut()
    // HtmlPrinter(sheet).printToStandardOut()
}