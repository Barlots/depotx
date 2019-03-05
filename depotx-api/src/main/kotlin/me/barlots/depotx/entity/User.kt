package me.barlots.depotx.entity

import javax.persistence.*
import javax.persistence.Entity

@Table
@Entity
class User : DatabaseEntity() {
    @Column(nullable = false)
    var userName: String = ""

    @OneToMany(mappedBy = "uploader", fetch = FetchType.EAGER)
    var uploaders: List<Uploader> = emptyList()
}
