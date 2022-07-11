package br.com.zup.desafiorickandmortyemsimcity.data.model



import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "characters")
data class PersonagensResult(

    @SerializedName("id")
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0,

    @SerializedName("created")
    var created: String = "",

//    @SerializedName("episode")
//    val episode: List<String> ,

    @SerializedName("gender")
    var gender: String = "",


    @SerializedName("image")
    var image: String = "",

//    @SerializedName("location")
//    val location: Location,

    @SerializedName("name")
    var name: String = "",

//    @SerializedName("origin")
//    val origin: Origin,

    @SerializedName("species")
    var species: String = "",

    @SerializedName("status")
    var status: String = "",

    @SerializedName("type")
    var type: String = "",

    @SerializedName("url")
    var url: String = "",

    var isFavorite : Boolean
):Parcelable