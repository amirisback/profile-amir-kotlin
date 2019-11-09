package com.frogobox.faisalamirprofile.view.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.frogobox.faisalamirprofile.R
import com.frogobox.faisalamirprofile.base.BaseFragment
import com.frogobox.faisalamirprofile.model.Product
import com.frogobox.faisalamirprofile.view.adapter.ProductAdapter
import com.frogobox.speechbooster.base.view.BaseRecyclerViewListener
import kotlinx.android.synthetic.main.fragment_product_child.*

class ProductDebugFragment : BaseFragment(), BaseRecyclerViewListener<Product> {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_child, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListView()
    }

    private fun initArrayModel(): MutableList<Product> {

        val arrayProduct: MutableList<Product> = mutableListOf()

        arrayProduct.add(
            Product(
                getString(R.string.product_name_cat),
                R.drawable.ic_product_cat,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)

            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_finpro),
                R.drawable.ic_product_finpro,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_football),
                R.drawable.ic_product_football,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_frogonews),
                R.drawable.ic_product_frogonews,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_jami),
                R.drawable.ic_product_jami,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_movie),
                R.drawable.ic_product_movie,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )

        arrayProduct.add(
            Product(
                getString(R.string.product_name_romis),
                R.drawable.ic_product_romis,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )
        arrayProduct.add(
            Product(
                getString(R.string.product_name_shejek),
                R.drawable.ic_product_shejek,
                R.drawable.ic_product_type_debug,
                getString(R.string.dummy)
            )
        )

        return arrayProduct

    }

    private fun initListView() {

        val adapter = ProductAdapter()
        context?.let { adapter.setRecyclerViewLayout(it, R.layout.item_product) }
        adapter.setRecyclerViewListener(this)
        adapter.setRecyclerViewData(initArrayModel())
        rv_product.adapter = adapter
        rv_product.layoutManager = GridLayoutManager(context, 2)

    }

    override fun onItemClicked(data: Product) {}
    override fun onItemLongClicked(data: Product) {}

}