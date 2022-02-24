package com.book.bookmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.book.bookmarket.databinding.ActivityMainBinding
import com.book.bookmarket.model.Book

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var booklist : ArrayList<Book> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val kitap1 = Book("Hayvan Çiftliği",25,"https://i.dr.com.tr/cache/600x600-0/originals/0000000105409-1.jpg")
        val kitap2 = Book("1984",34,"https://i.dr.com.tr/cache/600x600-0/originals/0000000064038-1.jpg")
        val kitap3 = Book("Cesur Yeni Dünya",34,"https://i.dr.com.tr/cache/600x600-0/originals/0000000066424-1.jpg")
        val kitap4 = Book("50 Soruda Evrim",32,"https://i.dr.com.tr/cache/500x400-0/originals/0001896416001-1.jpg")
        val kitap5 = Book("Tanzimat",56,"https://m.media-amazon.com/images/I/51Uv3M1JWeL._AC_SY1000_.jpg")
        val kitap6 = Book("Maymunlar Gezegeni",28,"https://img.kitapyurdu.com/v1/getImage/fn:11240119/wh:true/miw:200/mih:200")

        booklist.add(kitap1)
        booklist.add(kitap2)
        booklist.add(kitap3)
        booklist.add(kitap4)
        booklist.add(kitap5)
        booklist.add(kitap6)




    }
}