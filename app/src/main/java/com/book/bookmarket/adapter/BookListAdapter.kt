package com.book.bookmarket.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.book.bookmarket.BookDetails
import com.book.bookmarket.MainActivity
import com.book.bookmarket.R
import com.book.bookmarket.databinding.BookListItemLayoutBinding
import com.book.bookmarket.model.Book
import com.bumptech.glide.Glide

class BookListAdapter() :

    RecyclerView.Adapter<BookListAdapter.BookHolder>() {
    var imageClickListener: (String,Int) -> Unit = { _,_-> }
    val booklist: ArrayList<Book> = arrayListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookListAdapter.BookHolder {
        val binding =
            BookListItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BookHolder(binding)
    }

    override fun onBindViewHolder(holder: BookListAdapter.BookHolder, position: Int) {
        holder.bind(booklist[position])
    }

    override fun getItemCount(): Int {
        return booklist.size
    }

    inner class BookHolder(private val binding: BookListItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Book) {
            binding.apply {
                tvBookName.text = book.bookName
                tvBookPrice.text = tvBookPrice.context.getString(R.string.book_price, book.bookPrice)
                Glide.with(imageView.context)
                    .load(book.bookImage)
                    .into(imageView)
                imageView.setOnClickListener {
                    imageClickListener(book.bookName,book.bookPrice)



                }
            }
        }
    }

    fun veriyiGetir(bookListData: ArrayList<Book>) {
        booklist.clear()
        booklist.addAll(bookListData)
        notifyDataSetChanged()
    }
}