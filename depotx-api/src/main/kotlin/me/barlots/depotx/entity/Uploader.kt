package me.barlots.depotx.entity

import javax.persistence.*

@Table
@Entity
class Uploader : DatabaseEntity() {

    @Column(unique = true)
    var apiKey: String = ""

    @Column(nullable = false)
    var name: String = ""

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    var user: User? = null
}