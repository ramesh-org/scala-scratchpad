package http4s.service

import org.http4s.server.blaze._
// import org.http4s.server.blaze._
import org.http4s.util.ProcessApp
// import org.http4s.util.ProcessApp
import scalaz.concurrent.Task
// import scalaz.concurrent.Task
import scalaz.stream.Process
// import scalaz.stream.Process
object Main extends ProcessApp {
  override def process(args: List[String]): Process[Task, Nothing] = {
    BlazeBuilder
      .bindHttp(8080, "localhost")
      .mountService(HelloWorldService.helloWorldService, "/")
      .mountService(TweetService.tweetService, "/api")
      .serve
  }
}