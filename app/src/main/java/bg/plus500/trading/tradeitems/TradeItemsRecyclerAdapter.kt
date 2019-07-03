package bg.plus500.trading.tradeitems

import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import bg.plus500.trading.R
import bg.plus500.trading.extensions.inflate
import bg.plus500.trading.models.TradeItem
import kotlinx.android.synthetic.main.trading_pairs_item_row.view.*

class TradeItemsRecyclerAdapter(private val tradeItems: List<TradeItem>) :
    RecyclerView.Adapter<TradeItemsRecyclerAdapter.ViewHolder>() {

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            // Clicking inside each row does nothing
        }

        fun bindTradeItem(tradeItem: TradeItem) {
            // Sell/Buy button clicks are not connected
            view.title.text = tradeItem.title
            view.sellPrice.text = tradeItem.sellPrice
            view.buyPrice.text = tradeItem.buyPrice
            view.diffPrice.text = tradeItem.diffPrice
            // Change the sell/buy price if this is a pair TradeItem or not
            if (tradeItem.isPair) {
                view.sellPrice.setTextColor(view.context.resources.getColor(R.color.colorRed))
                view.buyPrice.setTextColor(view.context.resources.getColor(R.color.colorRed))
            } else {
                view.sellPrice.setTextColor(view.context.resources.getColor(R.color.colorGray))
                view.buyPrice.setTextColor(view.context.resources.getColor(R.color.colorGray))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = parent.inflate(R.layout.trading_pairs_item_row, false)
        return ViewHolder(inflatedView)
    }

    override fun getItemCount() = tradeItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindTradeItem(tradeItems[position])
    }

}