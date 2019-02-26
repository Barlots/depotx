package me.barlots.depotx.entity

import java.util.*
import javax.persistence.Table

@Table
abstract class HostedFile: DatabaseEntity {
    var Name: String
    var Path: String
    var Created: Date

    constructor(name: String, path: String) {
        Name = name
        Path = path
        Created = Date()
    }
}