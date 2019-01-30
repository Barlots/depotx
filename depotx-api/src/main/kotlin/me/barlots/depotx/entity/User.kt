package me.barlots.depotx.entity

import javax.persistence.*

@Table
@Entity
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    var id: Long = 0

    @Column(name = "Content", nullable = true)
    var content: String? = null
}