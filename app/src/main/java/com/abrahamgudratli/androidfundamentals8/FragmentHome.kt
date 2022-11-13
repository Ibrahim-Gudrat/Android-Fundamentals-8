package com.abrahamgudratli.androidfundamentals8

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

class FragmentHome : Fragment(R.layout.fragment_home) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listOfNews = mutableListOf(
            ItemNews(R.drawable.apple_product_pic, "Apple Product", "Apple Inc. is an American multinational technology company specializing in consumer electronics, software and online services headquartered in Cupertino."),
            ItemNews(R.drawable.fake_information_pic, "Fake Information", "Fake news is false or misleading information presented as news. Fake news often has the aim of damaging the reputation of a person or entity."),
            ItemNews(R.drawable.interview_with_president_pic, "Interview with President", "Interviewing presidents, look for candidates with in-depth industry knowledge and experience as well as strong leadership and motivational skills."),
            ItemNews(R.drawable.new_building_of_ada_university_pic, "New Building of ADA University", "ADA University is a university established under the Ministry of Foreign Affairs of Azerbaijan in March 2006 by Hafiz Pashayev. By the decree of President."),
            ItemNews(R.drawable.new_year_ceremony_picc, "New Year Ceremony", "On the night of 31 December and the morning of 1 January, people in many countries all over the world will celebrate the beginning of a new year."),
            ItemNews(R.drawable.newspaper_sales_pic, "Newspaper Sales", "The total estimated advertising revenue for the newspaper industry in 2020 was 9.6 billion, based on the Center's analysis of financial statements for publicly traded newspaper companies."),
            ItemNews(R.drawable.online_education_picc, "Online Education", "Distance education, also known as distance learning, is the education of students who may not always be physically present at a school."),
        )


//        rvNews.adapter = AdapterNews(listOfNews)
//        rvNews.layoutManager = LinearLayoutManager(activity)
        val newsAdapter = AdapterNews(listOfNews)

        rvNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = newsAdapter
        }


    }




}