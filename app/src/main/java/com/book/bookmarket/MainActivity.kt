package com.book.bookmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.book.bookmarket.adapter.BookListAdapter
import com.book.bookmarket.databinding.ActivityMainBinding
import com.book.bookmarket.model.Book

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var booklist : ArrayList<Book> = arrayListOf()
    private var adapter = BookListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        booklist.add(Book("Hayvan Çiftliği",25,"https://i.dr.com.tr/cache/600x600-0/originals/0000000105409-1.jpg"))
        booklist.add(Book("1984",34,"https://i.dr.com.tr/cache/600x600-0/originals/0000000064038-1.jpg"))
        booklist.add(Book("Cesur Yeni Dünya",34,"https://i.dr.com.tr/cache/600x600-0/originals/0000000066424-1.jpg"))
        booklist.add(Book("50 Soruda Evrim",32,"https://i.dr.com.tr/cache/500x400-0/originals/0001896416001-1.jpg"))
        booklist.add(Book("Tanzimat",56,"https://m.media-amazon.com/images/I/51Uv3M1JWeL._AC_SY1000_.jpg"))
        booklist.add(Book("Maymunlar Gezegeni",28,"https://img.kitapyurdu.com/v1/getImage/fn:11240119/wh:true/miw:200/mih:200"))

        //binding.rvBookList.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvBookList.layoutManager = GridLayoutManager(this,2)//Grid şeklinde hizalama yapıldı
        binding.rvBookList.adapter = adapter

        adapter.veriyiGetir(booklist)

        adapter.imageClickListener = {
            val intent = Intent(applicationContext,BookDetails::class.java)
            startActivity(intent)
        }

    }
}