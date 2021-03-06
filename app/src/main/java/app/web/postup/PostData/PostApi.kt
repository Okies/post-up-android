package app.web.postup.PostData

import app.web.postup.PostResponseModel
import app.web.postup.RetrofitCreator
import io.reactivex.Observable
import retrofit2.http.GET

class PostApi{
    interface getPostListApiImpl {
        @GET("/pupost")
        fun getPostList(): Observable<PostResponseModel>
    }

    companion object {
        fun getPostList(): Observable<PostResponseModel> {
            return RetrofitCreator.create(getPostListApiImpl::class.java)
                .getPostList()
        }
    }

}
