/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eulerscala
import scala.sys.process._;

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]) {
    
    for (i <- 0 until args.length) {
      ("scalac Problem"+ args(i) + ".scala").!
      val problem = "scala -cp . eulerscala.Problem" + args(i)
      problem !
    }
    
  }

}
