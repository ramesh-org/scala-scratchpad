package exception.handling

import java.io.{FileNotFoundException, FileReader, IOException}

object FileReader extends App{
  try {
    //val fileReader = new FileReader("test.txt")
    throw new IOException("Test!")
  } catch {
    case ex: FileNotFoundException =>{
      println("File not found Exception. "+ex.getMessage)
    }
    case ex: IOException => {
      println("Input /Output Exception. "+ex.getMessage)
    }
  }
}
