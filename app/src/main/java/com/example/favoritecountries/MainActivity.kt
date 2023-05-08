package com.example.favoritecountries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: CountryAdapter
    private val countries = listOf(
        Country("Hong Kong", "A bustling city with skyscrapers, street markets, and delicious food."),
        Country("Singapore", "A small island nation known for its cleanliness, efficiency, and diverse culture."),
        Country("France", "Home to the Eiffel Tower, the Louvre museum, and a rich history of art and culture."),
        Country("Switzerland", "A picturesque country known for its mountains, lakes, and delicious chocolate."),
        Country("Italy", "Famous for its art, architecture, and delicious cuisine."),
        Country("Vatican", "The smallest independent state in the world, home to the Pope and many historic landmarks."),
        Country("USA", "Well-known country in the world, having one of the largest military force in the world."),
        Country("Netherlands", "Peaceful country, I love the time spending with my sister and my mom seeing 18+ chocolate figures")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = CountryAdapter(countries)
        recyclerView.adapter = adapter
    }
}
