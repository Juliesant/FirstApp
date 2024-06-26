package com.julia.firstapp.service.model

import android.net.ipsec.ike.IkeDerAsn1DnIdentification
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pessoa")
data class Pessoa(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var nome: String = "",
    var idade: Int = 0
)
