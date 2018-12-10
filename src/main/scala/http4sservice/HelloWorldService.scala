package http4sservice

import org.http4s.dsl.{->, /, GET, Ok, Root}

 import org.http4s._
 import org.http4s.dsl._
object HelloWorldService {
  val helloWorldService = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(s"Hello, $name.")
  }
}
