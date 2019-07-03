package bg.plus500.trading.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import bg.plus500.trading.R
import bg.plus500.trading.tradeitems.TradeItemsGenerator
import bg.plus500.trading.tradeitems.TradeItemsRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.offer_layout.*

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private var adapter: TradeItemsRecyclerAdapter =
        TradeItemsRecyclerAdapter(TradeItemsGenerator.getTradeItems());

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        tradeItems.layoutManager = linearLayoutManager
        tradeItems.adapter = adapter
    }
}
