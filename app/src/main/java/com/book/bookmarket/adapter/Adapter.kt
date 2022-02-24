package com.book.bookmarket.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.book.bookmarket.databinding.BookListItemLayoutBinding
import com.book.bookmarket.model.Book
import com.bumptech.glide.Glide

class Adapter(val booklist : ArrayList<Book>) : RecyclerView.Adapter<Adapter.BookHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.BookHolder {
            val binding = BookListItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return BookHolder(binding)
        }

        override fun onBindViewHolder(holder: Adapter.BookHolder, position: Int) {
            holder.bind(booklist[position])
        }

        override fun getItemCount(): Int {
            return booklist.size
        }

        inner class BookHolder(private val binding: BookListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
                fun bind(book: Book) {
                    binding.apply {
                        tvBookName.text = book.bookName
                        tvBookPrice.text = book.bookPrice.toString()
                        Glide.with(imageView.context)
                            .load(book.bookImage)
                            .into(imageView)
                    }
                }
    }
}