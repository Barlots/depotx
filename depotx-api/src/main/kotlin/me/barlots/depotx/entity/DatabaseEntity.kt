package me.barlots.depotx.entity

import javax.persistence.*

@MappedSuperclass
abstract class DatabaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    internal var id: Long? = null
}
