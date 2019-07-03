package bg.plus500.trading.tradeitems

import bg.plus500.trading.models.TradeItem

class TradeItemsGenerator {
    companion object {
        fun getTradeItems(): List<TradeItem> {
            return listOf(
                TradeItem("EUR/GBP", "0.89199", "0.89212", "0.15%", true),
                TradeItem("USD/CAD", "1.29059", "1.29072", "-0.57%", true),
                TradeItem("EUR/USD", "1.23938", "1.23944", "0.47%", true),
                TradeItem("BTC/USD (Kraken)", "10,935.85", "10,985.85", "-3.96%", true),
                TradeItem("Gold", "1,331.38", "1,331.63", "0.88%", false),
                TradeItem("USD/CAD", "1.29059", "1.29072", "-0.57%", true),
                TradeItem("EUR/GBP", "0.89199", "0.89212", "0.15%", true),
                TradeItem("USD/CAD", "1.29059", "1.29072", "-0.57%", true),
                TradeItem("EUR/USD", "1.23938", "1.23944", "0.47%", true),
                TradeItem("BTC/USD (Kraken)", "10,935.85", "10,985.85", "-3.96%", true),
                TradeItem("Gold", "1,331.38", "1,331.63", "0.88%", false),
                TradeItem("USD/CAD", "1.29059", "1.29072", "-0.57%", true)
                )
        }
    }
}