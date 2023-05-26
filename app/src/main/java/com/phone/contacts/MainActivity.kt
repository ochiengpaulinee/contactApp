package com.phone.contacts
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.phone.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
       val cont1=ContactData("","Pauline","0112065276")
        val cont2=ContactData("","Brenda","0114568789")
        val cont3=ContactData("","Brian","0724765879")
        val contactList= listOf(cont1,cont2,cont3)
        val tvAdapter=ContactAdapter(contactList)
//        binding.rvContacts.layoutManager=LinearLayoutManager(this)
//        binding.rvContacts.adapter=tvAdapter
    }
}














