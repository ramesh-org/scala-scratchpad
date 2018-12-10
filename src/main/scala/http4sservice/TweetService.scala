package http4sservice

import org.http4s.{EntityEncoder, _}
import org.http4s.dsl._
import scalaz.concurrent.Task

object TweetService {
  def tweetEncoder: EntityEncoder[Tweet] = ???
  // tweetEncoder: org.http4s.EntityEncoder[Tweet]

  implicit def tweetsEncoder: EntityEncoder[Seq[Tweet]] = ???
  // tweetsEncoder: org.http4s.EntityEncoder[Seq[Tweet]]

  def getTweet(tweetId: Int): Task[Tweet] = ???
  // getTweet: (tweetId: Int)scalaz.concurrent.Task[Tweet]

  def getPopularTweets(): Task[Seq[Tweet]] = ???
  // getPopularTweets: ()scalaz.concurrent.Task[Seq[Tweet]]

  val tweetService = HttpService {
    case request @ GET -> Root / "tweets" / "popular" =>
      Ok(getPopularTweets())
    case request @ GET -> Root / "tweets" / IntVar(tweetId) =>
      getTweet(tweetId).flatMap(Ok(_)(tweetEncoder))
  }
}