package me.barlots.depotx.entity

import javax.persistence.*
import javax.persistence.Entity

@Table
@Entity
class User : DatabaseEntity() {
    @Column(name = "Content", nullable = true)
    var content: String? = null
}