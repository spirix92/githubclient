package com.selen.githubclient.model

import io.reactivex.rxjava3.core.Observable

/**
 * @author Pyaterko Aleksey
 */
class GithubUsersRepo {
    private val repositories = listOf(
        GithubUser("login1"),
        GithubUser("login2"),
        GithubUser("login3"),
        GithubUser("login4"),
        GithubUser("login5")
    )

    fun getObservableUsers(): Observable<GithubUser> {
        return Observable.fromIterable(repositories)
    }
}
