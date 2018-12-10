package http4s.service
import org.http4s._, org.http4s.dsl._
// import org.http4s._
// import org.http4s.dsl._
object HelloWorldService {
  val helloWorldService = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(s"Hello, $name.")
  }
}
