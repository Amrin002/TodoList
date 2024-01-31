package com.pengembanganaplikasi.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pengembanganaplikasi.todolist.databinding.ActivityAddNoteBinding

class ProfilActivity : AppCompatActivity() {
    private lateinit var binding : ActivityAddNoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}