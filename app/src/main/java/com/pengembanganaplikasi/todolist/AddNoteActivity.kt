package com.pengembanganaplikasi.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pengembanganaplikasi.todolist.databinding.ActivityAddNoteBinding
import com.pengembanganaplikasi.todolist.data.Note
import com.pengembanganaplikasi.todolist.data.NoteDatabaseHelper

class AddNoteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddNoteBinding
    private lateinit var db : NoteDatabaseHelper
    //private lateinit var addButton : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_note)
        binding = ActivityAddNoteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //addButton = findViewById(R.id.saveButton)
        db = NoteDatabaseHelper(this)
        binding.saveButton.setOnClickListener{
            val title = binding.titleEditText.text.toString()
            val content = binding.contentEditText.text.toString()
            val note = Note(0, title, content)
            db.inserNote(note)
            finish()
            Toast.makeText(this, "Catatan berhasil di simpan", Toast.LENGTH_SHORT).show()

        }
    }
}