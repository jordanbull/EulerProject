package eulerscala

object Problem4 {

  def main(args: Array[String]): Unit = {
    var i = 997799 //largest palindrome less than  999 * 999
    while (i > (100 * 100)) { //know this to be lowest multiple of two three digit numbers and not a palindrome
        if (isDivis(i)) {
          println(i)
          return
        }
        i = getNextPalindrome(i)
    }
    println(9009) // default case provided by instructions to be highest palindrome from two digit numbers
  }

  def getNextPalindrome(num:Int): Int = {
    var str = num.toString()
    if (str.length % 2 == 0) { // if even length
      var i = str.substring(0, str.length/2).toInt
      var l = i.toString().length
      str = (i - 1).toString()
      if (str.length == l) {
        return (str + str.reverse).toInt
      } else { //dropped a digit; now odd length
        return (str + str.substring(0, str.length-1).reverse).toInt
      }
    } else { // if odd length
      var i = str.substring(0, (str.length/2)+1).toInt
      var l = i.toString().length
      str = (i - 1).toString()
      if (str.length == l) {
        return (str + str.substring(0, str.length-1).reverse).toInt
      } else { //dropped a digit; now even length
        return (str + str.reverse).toInt
      }
    }
  }
  def isDivis(num:Long): Boolean = {
    for (i <- 2 until 999) {
      if (num % i == 0l && (num / i) <= 999)
        return true
    }
    return false
  }
}
