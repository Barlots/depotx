package me.barlots.depotx.service

import me.barlots.depotx.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.awt.Image
import java.awt.image.BufferedImage
import javax.imageio.ImageIO

@Service
class FileService {

    @Autowired
    lateinit var userRepository: UserRepository

    fun say(msg: String) = "Service said: $msg"

    //temporary functionality
    fun handleImage(multipart: MultipartFile): String {
        var extension = getExtension(multipart.name);

        if (extension != ".png" && extension != ".jpg") {
            throw UnsupportedOperationException("Unsupported extension: $extension")
        }

        var fullsize = ImageIO.read(multipart.inputStream)
        var thumbnail = generateThumbnail(fullsize);

        var sizeRatio = thumbnail.getHeight(null) * 100 * thumbnail.getWidth(null) / fullsize.getHeight(null) / fullsize.getWidth(null)

        return "thumnail is $sizeRatio% size of original image"
    }

    private fun generateThumbnail(fullsize: BufferedImage): Image {
        var tmp = fullsize.getScaledInstance(100, 100, Image.SCALE_SMOOTH)
        var thumbnail = BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB)

        var g2d = thumbnail.createGraphics()
        g2d.drawImage(tmp, 0, 0, null)
        g2d.dispose()

        return thumbnail
    }

    private fun getExtension(filename: String) = filename.substring(filename.lastIndexOf('.') + 1)
}