package example

trait BaseSoundPlayer {
  def play
  def close
  def pause
  def stop
  def resume
}

trait Dog {
  def speak(whatToSay: String)
  def wagTail(enabled: Boolean)
}

class Mp3SoundPlayer extends BaseSoundPlayer {
  override def play: Unit = ???

  override def close: Unit = ???

  override def pause: Unit = ???

  override def stop: Unit = ???

  override def resume: Unit = ???
}


