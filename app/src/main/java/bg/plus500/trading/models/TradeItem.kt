package bg.plus500.trading.models

data class TradeItem(val title: String,
                     val sellPrice: String,
                     val buyPrice: String,
                     val diffPrice: String,
                     val isPair: Boolean)
